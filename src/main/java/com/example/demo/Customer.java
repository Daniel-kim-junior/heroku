package com.example.demo;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class Customer {
    private long id;
    private String email;

    public Customer(long id, String email) {
        this.id = id;
        this.email = email;
    }

}
