package com.alhanoof.crm.service;

import com.alhanoof.crm.entity.Customer;
import com.alhanoof.crm.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomer(Long id) {

        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Customer Not Found"));
    }

    public Customer create(Customer customer) {
        return repository.save(customer);
    }

    public Customer update(Long id, Customer request) {

        Customer customer = getCustomer(id);

        customer.setFullName(request.getFullName());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setCompany(request.getCompany());
        customer.setStatus(request.getStatus());

        return repository.save(customer);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
