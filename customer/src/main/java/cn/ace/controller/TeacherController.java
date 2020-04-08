package cn.ace.controller;

import cn.ace.service.IStudentService;
import cn.ace.service.ITeacherService;
import cn.ace.vo.Student;
import cn.ace.vo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Askyi
 */
@Controller
public class TeacherController {

    @Autowired
    ITeacherService its;
    @Autowired
    IStudentService iss;

    @GetMapping("/")
    public String index(){

        return "login";
    }

    @PostMapping("login")
    public String login(String username, String password, Model model){

        Teacher teacher = its.login(new Teacher(username,password));

        System.out.println("1");

        if (teacher!=null){
            System.out.println("2");
            return "redirect:/findAllStudent";
        }
        return "login";
    }




}
