package com.greenfoxacademy.springstart.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.stream.Stream;

@Controller
public class SayDifferentHelloWorldApp {

    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag",
            "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom",
            "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit",
            "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
            "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam",
            "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    String[] colors = {"Red", "Blue", "Green", "Yellow", "Pink", "Navy", "Lime", "Cyan", "Crimson", "Tomato", "Chocolate",
            "BlueViolet", "Coral", "Gray", "Khaki"};

    @RequestMapping("/web/sayhello")
    public String sayhello(Model model){

        int i = (int)(Math.random()* hellos.length);
        int size = (int)(30 + Math.random()* 40);
        int n = (int)(Math.random()* colors.length);

        model.addAttribute("hello", hellos[i]);
        model.addAttribute("Color", colors[n]);
        model.addAttribute("size", size);
        model.addAttribute("hellos", hellos);

        return "sayhello";
    }


}
