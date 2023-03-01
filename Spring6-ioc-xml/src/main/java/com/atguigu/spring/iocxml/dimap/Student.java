package com.atguigu.spring.iocxml.dimap;

import java.util.List;
import java.util.Map;

public class Student {
    private String sId;
    private String sName;
    private Map<String,Teacher> teacherMap;

    private List<Lesson> lessonList;

    public List<Lesson> getLessonList() {
        return lessonList;
    }

    public void setLessonList(List<Lesson> lessonList) {
        this.lessonList = lessonList;
    }

    public Map<String, Teacher> getTeacherMap() {
        return teacherMap;
    }

    public void setTeacherMap(Map<String, Teacher> teacherMap) {
        this.teacherMap = teacherMap;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    /*输出测试方法*/
    public void run(){
        System.out.println("学生编号："+sId+"、学生姓名:"+sName);
        System.out.println(teacherMap);
        System.out.println(lessonList);
    }
}
