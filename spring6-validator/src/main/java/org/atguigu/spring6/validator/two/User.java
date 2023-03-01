package org.atguigu.spring6.validator.two;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class User {

    //@NotNull表示此属性不能为NULL
    @NotNull
    private String name;

    //@Max表示此属性不大于200，即<200
    //@Min表示此属性不小于0,即>0
    @Max(200)
    @Min(0)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
