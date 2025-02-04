package com.ab.ecommerce.products;

public class Book extends Product {

    public Book(String name, double price, String description, String category, String brand, String color) {
        super(name, price, description, category, brand, color);
    }

    @Override
    public void printProductInfo() {
        System.out.println("Book Details:");
        System.out.println("Title: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Category: " + getCategory());
        System.out.println("Publisher: " + getBrand());
        System.out.println("Cover Color: " + getColor());
        System.out.println("Final Price: $" + getFinalPrice());
    }

    @Override
    public double calculateDiscount() {
        if(isDiscountEligible()){
            return getPrice();
        }
        else{
            return getPrice() * 0.15; // 15% discount for books
        }
    }


    @Override
    public double getFinalPrice() { 
        if(isDiscountEligible())
            return getPrice();
        else
            return getPrice() - calculateDiscount();
    }
}