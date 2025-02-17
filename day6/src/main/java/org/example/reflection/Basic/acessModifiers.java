package org.example.reflection.Basic;

import java.lang.reflect.Field;

class Person{
   private int age=15;


}
public class acessModifiers {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Person p=new Person();
        Class<Person>cls=Person.class;
        Field age=cls.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,20);
        System.out.println(age.get(p));






    }
}
