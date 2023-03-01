package org.atguigu.spring6.resources;

import org.springframework.core.io.FileSystemResource;

import java.io.IOException;
import java.io.InputStream;

public class FileSystemResourcesDemo {
    /*访问系统中的资源*/
    public  static void testFileSystemResources(String path){
        FileSystemResource fileSystemResource = new FileSystemResource(path);
        System.out.println(fileSystemResource.getFilename());
        System.out.println(fileSystemResource.getDescription());
        try {
            InputStream inputStream = fileSystemResource.getInputStream();
            byte[] bytes = new byte[4096];
            while(inputStream.read(bytes) != -1){
                System.out.println(new String(bytes));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /*在mian方法中测试*/
    public static void main(String[] args) {
        String path = "D:\\IdeaProject\\2023\\Spring6\\test.txt";
        testFileSystemResources(path);
    }
}
