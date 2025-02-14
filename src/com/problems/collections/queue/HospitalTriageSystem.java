package com.problems.collections.queue;

import java.util.*;

public class HospitalTriageSystem {
    // Method to create and return a PriorityQueue of patients sorted by severity
    public static PriorityQueue<Map.Entry<String, Integer>> createTriageQueue(List<Map.Entry<String, Integer>> patients) {
        PriorityQueue<Map.Entry<String, Integer>> queue = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry<String, Integer>::getValue).reversed()
        );

        queue.addAll(patients);

        return queue;
    }

    // main for method calling and printing patients.
    public static void main(String[] args) {
        List<Map.Entry<String, Integer>> patients = new ArrayList<>();
        patients.add(Map.entry("John", 3));
        patients.add(Map.entry("Alice", 5));
        patients.add(Map.entry("Bob", 2));

        PriorityQueue<Map.Entry<String, Integer>> triageQueue = createTriageQueue(patients);

        System.out.print("Order: ");
        while (!triageQueue.isEmpty()) {
            Map.Entry<String, Integer> patient = triageQueue.poll();
            System.out.print(patient.getKey());
            if (!triageQueue.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
