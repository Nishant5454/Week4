package com.streams.datastreams;

import java.io.*;

public class StudentDataWriter {
    // method to write student data
    public static void writeStudentData(String fileName, Student student) throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(student.getRollNumber());
            dataOutputStream.writeUTF(student.getName());
            dataOutputStream.writeDouble(student.getGpa());
        }
    }
}

