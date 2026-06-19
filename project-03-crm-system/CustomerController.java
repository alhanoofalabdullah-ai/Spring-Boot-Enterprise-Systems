package com.alhanoof.crm.controller;

import com.alhanoof.crm.entity.Customer;
import com.alhanoof.crm.service.CustomerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @GetMapping
    public List<Customer> getCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(
            @PathVariable Long id
    ) {
        return service.getCustomer(id);
    }

    @PostMapping
    public Customer createCustomer(
            @RequestBody Customer customer
    ) {
        return service.create(customer);
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(
            @PathVariable Long id,
            @RequestBody Customer customer
    ) {
        return service.update(id, customer);
    }

    @DeleteMapping("/{id}")
    public String deleteCustomer(
            @PathVariable Long id
    ) {
        service.delete(id);
        return "Customer Deleted Successfully";
    }
}
