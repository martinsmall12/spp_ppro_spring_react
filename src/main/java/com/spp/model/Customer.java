package com.spp.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String ico;

    private String company;

    private String name;

    private String surname;

    private String street;

    private String city;

    private String pc;

    private String dic;

    @NotNull
    private String email;

    private String phone;


    public Customer() {}

    public Customer(String ico, String company, String name, String surname, String street, String city, String pc, String dic, String email, String phone) {
        this.ico = ico;
        this.company = company;
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.city = city;
        this.pc = pc;
        this.dic = dic;
        this.email = email;
        this.phone = phone;
    }
}