package cn.ace.service.impl;

import cn.ace.dao.ITeacherDao;
import cn.ace.service.ITeacherService;
import cn.ace.vo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Askyi
 */
@Service
public class TeacherServiceImpl implements ITeacherService {

    @Resource
    ITeacherDao itd;

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return Teacher对象
     */
    @Override
    public Teacher login(String username, String password) {
        return itd.login(username , password);
    }
}
