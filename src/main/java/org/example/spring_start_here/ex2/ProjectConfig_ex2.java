package org.example.spring_start_here.ex2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.spring_start_here.ex2")
public class ProjectConfig_ex2 {

    @Bean
    Parrot parrot1() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }
}
