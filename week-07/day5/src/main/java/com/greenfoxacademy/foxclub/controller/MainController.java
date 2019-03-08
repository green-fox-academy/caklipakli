package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.model.Foxes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
    private Foxes foxes;

    @Autowired
    MainController(Foxes foxes){
        this.foxes = foxes;
    }
/*
    @RequestMapping(value="/index")
        public String index(){

        return "index";
    }*/

    @GetMapping(value="/index")
    public String loadMain(Model model, @RequestParam(value = "name", required = false, defaultValue = "VÚK") String name) {
        model.addAttribute("fox", foxes.findFox(name));
        return "index";
    }

    @GetMapping(value="/login")
    public String loginPage(Model model, @ModelAttribute("name") String name){
        model.addAttribute("name", name);
        return "login";
    }
    @PostMapping(value="/login")
        public String login(Model model, @RequestParam("name") String name){

        if (foxes.findFox(name).equals("No such a fox") ) {
            System.out.println("There is no such a fox.");
            return "redirect:/login";

        } else {
            model.addAttribute("name", name);
            return "redirect:/index";
        }
    }
}
