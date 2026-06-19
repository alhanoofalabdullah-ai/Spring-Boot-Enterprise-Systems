package com.alhanoof.taskmanager.service;

import com.alhanoof.taskmanager.entity.Task;
import com.alhanoof.taskmanager.repository.TaskRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public Task getTask(Long id) {
        return repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Task Not Found"));
    }

    public Task create(Task task) {
        return repository.save(task);
    }

    public Task update(Long id, Task request) {

        Task task = getTask(id);

        task.setTitle(request.getTitle());
        task.setDescription(request.getDescription());
        task.setAssignedUser(request.getAssignedUser());
        task.setPriority(request.getPriority());
        task.setStatus(request.getStatus());
        task.setDueDate(request.getDueDate());

        return repository.save(task);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
