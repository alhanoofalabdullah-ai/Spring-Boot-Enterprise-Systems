package com.alhanoof.taskmanager.controller;

import com.alhanoof.taskmanager.entity.Task;
import com.alhanoof.taskmanager.service.TaskService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService service;

    public TaskController(TaskService service) {
        this.service = service;
    }

    @GetMapping
    public List<Task> getTasks() {
        return service.getAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTask(
            @PathVariable Long id
    ) {
        return service.getTask(id);
    }

    @PostMapping
    public Task createTask(
            @RequestBody Task task
    ) {
        return service.create(task);
    }

    @PutMapping("/{id}")
    public Task updateTask(
            @PathVariable Long id,
            @RequestBody Task task
    ) {
        return service.update(id, task);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(
            @PathVariable Long id
    ) {
        service.delete(id);
        return "Task Deleted Successfully";
    }
}
