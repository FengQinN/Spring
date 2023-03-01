package org.atguigu.spring6.junit.junit5;

import org.junit.jupiter.api.Test;//导入的包不同！！！
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean.xml")
public class TestUser {
    @Autowired
    private User user;
    /*测试方法*/
    @Test
    public void test(){
        System.out.println(user);
        user.run();
    }
}
