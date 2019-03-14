package com.greenfoxacademy.reddit.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nick;
    private String emil;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    private List<RedditPost> posts;

    public User(){

    }

    public User(String nick){
        this.nick = nick;
    }

    public List<RedditPost> getPosts() {
        return posts;
    }

    public void setPosts(List<RedditPost> posts) {
        this.posts = posts;
    }
}

