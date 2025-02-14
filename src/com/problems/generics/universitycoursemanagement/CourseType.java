package com.generics.universitycoursemanagement;

public abstract class CourseType {
    // defining attributes
    private String subject;
    private String duration;

    // adding getters
    public String getSubject() {
        return subject;
    }
    public String getDuration() {
        return duration;
    }

    // Constructor
    public CourseType(String subject, String duration) {
        this.subject = subject;
        this.duration = duration;
    }

    // method to display details of course
    public void display() {
        System.out.println("Subject name: " + getSubject() + "\nSubject Duration: " + getDuration());
    }
}
