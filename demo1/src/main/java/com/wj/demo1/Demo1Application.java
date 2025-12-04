package com.wj.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {
        // start the projects
        // haha
        // 1111
        SpringApplication.run(Demo1Application.class, args);
    }

    void test(){
        int a = 1;
        int b = 2;
        System.out.println(a+b);
    }

    void test1(){
        int a = 1;
        int b = 1;
        System.out.println(a+b);
    }

    void test2(){
        System.out.println("2");
        System.out.println("3");
    }


}
