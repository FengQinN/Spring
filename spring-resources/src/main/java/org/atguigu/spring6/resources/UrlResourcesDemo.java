package org.atguigu.spring6.resources;

import org.junit.jupiter.api.Test;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

public class UrlResourcesDemo {
    /*演示UrlResources访问网络资源*/
    /*访问前缀是http的资源*/
   /* public static void main(String[] args) {
        String path = "https://www.baidu.com/";
//        loadUrlResources(path);
        loadUrlResources("file:test.txt");//默认在根路径下读取，如果不写file会报错
    }*/
    /*传入地址参数*/
    public static void loadUrlResources(String path) {
        /*1.创建Resources接口的实现类*/
        UrlResource urlResource = null;
        try {
            urlResource = new UrlResource(path);
            /*2.获取资源的相关信息*/
            System.out.println(urlResource.getFilename());
            System.out.println(urlResource.getURL());
            System.out.println(urlResource.getDescription());
            System.out.println(urlResource.getInputStream().read());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
