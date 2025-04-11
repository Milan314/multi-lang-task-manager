package com.example.taskapi.controller; // Defines the namespace of the class, similar to module paths in Python (taskapi.controller).

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskapi.model.Task;
import com.example.taskapi.repository.TaskRepository;
// These are imports of:
// Your Task model.
// Your TaskRepository (Spring Data handles DB access).
// ResponseEntity: used to send HTTP responses.
// Web annotations like @RestController, @RequestMapping, @PostMapping.



@RestController // @RestController tells Spring that this class handles HTTP requests and returns JSON by default—similar to a FastAPI @app.get() function.
@RequestMapping("/tasks") // @RequestMapping("/tasks") sets the base URL path for all endpoints in this class.
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    } 
    // This uses constructor-based dependency injection: Spring injects an instance of TaskRepository when it creates this controller.
    // final means this variable won’t change once set.

    // POST /tasks - Add a new task
    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task savedTask = taskRepository.save(task);
        return ResponseEntity.ok(savedTask);
    }
}
//What’s Happening:
//@PostMapping maps this method to HTTP POST at /tasks.
//@RequestBody tells Spring to deserialize the JSON body into a Task object.
//taskRepository.save(task) persists the task (via JPA).
//ResponseEntity.ok(savedTask) returns the saved object with HTTP 200 OK.