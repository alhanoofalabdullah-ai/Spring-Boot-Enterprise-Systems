package com.alhanoof.banking.service;

import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public String deposit(
            Double amount
    ) {
        return "Deposit Successful: " + amount;
    }

    public String withdraw(
            Double amount
    ) {
        return "Withdrawal Successful: " + amount;
    }

    public String transfer(
            Double amount
    ) {
        return "Transfer Successful: " + amount;
    }
}
