package org.atguigu.spring6.resourcesLoad;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Demo1 {
    @Test
    public void testResourcesLoadClassPath(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        Resource resource = applicationContext.getResource("classPathTest.txt");
        System.out.println(resource);
        //class path resource [classPathTest.txt]
    }

    @Test
    public void testResourcesLoadFileSystem(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext();
        Resource resource = applicationContext.getResource("classPathTest.txt");
        System.out.println(resource);
        //file [D:\IdeaProject\2023\Spring6\spring-resources\classPathTest.txt]
        //另外在使用ApplicationContext访问不同资源时，可以通过不同的前缀强制指定使用的ClassPathResource,FileSystemResource
        // Resource resource = applicationContext.getResource("classpath:classPathTest.txt");
        // Resource resource = applicationContext.getResource("file:classPathTest.txt");
        // Resource resource = applicationContext.getResource("https://www.baidu.com");
    }
}
