package cn.ace.service;

import cn.ace.vo.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Askyi
 */
@FeignClient(value = "TEACHERSERVER")
public interface ITeacherService {

    /**
     *  登陆
     * @param teacher Teacher对象
     * @return Teacher对象
     */
    @RequestMapping("login")
    Teacher login(@RequestBody Teacher teacher);
}
