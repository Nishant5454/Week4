package com.problems.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers {
    // method to generate binary numbers
    Queue<String> generateBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        Queue<String> result = new LinkedList<>();

        queue.offer("1");

        while (n > 0) {
            String binary = queue.poll();
            result.offer(binary);
            queue.offer(binary + "0");
            queue.offer(binary + "1");
            n--;
        }

        return result;
    }

    // method to test function
    public static void main(String[] args) {
        BinaryNumbers bn = new BinaryNumbers();
        int n = 5;
        System.out.println(bn.generateBinary(n));
    }
}
