package com.greenfoxacademy.reddit.model;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nick;
    private String emil;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private RedditPost post;

    public User(){

    }

    public User(String nick){
        this.nick = nick;
    }
}

