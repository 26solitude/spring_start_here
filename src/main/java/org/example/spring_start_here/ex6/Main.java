package org.example.spring_start_here.ex6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.logging.Logger;

public class Main {

    private static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig_ex6.class);
        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("반가워요 소통해요");
        comment.setAuthor("조장호");

        service.publishComment(comment);
    }
}
