package cn.ace.controller;

import cn.ace.service.ICreditService;
import cn.ace.service.IStudentService;
import cn.ace.vo.Credit;
import cn.ace.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Askyi
 */
@Controller
public class CreditController {

    @Autowired
    ICreditService ics;

    @Autowired
    IStudentService iss;

    @RequestMapping("details/{stuId}")
    public String creditDetails(@PathVariable int stuId, Model model){

        List<Credit> credits = ics.creditDetails(new Student(stuId));

        Student student = iss.findStudentById(new Student(stuId));

        System.out.println("[student]"+student);

        model.addAttribute("stu", student);
        model.addAttribute("credit", credits);

        return "details";
    }

    @RequestMapping("penalties/{stuId}")
    public String penalties(@PathVariable int stuId, Model model){

        System.out.println("stuId--"+stuId);

        Student student = iss.findStudentById(new Student(stuId));

        model.addAttribute("stu", student);

        return "penalties";
    }

    @PostMapping("doPenalties/{stuId}")
    public String doPenalties(@PathVariable int stuId, Credit credit){

        SimpleDateFormat fmt=new SimpleDateFormat("yyyy-MM-dd");

        java.util.Date date = fmt.parse(fmt.format(new Date()), new ParsePosition(0));

        credit.setStuId(stuId);
        credit.setCreDate(date);

        System.out.println("credit:>>>"+credit);

        ics.doPenalties(credit);

        return "redirect:/details/8";
    }

}
