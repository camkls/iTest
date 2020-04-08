package cn.ace.controller;

import cn.ace.service.ICreditService;
import cn.ace.vo.Credit;
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
public class CreditController {

    @Resource
    ICreditService ics;


    @RequestMapping("details")
    public List<Credit> creditDetails(@RequestBody Student student){
        return ics.creditDetails(student.getStuId());
    }

    @PostMapping("penalties")
    public void  penalties(@RequestBody Credit credit){

        ics.penalties(credit);

    }

}
