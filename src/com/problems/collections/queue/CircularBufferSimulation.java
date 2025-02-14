package com.problems.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class CircularBufferSimulation {
    Queue<Integer> queue = new LinkedList<>();
    int size;

    // method to add an element in circular manner
    void add(int elem) {
        if (queue.size() < size) {
            queue.add(elem);
        } else {
            queue.remove();
            queue.add(elem);
        }
    }

    public static void main(String[] args) {
        CircularBufferSimulation cb = new CircularBufferSimulation();

        cb.size = 3;
        cb.add(1);
        cb.add(2);
        cb.add(3);

        cb.add(4);
        cb.add(5);
        cb.add(6);
        System.out.println(cb.queue);

    }
}
