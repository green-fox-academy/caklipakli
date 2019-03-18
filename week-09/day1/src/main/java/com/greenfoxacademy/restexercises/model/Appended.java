package com.greenfoxacademy.restexercises.model;

public class Appended {
    private String appended;

    public Appended(){

    }

    public Appended(String appended) {
        this.appended = appended + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String appended) {
        this.appended = appended + "a";
    }
}
