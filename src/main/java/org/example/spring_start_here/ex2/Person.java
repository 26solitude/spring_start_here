package org.example.spring_start_here.ex2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Person {

    private String name = "Ella";

    private final Parrot parrot;

    @Autowired
    public Person(Parrot parrot){
        this.parrot = parrot;
    }
}
