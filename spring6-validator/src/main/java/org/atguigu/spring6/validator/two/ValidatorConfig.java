package org.atguigu.spring6.validator.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan("org.atguigu.spring6.validator.two")
public class ValidatorConfig {
    @Bean
    //调用此方法获取Bean对象，并将此对象交给IOC容器进行管理
    public LocalValidatorFactoryBean getValidatorFactoryBean(){
        return new LocalValidatorFactoryBean();
    }
}
