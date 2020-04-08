package cn.ace.dao;

import cn.ace.vo.Credit;
import cn.ace.vo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Askyi
 */
@Mapper
public interface ICreditDAO {
    /**
     * 扣分详情
     * @param stuId 学生ID
     * @return 扣分对象
     */
    List<Credit> creditDetails(@Param("stuId") int stuId);

    /**
     *  扣分
     * @param credit 扣分情况
     */
    void penalties(Credit credit);

}
