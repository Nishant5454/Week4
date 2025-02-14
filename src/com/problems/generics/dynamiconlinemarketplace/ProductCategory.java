package com.generics.dynamiconlinemarketplace;

// parent class containing information about product
public abstract class ProductCategory {
    private double price;
    private String category;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductCategory(String name, double price, String category) {
        this.price = price;
        this.category = category;
        this.name=name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public void display(){
        System.out.println("Product category : " + category);
        System.out.println("Product name : " + name);
        System.out.println("Product price : " + price);
    }
}