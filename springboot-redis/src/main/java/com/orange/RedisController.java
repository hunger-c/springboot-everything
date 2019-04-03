package com.orange;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Z.C.Hemon on 2019/4/2 16:36.
 */
@RestController
public class RedisController {
    @Autowired
    RedisUtil redisUtil;

    @GetMapping("/indexOne")
    public String indexOne(){
        Doctor doctor=new Doctor();
        doctor.setId(1);
        doctor.setName("zc");
        doctor.setSex("0");
        redisUtil.add("a1",1L,doctor);
        System.out.println(redisUtil.get("a1"));
        return "success";
    }
}
