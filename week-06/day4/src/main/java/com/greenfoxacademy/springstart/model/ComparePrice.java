package com.greenfoxacademy.springstart.model;

import java.util.Comparator;

public class ComparePrice implements Comparator<ShopItem> {
    @Override
    public int compare(ShopItem o1, ShopItem o2) {

        if (o1.getPrice() < o2.getPrice()) return -1;
        if (o1.getPrice() > o2.getPrice()) return 1;
        else return 0;
    }
}
