package com.atguigu.spring.iocxml.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserDao {
    @Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //根据类型获取接口对应bean对象
        UserDao bean = context.getBean(UserDao.class);
        System.out.println(bean);
        bean.run();
    }
}
