package cn.ace.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author Askyi
 */

@FeignClient(name = "gp" , url = "http://web.juhe.cn:8080/finance/stock")
public interface IGpService {

    @RequestMapping("/hs")
    String show(@RequestParam("gid") String gid,@RequestParam("key") String key);



}
