package cn.ace.dao;

import cn.ace.vo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Askyi
 */
@Mapper
public interface ITeacherDao {

    /**
     * 登陆
     * @param username 用户名
     * @param password 密码
     * @return Teacher对象
     */
    Teacher login(@Param("username")String username , @Param("password")String password);

}
