package com.greenfoxacademy.restexercises.model;

public class DoubleNumber {

    private Integer received;
    private Integer result;
    private String error;

    public DoubleNumber(){
        this.error = "Please provide input";
    }

    public DoubleNumber(Integer received){
        this.received = received;
        this.result = received * 2;
        this.error = "Please provide input";
    }

    public Integer getReceived() {
        return received;
    }

    public void setReceived(Integer received) {
        this.received = received;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
