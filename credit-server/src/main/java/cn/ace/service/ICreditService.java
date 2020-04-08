package cn.ace.service;

import cn.ace.vo.Credit;

import java.util.List;

/**
 * @author Askyi
 */
public interface ICreditService {

    /**
     * 扣分详情
     * @param stuId 学生ID
     * @return 扣分对象
     */
    List<Credit> creditDetails(int stuId);

    /**
     *  扣分
     * @param credit 扣分情况
     */
    void penalties(Credit credit);

}
