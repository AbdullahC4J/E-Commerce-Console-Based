package com.ab.ecommerce.products;

public interface Discountable {
    /**
     * Calculates the discount amount for the product
     * @return The discount amount
     */
    double calculateDiscount();
    
    /**
     * Gets the final price after applying the discount
     * @return The final price after discount
     */
    double getFinalPrice();
    
    /**
     * Checks if the product is eligible for discount
     * @return true if eligible for discount, false otherwise
     */
    boolean isDiscountEligible();
}