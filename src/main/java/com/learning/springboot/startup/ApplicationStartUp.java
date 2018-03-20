package com.learning.springboot.startup;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages ="com.learning.springboot")
public class ApplicationStartUp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationStartUp.class, args);
    }
}
