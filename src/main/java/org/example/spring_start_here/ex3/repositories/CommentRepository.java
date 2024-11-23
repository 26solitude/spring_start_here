package org.example.spring_start_here.ex3.repositories;

import org.example.spring_start_here.ex3.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
