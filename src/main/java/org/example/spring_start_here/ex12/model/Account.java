package org.example.spring_start_here.ex12.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class Account {

    private long id;
    private String name;

    private BigDecimal amount;
}
