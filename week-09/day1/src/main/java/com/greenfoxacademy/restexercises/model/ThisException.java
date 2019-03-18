package com.greenfoxacademy.restexercises.model;

public class ThisException {

    private String error;

    public ThisException(){

    }

    public ThisException(String error){
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
