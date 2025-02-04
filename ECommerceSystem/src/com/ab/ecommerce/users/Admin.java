package com.ab.ecommerce.users;

/**
 * Represents an Administrator in the e-commerce system.
 * Admins have special privileges to manage products, stock, and system settings.
 */
public class Admin {
    /** The unique identifier for the admin */
    private int adminId;

    /** The name of the admin */
    private String adminName;
    
    /** The password of the admin */
    private String adminPassword;

    /**
     * Constructs an Admin with the specified credentials.
     * 
     * @param adminId       The unique identifier for the admin
     * @param adminName     The name of the admin
     * @param adminPassword The password of the admin
     */
    public Admin(int adminId, String adminName, String adminPassword) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.adminPassword = adminPassword;
    }   

    /**
     * Gets the admin's unique identifier.
     * @return The admin ID
     */
    public int getAdminId() {
        return adminId;
    }

    /**
     * Gets the admin's name.
     * @return The admin name
     */
    public String getAdminName() {
        return adminName;
    }  

    /**
     * Sets the admin's name.
     * @param adminName The new admin name
     * @throws IllegalArgumentException if the name is null or empty
     */
    public void setAdminName(String adminName) {
        if (adminName == null || adminName.trim().isEmpty()) {
            throw new IllegalArgumentException("Admin name cannot be empty");
        }
        this.adminName = adminName;
    }

    /**
     * Sets the admin's password.
     * @param adminPassword The new admin password
     * @throws IllegalArgumentException if the password is null or less than 8 characters
     */
    public void setAdminPassword(String adminPassword) {
        if (adminPassword == null || adminPassword.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters");
        }
        this.adminPassword = adminPassword;
    }

    /**
     * Prints admin information including ID and name.
     * For security reasons, password is not displayed.
     */
    public void printAdminInfo() {
        System.out.println("Admin Information:");
        System.out.println("ID: " + adminId);
        System.out.println("Name: " + adminName);
    }

    /**
     * Verifies if the provided password matches the admin's password.
     * @param password The password to verify
     * @return true if the password matches, false otherwise
     */
    public boolean verifyPassword(String password) {
        return this.adminPassword != null && this.adminPassword.equals(password);
    }

    @Override
    public String toString() {
        return "Admin{id=" + adminId + ", name='" + adminName + "'}";
    }

    // public void addProductToStock(Product product) {
    //   // TODO: Implement this method
    // }

    // public void removeProductFromStock(Product product) {
    //   // TODO: Implement this method
    // }
    
    
}
