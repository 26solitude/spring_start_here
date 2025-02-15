package org.example.spring_start_here.ex13.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;


@Getter
@Setter
public class Account {

    @Id
    private long id;

    private String name;
    private BigDecimal amount;
}
