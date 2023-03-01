package com.atguigu.spring.iocxml.ditest;

import java.util.List;

/*部门类*/
public class Dept {
    private String deptName;
    private List<Emp> empList;
    public Dept() {
    }
    public Dept(List<Emp> empList, String deptName) {
        this.empList = empList;
        this.deptName = deptName;
    }
    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void info(){
        System.out.println("所在部门:" + deptName);
        for (Emp emp:empList){
            System.out.println(emp.getEmpName());
        }
    }

    @Override
    public String toString() {
        return "Dept{" +
                "empList=" + empList +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
