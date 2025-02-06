package com.ab.ecommerce.products;

/**
 * Abstract base class for all product types in the e-commerce system.
 * Implements Discountable interface for discount calculations.
 */
public abstract class Product implements PrintProdInfo, Discountable {
    
    private String name;
    private double price;
    private String category;

    /**
     * Constructs a product with all required attributes.
     * 
     * @param name     The name of the product
     * @param price    The price of the product
     * @param category The category of the product
     * @throws IllegalArgumentException if any parameter is invalid
     */
    public Product(String name, double price, String category) {
        validateName(name);
        validatePrice(price);
        this.name = name;
        this.price = price;
        this.category = category;
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
     * Gets the product category.
     * @return The category of the product
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the product name.
     * @param name The name to set
     * @throws IllegalArgumentException if the name is invalid
     */
    public void setName(String name) {
        validateName(name);
        this.name = name;
    }

    /**
     * Sets the product price.
     * @param price The price to set
     * @throws IllegalArgumentException if the price is invalid
     */
    public void setPrice(double price) {
        validatePrice(price);
        this.price = price;
    }

    /**
     * Validates the product name.
     * @param name The name to validate
     * @throws IllegalArgumentException if the name is invalid
     */
    private void validateName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        if (name.length() < 3) {
            throw new IllegalArgumentException("Product name must be at least 3 characters long");
        }
        if (name.length() > 50) {
            throw new IllegalArgumentException("Product name cannot exceed 50 characters");
        }
    }

    /**
     * Validates the product price.
     * @param price The price to validate
     * @throws IllegalArgumentException if the price is invalid
     */
    private void validatePrice(double price) {
        if (price < 1.0) {
            throw new IllegalArgumentException("Invalid Price");
        }
    }

    /**
     * Gets the final price of the product after applying any discounts.
     * @return The final price of the product
     */
    @Override
    public double getFinalPrice() { 
        if (this.price <= 0.0)
            throw new IllegalArgumentException("Invalid Price");

        return this.price - calculateDiscount();
    }   




}