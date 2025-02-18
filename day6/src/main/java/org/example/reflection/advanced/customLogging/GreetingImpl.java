package org.example.reflection.advanced.customLogging;

import org.example.reflection.advanced.customLogging.Greeting;

public class GreetingImpl implements Greeting {

    @Override
    public void sayHello() {
        System.out.println("Hello, world!");
    }
}