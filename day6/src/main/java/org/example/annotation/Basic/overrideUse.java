package org.example.annotation.Basic;
class Animal{
    void makeSound(){
        System.out.println("Animal is Making Sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog is Making Sound");
    }
}

public class overrideUse {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();

    }
}
