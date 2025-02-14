package com.generics.dynamiconlinemarketplace;

// class for calling all methods
public class MarketPlace {
    public static void main(String[] args) {
        // creating instances
        Books book1 = new Books("Java", 750);
        Books book2 = new Books("C++", 650);

        Clothing clothing1 = new Clothing("T-Shirt", 850);
        Clothing clothing2 = new Clothing("Trousers", 1200);

        Gadgets gadget1 = new Gadgets("Earphones", 1500);
        Gadgets gadget2 = new Gadgets("Keyboard", 1200);

        // adding items
        Product<Books> books = new Product<>();
        books.add(book1);
        books.add(book2);

        Product<Clothing> clothings = new Product<>();
        clothings.add(clothing1);
        clothings.add(clothing2);

        Product<Gadgets> gadgets = new Product<>();
        gadgets.add(gadget1);
        gadgets.add(gadget2);

        // displaying elements
        books.displayAllProducts();
        System.out.println("=======================");

        clothings.displayAllProducts();
        System.out.println("=======================");

        gadgets.displayAllProducts();
        System.out.println("=======================");

        // calling generic methods
        clothings.applyDiscount(clothing1, 12);
        books.applyDiscount(book2, 10);
        gadgets.applyDiscount(gadget2, 5);
    }
}
