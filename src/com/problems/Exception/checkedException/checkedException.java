package com.problems.Exception.checkedException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class checkedException {
    public static void main(String[] args) {
        File file = new File("java.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line=br.readLine())!=null){
                System.out.println(line);

        }
        } catch (IOException e){
            System.out.println("File not found in the System");

        }
    }

}
