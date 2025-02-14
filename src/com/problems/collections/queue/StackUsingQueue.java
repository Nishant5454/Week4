package com.problems.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

// class to implement stack using queue
public class StackUsingQueue {
    Queue<Integer> queue = new LinkedList<>();

    // performing push operation
    void push(int elem) {
        queue.add(elem);

        int n = queue.size() - 1;
        while(n--> 0) {
            queue.add(queue.remove());
        }
    }

    // performing pop operation
    int pop() {
        return queue.remove();
    }

    // performing peek operation
    int peek() {
        return queue.peek();
    }

    // method calling
    public static void main(String[] args) {
        StackUsingQueue sq = new StackUsingQueue();
        sq.push(1);
        sq.push(2);
        sq.push(3);
        sq.pop();

        System.out.print("StackusingQueue is : ");
        for (int temp : sq.queue) {
            System.out.print(temp + " ");
        }
        System.out.println("\nPeek element is : "+sq.peek());
    }

}
