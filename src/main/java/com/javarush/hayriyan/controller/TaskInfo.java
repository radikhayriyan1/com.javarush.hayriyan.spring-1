package com.javarush.hayriyan.controller;

import com.javarush.hayriyan.domain.Status;

public class TaskInfo {

    private String description;

    private Status status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
