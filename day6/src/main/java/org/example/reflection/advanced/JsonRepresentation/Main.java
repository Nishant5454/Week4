package org.example.reflection.advanced.JsonRepresentation;

public class Main {
    public static void main(String[] args) throws IllegalAccessException{
        Person person = new Person("Nishant Kumar", 22);
        String jsonString = jsonClass.JsonConverter.toJson(person);
        System.out.println(jsonString);
    }
}