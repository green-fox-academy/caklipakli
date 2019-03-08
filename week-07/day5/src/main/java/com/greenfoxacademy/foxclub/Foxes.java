package com.greenfoxacademy.foxclub;

import java.util.ArrayList;
import java.util.List;

public class Foxes {

    private List<Fox> foxes = new ArrayList<>();

    public Foxes(){

        foxes.add(new Fox("VÚK"));
        foxes.add(new Fox("Karak"));
        foxes.add(new Fox("Íny"));
        foxes.add(new Fox("Kag"));
        foxes.add(new Fox("Csele"));
    }

    public void addFox(String name){
        foxes.add(new Fox(name));
    }

}
