package org.example.reflection.advanced.customLogging;
public class Main {

    public static void main(String[] args) {
        Greeting greeting = new GreetingImpl();
        Greeting proxyGreeting = (Greeting) proxyFactory.createProxy(greeting);

        proxyGreeting.sayHello();
    }
}