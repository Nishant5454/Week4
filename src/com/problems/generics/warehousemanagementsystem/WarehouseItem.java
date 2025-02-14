package com.generics.warehousemanagementsystem;

public abstract class WarehouseItem {
    // setting attributes for product
    private String name;
    private int price;

    // contructor
    public WarehouseItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // abstract method
    public abstract void display();
}
