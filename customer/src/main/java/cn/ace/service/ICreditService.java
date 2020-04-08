package cn.ace.service;

import cn.ace.vo.Credit;
import cn.ace.vo.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Askyi
 */
@FeignClient(value = "CREDITSERVER")
public interface ICreditService {


    /**
     * 扣分详情
     * @param student 学生对象
     * @return 扣分详情对象
     */
    @RequestMapping("details")
    List<Credit> creditDetails(@RequestBody Student student);

    /**
     *  扣分
     * @param credit 扣分信息
     */
    @PostMapping("penalties")
    void doPenalties(@RequestBody Credit credit);


}
