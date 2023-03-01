package org.atguigu.spring6.validator.two;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUser {
    @Test
    public void testValidatorOne(){
        //根据配置类获取context对象
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        //获取bean对象
        MyValidator1 validator1 = context.getBean(MyValidator1.class);
        //创建User测试类
        User user = new User();
        //调用校验类的方法并传入测试类
        boolean b = validator1.validatorByUserOne(user);
        //返回结果
        System.out.println(b);
    }
    @Test
    public void testValidatorTwo(){
        ApplicationContext context = new AnnotationConfigApplicationContext(ValidatorConfig.class);
        MyValidator2 validator2 = context.getBean(MyValidator2.class);
        User user = new User();
        user.setName("蔡徐坤");
        Boolean message = validator2.validatorByUserTwo(user);
        System.out.println(message);
    }

}
