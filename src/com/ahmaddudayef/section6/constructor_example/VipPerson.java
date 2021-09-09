package com.ahmaddudayef.section6.constructor_example;

public class VipPerson {

    private String name;
    private double creditCard;
    private String email;

    public VipPerson() {
        this("Defaul name", 50000.0, "defaul email");
    }

    public VipPerson(String name, double creditCard) {
        this(name, creditCard, "defaul email");
    }

    public VipPerson(String name, double creditCard, String email) {
        this.name = name;
        this.creditCard = creditCard;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Double getCreditCard() {
        return creditCard;
    }

    public String getEmail() {
        return email;
    }
}
