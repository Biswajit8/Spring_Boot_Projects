package com.codespice.testcontainers.repository;

import com.codespice.testcontainers.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
