package com.greenfoxacademy.springstart.controllers;


import com.greenfoxacademy.springstart.model.ShopItem;
import com.greenfoxacademy.springstart.model.ShopItemsList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;


@Controller
public class Webshop {

    ShopItemsList items = new ShopItemsList();

    @RequestMapping(value ="/webshop")
    public String webshop(Model model){

        model.addAttribute("items", items.getShopItemsList());

        return "webshop";
    }


    @RequestMapping(value ="/webshop/only-available")
    public String onlyAvailable(Model model){

        List<ShopItem> avilable = items.getShopItemsList().stream()
                .filter(quantity -> quantity.getQuantity() > 0)
                .collect(Collectors.toList());

        model.addAttribute("items", avilable);

        return "webshop";
    }


    @RequestMapping(value ="/webshop/cheapest")
    public String cheapest(Model model){

        List<ShopItem> sortedItems = items.getShopItemsList().stream()
                .sorted()
                .collect(Collectors.toList());

        model.addAttribute("items", sortedItems);

        return "webshop";
    }

    @RequestMapping(value ="/webshop/expensive")
    public String expensive(Model model){

        List<ShopItem> expensive = items.getShopItemsList().stream()
                .filter(quantity -> quantity.getQuantity() > 0)
                .sorted((a, b) -> a.getPrice() > b.getPrice() ? -1 : 1)
                .limit(1)
                .collect(Collectors.toList());

        model.addAttribute("items", expensive);

        return "webshop";
    }

    @RequestMapping(value ="/webshop/nike")
    public String nike(Model model){

        List<ShopItem> expensive = items.getShopItemsList().stream()
                .filter(nike -> nike.getDescription().toLowerCase().contains("nike")
                             || nike.getName().toLowerCase().contains("key"))
                .collect(Collectors.toList());

        model.addAttribute("items", expensive);

        return "webshop";
    }

    @RequestMapping(value ="/webshop/average")
    public String average(Model model) {

        OptionalDouble average = items.getShopItemsList().stream()
                .mapToDouble(n -> (double) n.getQuantity())
                .average();

        model.addAttribute("average", average.getAsDouble());
        return "averageStock";
    }

    @RequestMapping(value ="/webshop/search")
    public String search(Model model, @RequestParam("key") String key){

        List<ShopItem> results = items.getShopItemsList().stream()
                .filter(s -> s.getDescription().toLowerCase().contains(key) || s.getName().toLowerCase().contains(key))
                .collect(Collectors.toList());

        model.addAttribute("items", results);

        return "webshop";
    }

}
