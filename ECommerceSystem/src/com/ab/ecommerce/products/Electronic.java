package com.ab.ecommerce.products;

/**
 * Represents electronic products in the e-commerce system.
 * Handles electronic devices with specific attributes like brand, type, and color.
 */
public class Electronic extends Product {
    private String brand;
    private ElectronicType productType;
    private String color;

    public Electronic(String name, double price, String brand, ElectronicType productType, String color) {
        super(name, price, "Electronic");
        this.brand = brand;
        this.color = color;
        this.productType = productType;
    } 

    /**
     * Gets the brand of the electronic device.
     * @return The brand name
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Gets the color of the electronic device.
     * @return The color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the brand of the electronic device.
     * @param brand The brand name to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Sets the color of the electronic device.
     * @param color The color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Gets the type of electronic device.
     * @return The product type (SMARTPHONE, LAPTOP, etc.)
     */
    public ElectronicType getProductType() {
        return productType;
    }

    /**
     * Sets the type of electronic device.
     * @param productType The product type to set
     */
    public void setProductType(ElectronicType productType) {
        this.productType = productType;
    }

    /**
     * Prints detailed information about the electronic device
     * including name, brand, type, price, and color.
     */
    @Override
    public void printProductInfo() {
        System.out.println("Electronic Details:");
        System.out.println("Name: " + getName());
        System.out.println("Brand: " + brand);
        System.out.println("Product Type: " + productType);
        System.out.println("Price: $" + getPrice());
        System.out.println("Color: " + color);
        System.out.println("Final Price: $" + getFinalPrice());
    }

    /**
     * Calculates the discount based on the electronic type.
     * Different types have different discount rates:
     * - Smartphones, Laptops: 15% discount
     * - TVs, Cameras: 20% discount
     * - Other electronics: 10% discount
     * 
     * @return The calculated discount amount
     */
    @Override
    public double calculateDiscount() {
        return switch (productType) {
            case SMARTPHONE, LAPTOP -> getPrice() * 0.15;    // 15% discount
            case TV, CAMERA -> getPrice() * 0.20;           // 20% discount
            case TABLET, HEADPHONE, SPEAKER -> getPrice() * 0.10;  // 10% discount
            default -> 0.0;
        };
    }   
}
