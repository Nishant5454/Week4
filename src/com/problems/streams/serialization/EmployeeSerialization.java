package com.streams.serialization;

import java.io.*;
import java.util.List;

public class EmployeeSerialization {
    // method to serialize the object
    public static void serializeEmployees(List<Employee> employees, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees have been serialized to the file: " + filename);
        } catch (IOException e) {
            System.err.println("Error during serialization: " + e.getMessage());
        }
    }

    // method to deserialize object
    public static List<Employee> deserializeEmployees(String filename) {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            employees = (List<Employee>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error during deserialization: " + e.getMessage());
        }
        return employees;
    }
}
