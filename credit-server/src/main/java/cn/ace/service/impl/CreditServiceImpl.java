package cn.ace.service.impl;

import cn.ace.dao.ICreditDAO;
import cn.ace.service.ICreditService;
import cn.ace.vo.Credit;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Askyi
 */
@Service
public class CreditServiceImpl implements ICreditService {

    @Resource
    ICreditDAO icd;

    @Override
    public List<Credit> creditDetails(int stuId) {
        return icd.creditDetails(stuId);
    }

    @Override
    public void penalties(Credit credit) {
        icd.penalties(credit);
    }
}
