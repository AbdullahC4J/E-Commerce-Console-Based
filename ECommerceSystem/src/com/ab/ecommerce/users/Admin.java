package com.ab.ecommerce.users;

import com.ab.ecommerce.products.Product;

/**
 * Represents an Administrator in the e-commerce system.
 * Admins have special privileges to manage products, stock, and system settings.
 */
public class Admin extends User{
    /** The unique identifier for the admin */
    private int adminId;
    private Stock stock;

    /**
     * Constructs an Admin with the specified credentials.
     * 
     * @param adminId       The unique identifier for the admin
     * @param adminName     The name of the admin
     * @param adminPassword The password of the admin
     */
    public Admin(int adminId, String adminName, String adminPassword) {
        super(adminName, adminPassword);
        this.adminId = adminId;
    }   

    /**
     * Gets the admins unique identifier.
     * @return The admin ID
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * Sets the admin's ID.
     * @param adminId The new admin ID
     * @throws IllegalArgumentException if the ID is invalid
     */
    public void setAdminId(int adminId) {
        if (adminId <= 0) {
            throw new IllegalArgumentException("Admin ID must be a positive number");
        }
        this.adminId = adminId;
    }

    /**
     * Prints admin information including ID and name.
     * For security reasons, password is not displayed.
     */
    public void printAdminInfo() {
        System.out.println("Admin Information:");
        System.out.println("ID: " + adminId);
        System.out.println("Name: " + getUserName());
    }

     public void addProductToStock(Product product) {
       // TODO: Implement this method when object of Stock created
     }

     public void removeProductFromStock(Product product) {
       // TODO: Implement this method when object of Stock created
     }
    
    
}
