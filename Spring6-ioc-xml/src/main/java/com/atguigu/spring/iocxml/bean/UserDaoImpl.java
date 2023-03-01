package com.atguigu.spring.iocxml.bean;

public class UserDaoImpl implements UserDao{
    @Override
    public void run(){
        System.out.println("UserDao接口的实现类对象中的run()方法被调用");
    }
}
