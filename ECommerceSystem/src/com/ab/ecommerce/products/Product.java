package com.ab.ecommerce.products;

/**
 * Abstract base class for all product types in the e-commerce system.
 * Implements Discountable interface for discount calculations.
 */
public abstract class Product implements PrintProdInfo ,Discountable {
    protected  String name;
    protected  double price;
    protected  String description;
    protected  String category;
    protected  String brand;
    protected  String color;

    /**
     * Constructs a product with all required attributes.
     * 
     * @param name        The name of the product
     * @param price       The price of the product
     * @param description Product description
     * @param category    Product category
     * @param brand       Product brand name
     * @param color       Product color
     */
    public Product(String name, double price, String description, String category, String brand, String color) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.color = color;
    }

    /**
     * Gets the product name.
     * @return The name of the product
     */
    public String getName() {
        return name;
    }   

    /**
     * Gets the product price.
     * @return The price of the product
     */
    public double getPrice() {  
        return price;
    }

    /**
     * Gets the product description.
     * @return The description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Gets the product category.
     * @return The category of the product
     */
    public String getCategory() {
        return category;
    }

    /**
     * Gets the product brand.
     * @return The brand of the product
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the product color.
     * @return The color of the product
     */
    public String getColor() {
        return color;
    }

    /**
     * Checks if the product is eligible for discount based on its category.
     * @return true if the product category is eligible for discount, false otherwise
     */
    @Override
    public boolean isDiscountEligible() {
        return switch(this.category){
            case "Electronics","Books" -> true; 
            case "Fashion", "SuperMarket" -> true;
            default -> false;
        };
    }
}