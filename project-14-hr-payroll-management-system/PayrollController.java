package com.alhanoof.hrpayroll.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payroll")
public class PayrollController {

    @GetMapping
    public String getPayroll() {
        return "Payroll Retrieved Successfully";
    }

    @PostMapping("/process")
    public String processPayroll() {
        return "Payroll Processed Successfully";
    }
}
