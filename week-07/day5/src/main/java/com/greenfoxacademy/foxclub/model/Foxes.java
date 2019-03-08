package com.greenfoxacademy.foxclub.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Foxes {

    private List<Fox> foxes = new ArrayList<>();

    public Foxes(){

        Tricks tricks = new Tricks();
        foxes.add(new Fox("VÚK", "pizza", "limonade", tricks));
        foxes.add(new Fox("Karak"));
        foxes.add(new Fox("Íny"));
        foxes.add(new Fox("Kag"));
        foxes.add(new Fox("Csele"));
    }

    public void addFox(String name){
        foxes.add(new Fox(name));
    }

    public Fox findFox(String name){

        for (Fox fox : foxes) {
            if (fox.getName().equals(name)){
                return fox;
            }
        }
        return new Fox("No such a fox");
    }
}
