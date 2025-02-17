package org.example.reflection.advanced.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String,Object> properties=new HashMap<>();
        properties.put("Nishant","30");
        properties.put("Kumar",40);
        Person person= objectMapper.toObject(Person.class,properties);
        System.out.println(person);
    }
}
