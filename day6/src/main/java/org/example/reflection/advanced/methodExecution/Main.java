package org.example.reflection.advanced.methodExecution;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {


        TaskService taskService = new TaskService();
        Method taskone = TaskService.class.getMethod("taskOne");
        Method tasktwo=TaskService.class.getMethod("taskTwo");
        methodExecution.methodExecutionTimer(taskService,taskone,null);
        methodExecution.methodExecutionTimer(taskService,tasktwo,null);


    }
}
