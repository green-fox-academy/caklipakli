package com.greenfoxacademy.restexercises.model;

import java.util.Arrays;

public class ArrayHandler {

    private String what;
    private int[] numbers;
    private Object result;

    public ArrayHandler(){
    }

    public ArrayHandler(String what, int[] numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(){

        if(this.what.equals("sum")){
            this.result = Arrays.stream(numbers).sum();
        } else if (what.equals("multiply")) {
            this.result = Arrays.stream(numbers).reduce(1, (n1, n2) -> n1 * n2);
        } else if (what.equals("double")) {
            this.result = Arrays.stream(numbers)
                    .map(n -> 2 * n)
                    .toArray();
        }
    }
}
