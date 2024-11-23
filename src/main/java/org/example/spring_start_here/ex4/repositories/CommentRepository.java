package org.example.spring_start_here.ex4.repositories;

import org.example.spring_start_here.ex4.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
