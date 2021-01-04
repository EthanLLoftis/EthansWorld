package com.example.demo.controller;

import com.example.demo.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @GetMapping("/customers")
    List<Customer> all(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Ethan Loftis"));
        customers.add(new Customer("Dylan Loftis"));
        return customers;
    }

}
