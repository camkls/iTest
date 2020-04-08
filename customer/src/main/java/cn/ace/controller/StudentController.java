package cn.ace.controller;

import cn.ace.service.IStudentService;
import cn.ace.vo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Askyi
 */
@Controller
public class StudentController {

    @Autowired
    IStudentService iss;

    @RequestMapping("add")
    public String add(){
        return "add";
    }

    @PostMapping("insert")
    public String  insert(Student student){

        student.setStuNum(iss.getPrimaryKey());
        student.setStuCredit(100);

        System.out.println(student);

        iss.insert(student);
        return "redirect:/findAllStudent";
    }

    @RequestMapping("/findAllStudent")
    public String findAllStudent(Model model){

        List<Student> list = iss.findAllStudent();
        System.out.println("3");
        for (Student student : list) {
            System.out.println(student);
        }

        model.addAttribute("stuList" , list);

        return "index";

    }


}
