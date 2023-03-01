package com.atguigu.spring.iocxml.auto.controller;

import com.atguigu.spring.iocxml.auto.sevice.UserService;
import com.atguigu.spring.iocxml.auto.sevice.UserServiceImpl;

public class UserController {
    private UserService userService;
    public void addUser(){
        System.out.println("controller方法里的方法被调用......");
        /*UserServiceImpl userService = new UserServiceImpl();
        userService.addUserService();*/
        //调用userService的方法
        userService.addUserService();
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
