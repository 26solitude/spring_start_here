package org.example.spring_start_here.ex3.proxies;

import org.example.spring_start_here.ex3.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
