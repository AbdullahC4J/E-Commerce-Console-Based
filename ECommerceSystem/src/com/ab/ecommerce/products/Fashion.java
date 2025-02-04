package com.ab.ecommerce.products;

/**
 * Represents fashion products in the e-commerce system.
 * Handles clothing and accessories with specific attributes like type, color, and size.
 * All fashion items receive a standard 30% discount.
 */
public class Fashion extends Product {  
    /** The type of fashion item (e.g., Shirt, Pants, Dress, etc.) */
    private String fashionType;
    
    /** The color of the fashion item */
    private String color;
    
    /** The size of the fashion item */
    private String size;

    /**
     * Constructs a new Fashion product with the specified attributes.
     * 
     * @param name        The name of the product
     * @param price       The price of the product
     * @param fashionType The type of fashion item
     * @param color       The color of the fashion item
     * @param size        The size of the fashion item
     */
    public Fashion(String name, double price, String fashionType, String color, String size) {
        super(name, price,"Fashion");
        this.fashionType = fashionType;
        this.color = color;
        this.size = size;
    }

    /**
     * Gets the type of fashion item.
     * @return The fashion item type
     */
    public String getFashionType() {
        return fashionType;
    }

    /**
     * Gets the color of the fashion item.
     * @return The color of the item
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the size of the fashion item.
     * @return The size of the item
     */
    public String getSize() {
        return size;
    }

    public void setFashionType(String fashionType) {
        this.fashionType = fashionType;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Prints detailed information about the fashion item
     * including name, type, color, and size.
     */
    @Override
    public void printProductInfo() {
        System.out.println("Fashion Details:"); 
        System.out.println("Name: " + getName());
        System.out.println("Fashion Type: " + fashionType);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: $" + getPrice());
        System.out.println("Final Price: $" + getFinalPrice());
    }       

    /**
     * Calculates the discount for fashion items.
     * All fashion items receive a standard 30% discount.
     * 
     * @return The calculated discount amount
     */
    @Override
    public double calculateDiscount() {
        return getPrice() * 0.3;  // 30% discount for all fashion items
    }
}
