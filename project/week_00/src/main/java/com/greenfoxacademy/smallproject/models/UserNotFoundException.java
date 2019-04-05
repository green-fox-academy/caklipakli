package com.greenfoxacademy.smallproject.models;

public class UserNotFoundException extends Exception {


    public UserNotFoundException(String errormessage) {
        super(errormessage);
    }

}
