package com.company.interfaces;

import java.time.LocalDate;

public class Task implements Comparable<Task>{

    private int id;
    private String name;
    private LocalDate startDate = LocalDate.now();
    private LocalDate endDate = LocalDate.now();
    private int priority;
    private boolean completed;

    public Task() {}

    public Task(int id, String name, int priority) {
        this(id, name, LocalDate.now(), LocalDate.now(), priority, false);
    }

    public Task(int id, String name, LocalDate startDate, LocalDate endDate,
                int priority, boolean completed) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.completed = completed;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public int compareTo(Task task) {
        return name.compareTo(task.name);
    }
}
