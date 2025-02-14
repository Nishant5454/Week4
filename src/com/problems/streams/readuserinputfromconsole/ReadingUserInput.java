package com.streams.readuserinputfromconsole;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingUserInput {
    // method to read and write file from console
    void readAndWriteFile(String destinationPath) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter(destinationPath)) {

            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine());
            System.out.println("Enter fav. Programming language: ");
            String favProgLang = br.readLine();

            fw.write("User's name: " + name  + "\n");
            fw.write("User's age: " + age + "\n");
            fw.write("User's favourite programming language:  " + favProgLang);

            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
