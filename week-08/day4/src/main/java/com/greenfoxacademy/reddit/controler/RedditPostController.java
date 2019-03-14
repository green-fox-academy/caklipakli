package com.greenfoxacademy.reddit.controler;

import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reddit")
public class RedditPostController {

    private RedditPostRepository postRepository;

    @Autowired
    public RedditPostController(RedditPostRepository postRepository){
        this.postRepository = postRepository;
    }

    public String listPosts(Model model){
        model.addAttribute("post", postRepository.findAll());
        return "index";

    }

}
