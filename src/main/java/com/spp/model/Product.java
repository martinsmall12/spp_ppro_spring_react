package com.spp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String name;

    private String shortDesc;

    private String longDesc;

    @NotNull
    private int price;


    public Product() {}

    public Product(String name, String shortDesc, String longDesc, int price) {
        this.name = name;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.price = price;
    }
}