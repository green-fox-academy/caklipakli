package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedditPostService {

    @Autowired
    RedditPostRepository postRepository;

    public void addRedditPost(RedditPost post){
        postRepository.save(post);
    }

    public RedditPost getRedditPost(long id){
        return postRepository.findById(id).get();
    }
}
