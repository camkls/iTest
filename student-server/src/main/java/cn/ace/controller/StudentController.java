package cn.ace.controller;

import cn.ace.service.IStudentService;
import cn.ace.vo.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Askyi
 */
@RestController
public class StudentController {

    @Resource
    IStudentService iss;

    @RequestMapping("findAllStudent")
    public List<Student> findAllStudent(){

        List<Student> list = iss.findAllStudent();

        for (Student student : list) {
            System.out.println(student);
        }
        return iss.findAllStudent();
    }

    @RequestMapping("findStudentById")
    public Student findStudentById(@RequestBody Student student){

        Student stu = iss.findStudentById(student);
        System.out.println("stu"+stu);
        return iss.findStudentById(student);
    }

    @PostMapping("insert")
    public void insert(@RequestBody Student student){
        iss.insert(student);
    }

    @RequestMapping("getPK")
    public String getPrimaryKey(){
        return iss.getPrimaryKey();
    }

}
