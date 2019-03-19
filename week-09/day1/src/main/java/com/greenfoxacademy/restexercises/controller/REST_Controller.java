package com.greenfoxacademy.restexercises.controller;

import com.greenfoxacademy.restexercises.model.*;
import com.greenfoxacademy.restexercises.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class REST_Controller {

    private LogService logService;

    @Autowired
    public REST_Controller(LogService logService){
        this.logService = logService;
    }

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
    public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) ThisNumber until) {
        if (until.equals(null)) {
            return new ThisException("Please provide a number!");
        } else if (action.equals("sum")) {
            until.sum();
            return until;
        } else if (action.equals("factor")) {
            until.factor();
            return until;
        } else {
            return new ThisException("No such an endpoint");
        }
    }

    @RequestMapping(path="/arrays", method = RequestMethod.POST)
    public Object arrayHandler(@RequestBody(required = false) ArrayHandler whatToDo){
        if (whatToDo.getWhat().equals(null) || whatToDo.getNumbers().equals(null)){
            return new ThisException("Please provide what to do with the numbers!");
        } else {
            whatToDo.setResult();
        }
        return whatToDo;
    }


}
