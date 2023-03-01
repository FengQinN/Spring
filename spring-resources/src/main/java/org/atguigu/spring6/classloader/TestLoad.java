package org.atguigu.spring6.classloader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class TestLoad {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);//获取ResourcesLoader
        Loader loader = context.getBean("loader", Loader.class);//获取bean对象
        ResourceLoader resourceLoader = loader.getResourceLoader();//根据bean对象获取ResourcesLoader
        System.out.println(resourceLoader == context);
    }
}
