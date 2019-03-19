package com.greenfoxacademy.restexercises.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date createdAt;
    private String endpoint;
    private String data;

    public Log(){
        this.createdAt = new Date();
    }

    public Log(String endpoint, String data) {
        this.endpoint = endpoint;
        this.createdAt = new Date();
        this.data = data;
    }
}
