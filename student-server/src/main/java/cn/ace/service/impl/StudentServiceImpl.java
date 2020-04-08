package cn.ace.service.impl;

import cn.ace.dao.IStudentDAO;
import cn.ace.service.IStudentService;
import cn.ace.vo.Student;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Askyi
 */

@Service
public class StudentServiceImpl implements IStudentService {

    @Resource
    IStudentDAO isd;

    @Override
    public List<Student> findAllStudent() {
        return isd.findAllStudent();
    }

    @Override
    public Student findStudentById(Student student) {
        return isd.findStudentById(student);
    }

    @Override
    public void insert(Student student) {
        isd.insert(student);
    }

    @Override
    public String getPrimaryKey() {
        return isd.getPrimaryKey();
    }
}
