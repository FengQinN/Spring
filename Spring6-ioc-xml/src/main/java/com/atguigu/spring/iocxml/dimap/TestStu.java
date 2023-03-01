package com.atguigu.spring.iocxml.dimap;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStu {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-dimap.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
    }
    @Test
    public void  test2(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student", Student.class);
        student.run();
    }
    /*使用p空间对属性进行赋值*/
    @Test
    public void  test3(){
        ApplicationContext context =new ClassPathXmlApplicationContext("bean-diref.xml");
        Student student = context.getBean("student2", Student.class);
        student.run();
    }
}
