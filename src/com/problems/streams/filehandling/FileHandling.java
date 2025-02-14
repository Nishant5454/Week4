package com.streams.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
    // method to get input and write it in output file
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt");
             FileOutputStream fos = new FileOutputStream("output.txt"))
        {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write((char)byteData);
            }
            System.out.println("File is written and saved successfully.");
        } catch (IOException e) {
            System.err.println("File Not found in the directory" + e);
        }
    }
}
