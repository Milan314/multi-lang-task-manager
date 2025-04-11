package com.example.taskapi.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//This Java class defines a Task entity that is mapped to a database table using Jakarta Persistence API (JPA). 
// If you’re familiar with SQLAlchemy in Python, this is somewhat similar.
// It provides an abstraction for working with databases using Java classes.

@Entity // Marks this class as an entity, meaning it will be mapped to a database table.
@Table(name = "tasks") // Specifies that this class corresponds to a database table named
public class Task {

    @Id // Marks id as the primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Specifies that the database should auto-generate the id (like AUTO_INCREMENT in MySQL).
    private Long id;

    private String title;

    @Enumerated(EnumType.STRING)
    private Status status = Status.TODO;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Constructors
    public Task() {}  // This is a default constructor (like __init__ in Python). It is required for JPA to work properly.

    public Task(String title) { //A parameterized constructor allowing you to create a Task with a title. this.title = title; is equivalent to self.title = title in Python.
        this.title = title;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
}
