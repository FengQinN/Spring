package com.atguigu.spring.iocxml.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestOrder {
    /*单实例对象测试，即只创建了一个对象*/
    @Test
    public void  test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        Orders orders2 = context.getBean("orders", Orders.class);
        System.out.println(orders2);
    }
    /*多实例对象测试*/
    @Test
    public void  test2(){
        /*地址不一样*/
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-scope.xml");
        Orders orders = context.getBean("orders2", Orders.class);
        System.out.println(orders);
        Orders orders2 = context.getBean("orders2", Orders.class);
        System.out.println(orders2);
    }
}
