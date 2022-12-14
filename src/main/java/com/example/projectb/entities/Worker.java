package com.example.projectb.entities;

import java.io.Serializable;

public class Worker implements Serializable {
    private String surname;
    private String name;

    public Worker() {
    }

    public Worker(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Worker: " +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}