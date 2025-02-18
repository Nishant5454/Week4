package org.example.annotation.customAnnotation.beginner.ImportantMethods;

public class Taskservice {
    @ImportantMethods(level = "High")
    public void important(){}
    @ImportantMethods(level = "Low")
    public void notImportant(){}
    @ImportantMethods(level = "Normal")
    public void Normal(){}
}
