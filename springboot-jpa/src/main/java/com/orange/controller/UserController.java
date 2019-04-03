package com.orange.controller;

import com.orange.dao.DeptRepository;
import com.orange.dao.UserRepository;
import com.orange.entity.Dept;
import com.orange.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by Z.C.Hemon on 2019/4/2 11:18.
 */
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    DeptRepository deptRepository;

    @GetMapping("/initUser")
    public String initUserData(){
//        userRepository.deleteAll();
        Dept dept=new Dept();
        dept.setName("java开发");
        deptRepository.save(dept);

        User user=new User();
        user.setName("zhan");
        user.setAccout("dachengzi1994");
        user.setNickName("橙子");
        user.setPassWord("1234567890");
        user.setDept(dept);
        userRepository.save(user);
        return "success";
    }

    @GetMapping("/findUser")
    public String findUserPage(){
        Pageable pageable=new PageRequest(0,10,new Sort(Sort.Direction.ASC,"id"));
        Page<User> page=userRepository.findAll(pageable);
        for (User user:page.getContent()){
            System.out.println(user.getId()+","+
                    user.getName()+","+user.getNickName()+","+user.getPassWord()+","+user.getDept().getName());
        }
        return "success";
    }

}
