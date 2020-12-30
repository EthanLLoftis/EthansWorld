package com.example.demo.domain;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer aCustomer) {
        customers.add(aCustomer);
    }

    public int customerCount() {
        return customers.size();
    }
}
