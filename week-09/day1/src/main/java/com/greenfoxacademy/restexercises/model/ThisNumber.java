package com.greenfoxacademy.restexercises.model;

public class ThisNumber {

    private Integer until;
    private Integer result;

    public ThisNumber(){

    }

    public ThisNumber(Integer until) {
        this.until = until;
    }

    public Integer getUntil() {
        return until;
    }

    public void setUntil(Integer until) {
        this.until = until;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }


    public void sum(){
        Integer summa = 0;
        for (int i = 1; i < until + 1; i++) {
            summa = summa + i;
        }
        setResult(summa);
    }

    public void factor(){
        Integer fact= 1;
        for (int i = 1; i < until + 1; i++) {
            fact = fact * i;
        }
        setResult(fact);
    }
}
