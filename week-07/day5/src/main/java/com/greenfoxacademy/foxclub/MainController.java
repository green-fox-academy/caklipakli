package com.greenfoxacademy.foxclub;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping(value="/index")
        public String index(){

        return "index";
    }

    @GetMapping(value="/login")
    public String loginPage(Model model, @ModelAttribute("name") String name){
        model.addAttribute("name", name);
        return "login";
    }
    @PostMapping(value="/login")
        public String login(Model model, @RequestParam("name") String name){
        model.addAttribute("name", name);
        return "redirect:/index";
    }

}
