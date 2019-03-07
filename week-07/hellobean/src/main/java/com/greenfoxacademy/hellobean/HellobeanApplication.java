package com.greenfoxacademy.hellobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HellobeanApplication implements CommandLineRunner {

    private MyColor color;

    /*@Autowired
    HellobeanApplication(Printer printer){
        this.printer = printer;
    }*/

    @Autowired
    HellobeanApplication(MyColor color){
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(HellobeanApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        color.printColor();
    }
}
