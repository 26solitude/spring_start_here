package org.example.spring_start_here.ex4.services;

import org.example.spring_start_here.ex4.model.Comment;
import org.example.spring_start_here.ex4.processor.CommentProcessor;
import org.example.spring_start_here.ex4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ApplicationContext context;

    public void sendComment(Comment c) {
        CommentProcessor p = context.getBean(CommentProcessor.class);

        p.setComment(c);
        p.processComment(c);
        p.validateComment(c);

        c = p.getComment();
    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}