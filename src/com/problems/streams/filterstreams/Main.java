package com.streams.filterstreams;

import java.io.IOException;

public class Main {
    // method calling
    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";
        FileConverter converter = new FileConverter();

        try {
            converter.convertFileToLowercase(inputFilePath, outputFilePath);
            System.out.println("File has been converted to lowercase and saved as " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
