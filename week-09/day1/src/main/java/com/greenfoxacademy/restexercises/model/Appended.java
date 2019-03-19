package com.greenfoxacademy.restexercises.model;

public class Appended {
    private String appended;

    public Appended(){

    }

    public Appended(String append) {
        this.appended = append + "a";
    }

    public String getAppended() {
        return appended;
    }

    public void setAppended(String append) {
        this.appended = append + "a";
    }
}
