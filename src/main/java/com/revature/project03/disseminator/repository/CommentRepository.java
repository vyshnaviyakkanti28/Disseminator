package com.revature.project03.disseminator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.project03.disseminator.model.Comment;
import com.revature.project03.disseminator.model.Post;
import com.revature.project03.disseminator.model.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
