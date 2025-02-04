package com.ab.ecommerce.products;

/**
 * Represents a Book product in the e-commerce system.
 * Extends the Product class and includes book-specific attributes like author.
 */
public class Book extends Product {

    /** The author of the book */
    private String author;

    /**
     * Constructs a new Book with the specified attributes.
     * 
     * @param name     The title of the book
     * @param price    The price of the book
     * @param author   The author of the book
     */
    public Book(String name, double price, String author) {
        super(name, price, "Book");
        this.author = author;
    }

    /**
     * Gets the book's author.
     * @return The author of the book
     */
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Prints detailed information about the book including
     * title, author, price, category, cover color, and final price.
     */
    @Override
    public void printProductInfo() {
        System.out.println("Book Details:");
        System.out.println("Title: " + getName());
        System.out.println("Author: " + author);
        System.out.println("Price: $" + getPrice());
        System.out.println("Final Price: $" + getFinalPrice());
    }

    /**
     * Calculates the discount amount for the book.
     * Books receive a 15% discount if eligible.
     * 
     * @return The calculated discount amount
     */
    @Override
    public double calculateDiscount() {
            return getPrice() * 0.15; // 15% discount for books
    }
}