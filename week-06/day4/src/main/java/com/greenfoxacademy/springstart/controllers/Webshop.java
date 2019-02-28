package com.greenfoxacademy.springstart.controllers;


import com.greenfoxacademy.springstart.model.ShopItem;
import com.greenfoxacademy.springstart.model.ShopItemsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Webshop {

    ShopItemsList items = new ShopItemsList();

    @RequestMapping(value ="/webshop")
    public String webshop(Model model){

        model.addAttribute("items", items.getShopItemsList());

        return "webshop";
    }

}
