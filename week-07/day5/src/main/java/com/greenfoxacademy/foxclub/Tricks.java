package com.greenfoxacademy.foxclub;

import java.util.ArrayList;
import java.util.List;

public class Tricks {

    private List<String> tricks = new ArrayList<>();

    public Tricks(){

        tricks.add("write HTML");
        tricks.add("code JAVA");
    }

    public List<String> getTricks(){
        return tricks;
    }

    public void addTricktoTricks(String trick){
        tricks.add(trick);
    }

}
