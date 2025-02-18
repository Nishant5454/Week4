package org.example.annotation.customAnnotation.beginner.Todo;

public class multipleMethods {
    @Todo(task="login",assignedTo = "BackendDeveloper")
    public void login(){}
    @Todo(task = "UI",assignedTo = "Akshay Saini")
    public void UI(){}
    @Todo(task = "Database Integration",assignedTo = "Database Administrator")
    public void dbIntegration(){}


}
