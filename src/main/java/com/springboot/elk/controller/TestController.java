package com.springboot.elk.controller;

import com.springboot.elk.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/{name}")
    public String hi(@PathVariable(value = "name") String name) {
        logger.info( "name = {}" , name );
        return "hi , " + name;
    }
    @GetMapping("/addUser")
    public User addUser(){
    User user = new User();
    user.setUserId(111);
    user.setName("奥特曼");
    logger.info("user={}", user.toString());
    return user;
    }
}
