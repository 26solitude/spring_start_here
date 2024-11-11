package org.example.spring_start_here.ex1;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Parrot {

    private String name;

    @PostConstruct
    public void init(){
        this.name = "Kiki";
    }
}
