package com.example.demo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StoreTest {

    @Test
    public void createStore(){
        Store s = new Store();
        assertNotNull (s);
    }

    @Test
    public void addCustomer(){
        Store store = new Store();
        Customer bob = new Customer("Bob");
        assertEquals(0,store.customerCount());
        store.addCustomer(bob);
        assertEquals(1,store.customerCount());
    }
}
