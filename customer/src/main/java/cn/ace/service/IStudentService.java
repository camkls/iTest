package cn.ace.service;

import cn.ace.vo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Askyi
 */
@FeignClient(value = "STUDENTSERVER")
public interface IStudentService {

    /**
     *  查询所有的学生信息
     * @return student集合
     */
    @RequestMapping("findAllStudent")
    List<Student> findAllStudent();

    /**
     * 添加学生
     * @param student 学生对象
     */
    @PostMapping("insert")
    void insert(@RequestBody Student student);

    /**
     *  根据id查找学生信息
     * @param student 学生信息
     * @return 学生信息
     */
    @RequestMapping("findStudentById")
    Student findStudentById(@RequestBody Student student);

    /**
     * 获取学号
     * @return 学号
     */
    @RequestMapping("getPK")
    String getPrimaryKey();


}
