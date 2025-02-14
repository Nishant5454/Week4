package com.problems.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// class to store employees
class Employee{
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return name;
    }

    public String getDepartment() {
        return department;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjectByProperty {
    // method to make group by property
    public static HashMap<String, List<Employee>> groupsByProperty(List<Employee> employeeList){
        HashMap<String, List<Employee>> hm = new HashMap<>();
        for (Employee el : employeeList) {
            if (hm.containsKey(el.getDepartment())) {
                hm.get(el.getDepartment()).add(el);
            } else {
                hm.put(el.getDepartment(), new ArrayList<Employee>(Arrays.asList(el)));
            }
        }


        return hm;
    }

    // method calling
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice", "HR");
        Employee e2 = new Employee("Bob", "IT");
        Employee e3 = new Employee("Carol", "HR");

        List<Employee> employeeList = new ArrayList<>(Arrays.asList(e1, e2, e3));

        HashMap<String, List<Employee>> hm = groupsByProperty(employeeList);

        for( Map.Entry <String, List<Employee>> entry: hm.entrySet() ){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
