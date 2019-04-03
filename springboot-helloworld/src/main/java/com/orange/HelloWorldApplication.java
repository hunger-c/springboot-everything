package com.orange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Z.C.Hemon on 2019/4/1 23:09.
 */
@RestController
@SpringBootApplication
public class HelloWorldApplication {

    @GetMapping("/index")
    public String getIndex(){
        return "Hello Srping Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}
