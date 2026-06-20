package com.alhanoof.workflow.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/workflows")
public class WorkflowController {

    @GetMapping
    public String getWorkflows() {
        return "Workflows Retrieved Successfully";
    }

    @PostMapping
    public String createWorkflow() {
        return "Workflow Created Successfully";
    }
}
