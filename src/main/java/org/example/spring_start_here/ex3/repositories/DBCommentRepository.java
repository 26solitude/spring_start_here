package org.example.spring_start_here.ex3.repositories;

import org.example.spring_start_here.ex3.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment:" + comment.getText());
    }
}
