package org.atguigu.spring6.validator.two;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

@Component
public class MyValidator1 {
    //原生校验器
    @Autowired
    //自动注入，由配置类中的方法生成的对象注入
    private Validator validator;

    public boolean validatorByUserOne(User user){
        Set<ConstraintViolation<User>> validate = validator.validate(user);
        return validate.isEmpty();
    }
}
