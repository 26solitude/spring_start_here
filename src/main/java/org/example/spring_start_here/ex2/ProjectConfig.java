package org.example.spring_start_here.ex2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example.spring_start_here.ex2")
public class ProjectConfig {

//    @Bean
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    Person person(Parrot parrot) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }

}
