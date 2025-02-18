package org.example.reflection.advanced.methodExecution;

public class TaskService {
    public void taskOne() throws InterruptedException {
        Thread.sleep(1000);
    }
    public void taskTwo() throws InterruptedException {
        Thread.sleep(2000);
    }

}
