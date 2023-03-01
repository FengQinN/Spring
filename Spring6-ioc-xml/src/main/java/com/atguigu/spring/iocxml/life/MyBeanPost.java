package com.atguigu.spring.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
    /*需要注意的是，bean的后置处理器并不是单独针对某个bean对象，而是针对IOC容器内的所有bean对象都执行*/
    /*初始化之前调用*/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后置处理器初始化之前被调用");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    /*初始化之后调用*/
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("bean后置处理器初始化之后被调用");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
