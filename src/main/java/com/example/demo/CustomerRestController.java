package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public class CustomerRestController {
    private final CustomerService customerService;
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    public Collection<Customer> readAll() {
        return this.customerService.findAll();
    }
}
