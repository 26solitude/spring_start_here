package org.example.spring_start_here.ex6;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "org.example.spring_start_here.ex6")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
