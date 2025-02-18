package org.example.reflection.advanced.methodExecution;

import java.lang.reflect.Method;

public class methodExecution {
    public static void  methodExecutionTimer(Object obj, Method method,Object[]args)throws Exception{
        long startTime=System.nanoTime();
        method.invoke(obj,args);
        long endTime=System.nanoTime();
        System.out.println("The time taken to Execute the Method is "+(endTime-startTime)+" nanosecond");

    }
}
