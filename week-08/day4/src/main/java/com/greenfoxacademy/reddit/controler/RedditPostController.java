package com.greenfoxacademy.reddit.controler;

import com.greenfoxacademy.reddit.model.RedditPost;
import com.greenfoxacademy.reddit.repository.RedditPostRepository;
import com.greenfoxacademy.reddit.service.RedditPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/reddit")
public class RedditPostController {

    private RedditPostService service;

    @Autowired
    public RedditPostController(RedditPostService service){
        this.service = service;
    }

    @RequestMapping(value={"/", "/list"})
    public String listPosts(Model model){
        model.addAttribute("posts", service.getPosts());
        return "index";
    }


    @RequestMapping(path="/add", method= RequestMethod.GET)
    public String redditAddForm(Model model){
        model.addAttribute("reddit", new RedditPost());
        return "add";
    }

    @RequestMapping(path="/add", method=RequestMethod.POST)
    public String redditAdd(@ModelAttribute(name="reddit") RedditPost post){
        service.addPost(post);
        return "redirect:/reddit/list";
    }

    @RequestMapping(path="/{id}/upvote", method = RequestMethod.GET)
    public String upVoteReddit(@PathVariable("id") long id){
        service.upVote(id);
        return "redirect:/reddit/list";
    }

    @RequestMapping(path="/{id}/downvote", method = RequestMethod.GET)
    public String downVoteReddit(@PathVariable("id") long id){
        service.downVote(id);
        return "redirect:/reddit/list";
    }

}
