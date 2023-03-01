package com.atguigu.spring.iocxml.life;

public class User {
    private String name;

    public User() {
        System.out.println("无参数构造被调用");
    }
    /*初始化方法*/
    public void initMethod(){
        System.out.println("bean对象初始化调用指定的初始化方法");
    }
    /*销毁的方法*/
    public void destroyMethod(){
        System.out.println("bean对象销毁调用指定的销毁方法");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set方法被调用");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
