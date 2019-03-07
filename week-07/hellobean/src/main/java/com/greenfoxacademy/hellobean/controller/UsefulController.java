package com.greenfoxacademy.hellobean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsefulController {

    private UtilityService service;

    @Autowired
    UsefulController(UtilityService service){
        this.service = service;
    }

    @RequestMapping(value = "/useful")
    public String useful(Model model){

        System.out.println("Random colored background");
        System.out.println("sg else");
        return "/useful";
    }

    @RequestMapping(value="/useful/colored")
    public String colored(Model model){
                model.addAttribute("color", service.randomColor());
        return "colored";
    }

}
