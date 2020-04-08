package cn.ace.controller;

import cn.ace.service.ITeacherService;
import cn.ace.vo.Teacher;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Askyi
 */
@RestController
public class TeacherController {

    @Resource
    ITeacherService its;

    @RequestMapping("login")
    public Teacher login(@RequestBody Teacher teacher){

        return its.login(teacher.getUsername(), teacher.getPassword());

    }


}
