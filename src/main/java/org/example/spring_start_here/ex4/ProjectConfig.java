package org.example.spring_start_here.ex4;

import org.example.spring_start_here.ex4.services.CommentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.spring_start_here.ex4.services", "org.example.spring_start_here.ex4.repositories"})
public class ProjectConfig {

}
