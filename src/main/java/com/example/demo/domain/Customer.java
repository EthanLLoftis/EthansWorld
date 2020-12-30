package com.example.demo.domain;

public class Customer {
    private String name;
    private String cardNum;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name.toUpperCase();
    }

    public void setCard(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getCard() {
        return this.cardNum;
    }
}
