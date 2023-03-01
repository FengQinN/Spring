package com.atguigu.spring.iocxml.ditest;

import java.util.Arrays;

public class Emp {
    private String empName;
    private Integer age;
    private Dept dept;//对象类型的属性

    private String[] loves;
    public String[] getLoves() {
        return loves;
    }

    public void setLoves(String[] loves) {
        this.loves = loves;
    }

    public void work(){
        System.out.println(empName + "员工正在工作......");
        dept.info();
        System.out.println(Arrays.toString(loves));
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

}
