package com.greenfoxacademy.restexercises.controller;

import com.greenfoxacademy.restexercises.model.DoubleNumber;
import com.greenfoxacademy.restexercises.model.ThisException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST_Controller {

    @RequestMapping("/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input){

        if (input==null){
            return new ThisException("Please provide an input!");
        }
        DoubleNumber number = new DoubleNumber(input);
        return number;
    }

    @RequestMapping("/greeter")
    public Object greeter(@RequestParam("name") String name, @RequestParam("title") String title){

    }
}
