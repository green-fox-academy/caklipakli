package com.greenfoxacademy.restexercises.model;

import java.util.List;

public class LogList {

    private List<Log>entries;
    private Integer entry_count;

    public LogList(){

    }

    public LogList(List<Log> entries){
        this.entries = entries;
        this.entry_count = entries.size();
    }
}
