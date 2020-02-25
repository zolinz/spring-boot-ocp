package com.zoli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

    public static void main(String[] args) {
        System.out.println("hello zolikam");
        SpringApplication.run(MyApplication.class, args);
    }
}
