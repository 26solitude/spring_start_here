package org.example.spring_start_here.ex4.services;

import org.example.spring_start_here.ex4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class CommentService {

//    @Autowired
//    private final CommentRepository commentRepository;
//
//    public CommentService(CommentRepository commentRepository){
//        this.commentRepository = commentRepository;
//    }
//
//    public CommentRepository getCommentRepository() {
//        return commentRepository;
//    }

    public CommentService(){
        System.out.println("CommentService instance created!");
    }
}