package com.greenfoxacademy.todomysql.model;

import javax.persistence.*;

@Entity
@Table(name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private boolean urgent;
    private boolean done;

    public Todo(){
        this.urgent = false;
        this.done = false;
    }

    public Todo(String title){
        this.title = title;
        this.urgent = false;
        this.done = false;

    }


    public Todo(String title, boolean urgent, boolean done){
        this.title = title;
        this.urgent = urgent;
        this.done = done;

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public long getId() {
        return id;
    }
}
