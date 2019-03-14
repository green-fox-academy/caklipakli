package com.greenfoxacademy.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class RedditPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String post;
    private long score;
    private Date date = new Date();

    public RedditPost(){
        this.score = 100;
    }

    public RedditPost(String post){
        this.post = post;
        this.score =100;

    }

    public long getId() {
        return id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public long getScore() {
        return score;
    }

    public void setScore(long score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

}
