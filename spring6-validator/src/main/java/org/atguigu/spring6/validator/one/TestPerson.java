package org.atguigu.spring6.validator.one;

import org.springframework.validation.DataBinder;

/*测试*/
public class TestPerson {
    public static void main(String[] args) {
        //1.创建person对象
        Person person = new Person();
        person.setName("小鸡巴");
        person.setAge(-8);
        //创建person对象的DataBinder
        DataBinder dataBinder = new DataBinder(person);
        //设置校验器
        dataBinder.setValidator(new PersonValidator());
        //调用方法执行校验
        dataBinder.validate();
        //输出校验结果
        System.out.println(dataBinder.getBindingResult());
    }
}
