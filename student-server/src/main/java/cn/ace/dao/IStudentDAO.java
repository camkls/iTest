package cn.ace.dao;

import cn.ace.vo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Askyi
 */

@Mapper
public interface IStudentDAO {

    /**
     * 登陆
     * @return Student集合
     */
    List<Student> findAllStudent();

    /**
     * 根据id查找学生信息
     * @param student 学生信息
     * @return 学生信息
     */
    Student findStudentById(Student student);

    /**
     * 添加学生信息
     * @param student 学生信息
     */
    void insert(Student student);

    /**
     * 获取学号
     * @return 学号
     */
    String getPrimaryKey();


}
