package com.streams.serialization;

import java.io.Serializable;

// Employee class for object serialization
public class Employee implements Serializable {
    private int id;
    String name;
    String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}
