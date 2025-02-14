package com.generics.warehousemanagementsystem;

public class Electronic extends WarehouseItem {
    // constructor, using upperclass attibutes
    public Electronic(String name, int price){
        super(name, price);
    }

    // defining abstract method
    @Override
    public void display() {
        System.out.println("Electronic item name: " + getName() + "\nElectronic item price: " + getPrice());
    }
}
