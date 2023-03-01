package org.atguigu.spring6.resources;

import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class ClassPathResourcesDemo {
    /*访问类路径下的资源*/

    public static void loadClassResources(String path){
        ClassPathResource classPathResource = new ClassPathResource(path);
        System.out.println(classPathResource.getFilename());
        System.out.println(classPathResource.getDescription());
        InputStream inputStream = null;
        try {
            inputStream = classPathResource.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            byte[] bytes = new byte[1024];
            while (inputStream.read(bytes) != -1){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        loadClassResources("classPathTest.txt");
    }
}
