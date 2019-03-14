package com.greenfoxacademy.reddit.controler;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/reddit")
public class RedditPostController {

    private RedditPostRepository postRepository;

    @Autowired
    public RedditPostController(RedditPostRepository postRepository){
        this.postRepository = postRepository;
    }

    @RequestMapping(value={"/", "/list"})
    public String listPosts(Model model){
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }


    @RequestMapping(path="/add", method= RequestMethod.GET)
    public String redditAdd(Model model){
        model.addAttribute("reddit", new RedditPost());
        return "add";
    }

    @RequestMapping(path="/add", method=RequestMethod.POST)
    public String todoAdd(@ModelAttribute(name="reddit") RedditPost post){
        postRepository.save(post);
        return "redirect:/reddit/list";
    }

}
