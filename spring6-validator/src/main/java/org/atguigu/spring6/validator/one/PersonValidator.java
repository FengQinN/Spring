package org.atguigu.spring6.validator.one;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {

    /*表示此校验需要用在哪个类型上*/
    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    /*校验的逻辑*/
    @Override
    public void validate(Object target, Errors errors) {
        //判断name不能为空
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty","name is null");
        //判断age不小于0，不大于200
        Person p = (Person)target;
        if (p.getAge() <0 ){
            errors.rejectValue("age","age.value.error","age < 0");
        }else if(p.getAge() > 200){
            errors.rejectValue("age","age.value.max","age>200");
        }
    }
}
