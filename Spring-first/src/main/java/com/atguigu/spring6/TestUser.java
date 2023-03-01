package com.atguigu.spring6;



import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {
    /*写入日志*/
    private Logger logger = LoggerFactory.getLogger(TestUser.class);
    @Test
    public void testUserObject(){
        /*加载Spring的配置文件，进行对象的创建*/
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        /*获取创建的对象,通过id获取对象，底层是使用键值对进行存储的，value是类的定义信息*/
        User user = (User) context.getBean("user");
        System.out.println(user);
        /*调用获取的对象的方式进行测试*/
        user.add();
        logger.info("写入日志成功");
    }
}
