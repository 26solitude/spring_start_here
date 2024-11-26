package org.example.spring_start_here.ex4;

import org.example.spring_start_here.ex4.services.CommentService;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"org.example.spring_start_here.ex4.services", "org.example.spring_start_here.ex4.repositories"})
public class ProjectConfig {

//    @Bean
//    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
//    public CommentService commentService(){
//        return new CommentService();
//    }
}
