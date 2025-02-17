package org.example.reflection.Intermediate;

import java.lang.reflect.Field;

public class Acessmodified {
    private String API_KEY="none";

    public static void main(String[] args) throws Exception{
        Class<?>cls= Acessmodified.class;
        Field field= cls.getDeclaredField("API_KEY");
        Object obj=cls.getDeclaredConstructor().newInstance();
        field.set(obj,"b12f3e8c-9a7d-4d5e-91c2-ef567ab34cde");
        System.out.println(field.get(obj));
    }
}
