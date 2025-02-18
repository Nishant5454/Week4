package org.example.annotation.customAnnotation.Intermediate.loggingMethod;

public class TaskService {
    @LogexecutionTime
    public void taksone() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getStackTrace());
        }
    }
    @LogexecutionTime
    public void taskwo(){
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            System.out.println(e.getStackTrace());
        }

    }
    @LogexecutionTime
    public void taskthree(){
        try{
            Thread.sleep(3000);
        }
        catch (InterruptedException e){
            System.out.println(e.getStackTrace());
        }
    }
}
