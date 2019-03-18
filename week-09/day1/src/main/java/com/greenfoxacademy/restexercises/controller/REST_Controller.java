package com.greenfoxacademy.restexercises.controller;

import com.greenfoxacademy.restexercises.model.Appended;
import com.greenfoxacademy.restexercises.model.DoubleNumber;
import com.greenfoxacademy.restexercises.model.ThisException;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Object greeter(@RequestParam(value="name", required = false) String name,
                          @RequestParam(value="title", required = false) String title){

        if ((name==null) && (title==null)){
            return new ThisException("Please provide a name and a title!");
        } else if (name == null) {
            return new ThisException("Please provide a name!");
        } else if (title == null){
            return new ThisException("Please provide a title!");
        }

        User user = new User(name, title);
        return user;
    }

    @RequestMapping("/appenda/{appendable}")
    public Object appenda(@PathVariable("appendable") String appendable){
            Appended append = new Appended(appendable);
            return append;

    }

    @RequestMapping("/appenda")
    public String appendaError(){
        return "404";
    }
}
