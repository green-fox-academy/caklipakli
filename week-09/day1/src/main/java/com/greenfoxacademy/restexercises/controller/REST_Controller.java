package com.greenfoxacademy.restexercises.controller;

import com.greenfoxacademy.restexercises.model.Appended;
import com.greenfoxacademy.restexercises.model.DoubleNumber;
import com.greenfoxacademy.restexercises.model.ThisException;
import com.greenfoxacademy.restexercises.model.ThisNumber;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path="/dountil/{action}", method= RequestMethod.POST)
    public Object doUntil(@PathVariable("action") String action, @RequestParam(value="until", required = false) Integer until) {
        if (until.equals(null)) {
            return new ThisException("Please provide a number!");
        } else if (action.equals("sum")) {
            ThisNumber number = new ThisNumber(until);
            number.sum();
            return number;
        } else if (action.equals("factor")) {
            ThisNumber number = new ThisNumber(until);
            number.factor();
            return number;
        } else {
            return new ThisException("No such an endpoint");
        }
    }
}
