package com.generics.universitycoursemanagement;

import java.util.ArrayList;
import java.util.List;

public class Course<T extends CourseType>{
    // defining list to store courses
    private List<T> list = new ArrayList<>();

    // method to add courses in the list
    public void addCourse(T course) {
        list.add(course);
    }

    // method to get courses
    public List<T> getCourses() {
        return list;
    }

    // method to display each course
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course: courses) {
            course.display();
        }
        System.out.println();
    }
}
