package com.codespice.testcontainers.controller;

import com.codespice.testcontainers.entity.Customer;
import com.codespice.testcontainers.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerRepository repository;

    @GetMapping("/api/customers")
    public List<Customer> getAll() {
        return repository.findAll();
    }
}
