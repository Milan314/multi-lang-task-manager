package com.example.taskapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskapi.model.Task;
import com.example.taskapi.repository.TaskRepository;

@RestController // @RestController tells Spring that this class handles HTTP requests and returns JSON by default—similar to a FastAPI @app.get() function.
@RequestMapping("/tasks") // @RequestMapping("/tasks") sets the base URL path for all endpoints in this class.
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    // POST /tasks - Add a new task
    @PostMapping
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }

    // GET - Get all tasks
    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/search")
    public List<Task> searchTasks(@RequestParam String keyword) {
    return taskRepository.findByTitleContaining(keyword);
}
}
