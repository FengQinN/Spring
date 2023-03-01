package com.atguigu.spring.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }
    @Test
    public void test2(){
        ApplicationContext context2 = new ClassPathXmlApplicationContext("bean-di.xml");
        Book book2 = context2.getBean("book2", Book.class);
        System.out.println(book2);
    }
}
