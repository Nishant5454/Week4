package com.problems.generics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

// class for initializing each product
public class Product<T extends com.generics.dynamiconlinemarketplace.ProductCategory> {
    private List<T> products;

    public Product() {
        products = new ArrayList<>();
    }

    public void add(T product){
        products.add(product);
    }

    public T getProduct(int index){
        return products.get(index);
    }
    public List<T> getAllProducts(){
        return products;
    }

    // feneric method
    public <T extends com.generics.dynamiconlinemarketplace.ProductCategory> void applyDiscount(T product, double discount){
        double price= product.getPrice();
        double discountedPrice=price-price*discount/100;
        product.setPrice(discountedPrice);
        System.out.println(product.getName()+" : After "+discount+"% discount price updated to "+product.getPrice()+" from "+price);
    }

    // printing all products
    public void displayAllProducts(){
        for(T product:products){
            product.display();
        }
    }
}