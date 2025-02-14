package com.problems.collections.map;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    // method to count a frequency of words in a file
    public static Map<String, Integer> countWordFrequency(String filePath) {

        Map<String, Integer> wordCount = new HashMap<>();

        try (FileReader fr = new FileReader(filePath);
             BufferedReader reader = new BufferedReader(fr)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split(" ");

                for (String word : words) {
                    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                }
            }
        } catch (Exception e) {
            System.err.println("File not found");
        }

        return wordCount;
    }

    public static void main(String[] args) throws IOException {  // Provide the file path
        System.out.println(countWordFrequency("sample.txt"));
    }
}

