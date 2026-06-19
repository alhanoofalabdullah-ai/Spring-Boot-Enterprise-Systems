package com.alhanoof.banking.controller;

import com.alhanoof.banking.service.TransactionService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    private final TransactionService service;

    public TransactionController(
            TransactionService service
    ) {
        this.service = service;
    }

    @PostMapping("/deposit")
    public String deposit(
            @RequestParam Double amount
    ) {
        return service.deposit(amount);
    }

    @PostMapping("/withdraw")
    public String withdraw(
            @RequestParam Double amount
    ) {
        return service.withdraw(amount);
    }

    @PostMapping("/transfer")
    public String transfer(
            @RequestParam Double amount
    ) {
        return service.transfer(amount);
    }
}
