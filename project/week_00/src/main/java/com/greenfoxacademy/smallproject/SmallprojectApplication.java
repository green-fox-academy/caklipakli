package com.greenfoxacademy.smallproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SecurityConfig.class})
public class SmallprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallprojectApplication.class, args);
    }

}
