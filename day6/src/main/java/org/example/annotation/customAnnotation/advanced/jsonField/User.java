package org.example.annotation.customAnnotation.advanced.jsonField;

// User class with @JsonField annotations
public class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private int age;

    private String password; // This field will not be serialized

    public User(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }
}
