package org.example.spring_start_here.ex8.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {

    private String name;
    private int population;

    public static Country of(
            String name,
            int population){
        Country country = new Country();
        country.setName(name);
        country.setPopulation(population);
        return country;
    }
}
