package org.atguigu.spring6.junit.junit4;

import org.junit.Test;//导入的包不同！！！
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean.xml")
public class TestSpringJunit4 {
    @Autowired
    private User user;

    @Test
    public void test(){
        System.out.println(user);
        user.run();
        /*Failed to load ApplicationContext*/
    }

}
