package com.greenfoxacademy.reddit.repository;

import com.greenfoxacademy.reddit.model.RedditPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedditPostRepository extends CrudRepository<RedditPost,Long> {
}
