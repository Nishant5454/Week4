package com.streams.datastreams;

import java.io.IOException;

public class Main {
    // method calling
    public static void main(String[] args) {
        String fileName = "studentdetail.txt";
        Student student = new Student(1, "John Doe", 3.75);

        try {
            StudentDataWriter.writeStudentData(fileName, student);
            Student retrievedStudent = StudentDataReader.readStudentData(fileName);
            System.out.println("Roll Number: " + retrievedStudent.getRollNumber());
            System.out.println("Name: " + retrievedStudent.getName());
            System.out.println("GPA: " + retrievedStudent.getGpa());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
