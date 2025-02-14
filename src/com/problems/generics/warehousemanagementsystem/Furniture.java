package com.generics.warehousemanagementsystem;

public class Furniture extends WarehouseItem{
    // constructor, using upperclass attibutes
    public Furniture(String name, int price) {
        super(name, price);
    }

    // defining abstract method
    @Override
    public void display() {
        System.out.println("Furniture name: " + getName() + "\nFurniture price: " + getPrice());
    }
}
