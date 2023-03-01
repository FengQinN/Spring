package com.atguigu.spring.iocxml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        /*获取bean对象的方式一*/
        User user = (User)context.getBean("user");
        System.out.println(user);
        /*获取bean对象的方式二*/
        User user1 = context.getBean(User.class);
        System.out.println(user1);
        /*获取bean对象的方式三*/
        User user2 = context.getBean("user", User.class);
        System.out.println(user2);
    }
}
