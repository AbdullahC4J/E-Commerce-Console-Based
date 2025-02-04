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
     * @param name        The name of the product
     * @param price       The price of the product
     */
    public Product(String name, double price, String category) {
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
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the product price.
     * @param price The price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getFinalPrice() { 
            return this.price - calculateDiscount();
    }   
}