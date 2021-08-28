package com.revature.project03.disseminator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project03.disseminator.model.Post;
import com.revature.project03.disseminator.model.Subreddit;
import com.revature.project03.disseminator.model.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
