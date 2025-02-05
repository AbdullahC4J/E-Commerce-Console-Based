package com.ab.ecommerce.cart;

import com.ab.ecommerce.products.Product;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a shopping cart in the e-commerce system.
 * Manages products added by customers and calculates total prices.
 */
public class Cart {
    /** List of products in the cart */
    private final List<Product> products;
    
    /** Maximum number of items allowed in cart */
    private static final int MAX_ITEMS = 30;

    public Cart() {
        this.products = new ArrayList<>();
    }

    /**
     * Adds a product to the cart.
     * 
     * @param product The product to add
     * @throws IllegalArgumentException if product is null or cart is full
     */
    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (products.size() >= MAX_ITEMS) {
            throw new IllegalStateException("Cart is full (max " + MAX_ITEMS + " items)");
        }
        products.add(product);
    }

    /**
     * Removes a product from the cart.
     * 
     * @param product The product to remove
     * @return true if product was removed, false if not found
     */
    public boolean removeProduct(Product product) {
        return products.remove(product);
    }

    /**
     * Gets the number of items in cart.
     * @return Number of items
     */
    public int getItemCount() {
        return products.size();
    }

    /**
     * Checks if the cart is empty.
     * @return true if cart is empty
     */
    public boolean isEmpty() {
        return products.isEmpty();
    }

    /**
     * Clears all items from the cart.
     */
    public void clear() {
        products.clear();
    }

    /**
     * Gets an unmodifiable view of products in cart.
     * @return List of products
     */
    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    /**
     * Prints the cart contents.
     */
    public void printCart() {
        if (isEmpty()) {
            System.out.println("Cart is empty");
            return;
        }

        System.out.println("\nCart Contents:");
        System.out.println("-------------");
        products.forEach(product -> {
            System.out.printf("%s - $%.2f%n", 
                product.getName(), 
                product.getPrice());
        });
        System.out.println("-------------");

    }

    
}
