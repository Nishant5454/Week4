package org.example.reflection.Basic;

import java.lang.reflect.InvocationTargetException;

public class Student{
    void Anything(){
        System.out.println("Anything");
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?>stu=Class.forName("org.example.reflection.Basic.Student");
        Object obj=stu.getDeclaredConstructor().newInstance();
        stu.getDeclaredMethod("Anything").invoke(obj);

    }
}
