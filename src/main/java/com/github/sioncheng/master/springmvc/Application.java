package com.github.sioncheng.master.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

@SpringBootApplication
@ConditionalOnWebApplication
public class Application {

    public static void main(String[] args) {
        ConfigurationClassPostProcessor configurationClassPostProcessor;
        SpringApplication.run(Application.class);
    }
}
