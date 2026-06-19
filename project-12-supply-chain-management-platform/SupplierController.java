package com.alhanoof.supplychain.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController {

    @GetMapping
    public String getSuppliers() {
        return "Suppliers Retrieved Successfully";
    }

    @PostMapping
    public String createSupplier() {
        return "Supplier Created Successfully";
    }
}
