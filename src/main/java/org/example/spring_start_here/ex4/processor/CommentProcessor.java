package org.example.spring_start_here.ex4.processor;

import org.example.spring_start_here.ex4.model.Comment;
import org.example.spring_start_here.ex4.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentProcessor {

    @Autowired
    private CommentRepository commentRepository;

    private Comment comment;

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public void processComment(Comment comment) {
        // comment 속성을 변경    
    }

    public void validateComment(Comment comment) {
        // comment 속성을 검사하고 변경
    }

}
