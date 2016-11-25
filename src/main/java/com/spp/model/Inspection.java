package com.spp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Inspection {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private int price;

    @NotNull
    private int period;

    public Inspection() {}

    public Inspection(long id) {
        this.id = id;
    }

    public Inspection(String name, int price, int period) {

        this.name = name;
        this.price = price;
        this.period = period;
    }
}