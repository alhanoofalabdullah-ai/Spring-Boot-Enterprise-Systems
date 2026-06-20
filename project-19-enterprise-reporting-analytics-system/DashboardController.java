package com.alhanoof.analytics.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/dashboards")
public class DashboardController {

    @GetMapping
    public String getDashboards() {
        return "Dashboards Retrieved Successfully";
    }

    @PostMapping
    public String createDashboard() {
        return "Dashboard Created Successfully";
    }
}
