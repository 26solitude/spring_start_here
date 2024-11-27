package org.example.spring_start_here.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.spring_start_here.ex6")
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    public SecurityAspect securityAspect() {
        return new SecurityAspect();
    }

    @Bean
    public LoggingAspect loggingAspect() {
        return new LoggingAspect();
    }
}
