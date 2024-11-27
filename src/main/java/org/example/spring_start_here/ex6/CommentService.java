package org.example.spring_start_here.ex6;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(CommentService.class.getName());

    @ToLog
    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText() + " -" + comment.getAuthor() + "-");
        return "SUCCESS";
    }

//    @ToLog
//    public String deleteComment(Comment comment) {
//        logger.info("Deleting comment: " + comment.getText() + " -" + comment.getAuthor() + "-");
//        return "SUCCESS";
//    }
//
//    public String editComment(Comment comment) {
//        logger.info("Editing comment: " + comment.getText() + " -" + comment.getAuthor() + "-");
//        return "SUCCESS";
//    }
}
