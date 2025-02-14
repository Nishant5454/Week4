package com.problems.collections.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    // method to reverse a queue via recursion
    void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }

        int front = queue.remove();
        reverseQueue(queue);
        queue.add(front);
    }

    // method calling
    public static void main(String[] args) {
        ReverseQueue rq = new ReverseQueue();
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));

        System.out.println(queue);
        rq.reverseQueue(queue);
        System.out.println(queue);
    }
}
