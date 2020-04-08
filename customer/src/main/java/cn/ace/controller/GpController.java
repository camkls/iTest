package cn.ace.controller;


import cn.ace.service.IGpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Askyi
 */
@RestController
public class GpController {

    @Autowired
    IGpService igs;


        @RequestMapping("show/{gid}/{key}")
        public String show(@PathVariable String gid , @PathVariable String key){

            String show = igs.show(gid, key);

            System.out.println(show);

            return show;

        }


}
