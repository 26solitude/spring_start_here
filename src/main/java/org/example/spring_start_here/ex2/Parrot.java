package org.example.spring_start_here.ex2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Parrot {

    private String name  = "Koko";

    public Parrot(){
        System.out.println("Parrot created");
    }

    @Override
    public String toString(){
        return "Parrot : " + name;
    }
}
