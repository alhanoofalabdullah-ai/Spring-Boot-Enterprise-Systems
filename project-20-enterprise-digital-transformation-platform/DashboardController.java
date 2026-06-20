package com.alhanoof.digitaltransformation.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboards")
public class DashboardController {

    @GetMapping("/executive")
    public String executiveDashboard() {

        return "Executive Dashboard Loaded";
    }

    @GetMapping("/governance")
    public String governanceDashboard() {

        return "Governance Dashboard Loaded";
    }

    @GetMapping("/portfolio")
    public String portfolioDashboard() {

        return "Portfolio Dashboard Loaded";
    }
}
