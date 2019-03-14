package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

@Service
public class RedditPostService {

    @Autowired
    RedditPostRepository postRepository;

    public List<RedditPost> getPosts(){
        List<RedditPost> posts = new ArrayList<>();
        postRepository.findAll()
                .forEach(posts::add);
        return posts.stream()
                .sorted(comparing(RedditPost::getScore).reversed())
                .collect(Collectors.toList());
    }

    public void addPost(RedditPost post){
        postRepository.save(post);
    }

    public void upVote(Long id){
        long score = postRepository.findById(id).get().getScore();
        postRepository.findById(id).get().setScore(score + 1);
        postRepository.save(postRepository.findById(id).get());
    }

    public void downVote(Long id){
        long score = postRepository.findById(id).get().getScore();
        postRepository.findById(id).get().setScore(score - 1);
        postRepository.save(postRepository.findById(id).get());
    }
}
