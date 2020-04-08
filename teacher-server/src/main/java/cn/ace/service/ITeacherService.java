package cn.ace.service;

import cn.ace.vo.Teacher;

/**
 * @author Askyi
 */
public interface ITeacherService {

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return Teacher对象
     */
    Teacher login(String username , String password);

}
