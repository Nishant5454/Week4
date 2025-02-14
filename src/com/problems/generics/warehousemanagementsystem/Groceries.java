package com.generics.warehousemanagementsystem;

public class Groceries extends WarehouseItem{
    // constructor, using upperclass attibutes
    public Groceries(String name, int price) {
        super(name, price);
    }

    // defining abstract method
    @Override
    public void display() {
        System.out.println("Grocery name: " + getName() + "\nGrocery price: " + getPrice());
    }
}
