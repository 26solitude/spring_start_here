package org.example.spring_start_here.ex3;

import org.example.spring_start_here.ex3.model.Comment;
import org.example.spring_start_here.ex3.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Faker");
        comment.setText("Unkillable Demon King");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
