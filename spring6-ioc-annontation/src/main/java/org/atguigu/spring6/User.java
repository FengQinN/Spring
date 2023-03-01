package org.atguigu.spring6;

import org.springframework.stereotype.Component;

@Component
public class User {
    public User() {
        System.out.println("调用构造器......");
    }
}
