package org.example.spring_start_here.ex3;

import org.example.spring_start_here.ex3.proxies.CommentNotificationProxy;
import org.example.spring_start_here.ex3.proxies.EmailCommentNotificationProxy;
import org.example.spring_start_here.ex3.repositories.CommentRepository;
import org.example.spring_start_here.ex3.repositories.DBCommentRepository;
import org.example.spring_start_here.ex3.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.spring_start_here.ex3.proxies", "org.example.spring_start_here.ex3.repositories", "org.example.spring_start_here.ex3.services"})
public class ProjectConfiguration {

//    @Bean
//    public CommentRepository commentRepository(){
//        return new DBCommentRepository();
//    }
//
//    @Bean
//    public CommentNotificationProxy commentNotificationProxy(){
//        return new EmailCommentNotificationProxy();
//    }
//
//    @Bean
//    public CommentService commentService(
//            CommentRepository commentRepository,
//            CommentNotificationProxy commentNotificationProxy){
//        return new CommentService(commentRepository, commentNotificationProxy);
//    }
}
