package com.alhanoof.crm.repository;

import com.alhanoof.crm.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<Customer, Long> {
}
