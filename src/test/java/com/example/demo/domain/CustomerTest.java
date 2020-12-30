package com.example.demo.domain;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class CustomerTest {

    @Test
    void newCustomer() {
        Customer aCostumer = new Customer("Bob Evans");
        Customer bCostumer = new Customer("Ethan Loftis");
        Customer cCostumer = new Customer("Bjorn Loftis");
        aCostumer.setCard("13579");
        org.junit.Assert.assertEquals("Bob Evans".toLowerCase(Locale.ROOT), aCostumer.getName().toLowerCase(Locale.ROOT));
        org.junit.Assert.assertEquals("13579", aCostumer.getCard());
    }

}
