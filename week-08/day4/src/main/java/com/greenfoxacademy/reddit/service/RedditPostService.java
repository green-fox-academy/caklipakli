package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class RedditPostService {

    @Autowired
    RedditPostRepository postRepository;

    public void upVote(Model model, Long id){
        long score = postRepository.findById(id).get().getScore();
        postRepository.findById(id).get().setScore(score + 1);
        postRepository.save(postRepository.findById(id).get());

    }
}
