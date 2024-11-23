package org.example.spring_start_here.ex1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.spring_start_here.ex1")
public class ProjectConfig {

//    @Bean(name = "koko")
//    @Primary
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean(name = "miki")
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean(name = "riki")
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("Riki");
//        return p;
//    }
//
//
//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }

}
