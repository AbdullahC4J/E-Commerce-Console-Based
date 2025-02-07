package com.ab.ecommerce.users;

import com.ab.ecommerce.products.Product;
import com.ab.ecommerce.stock.Stock;

import java.util.Scanner;


/**
 * Represents an Administrator in the e-commerce system.
 * Admins have special privileges to manage products, stock, and system settings.
 */
public class Admin extends User{
    /** The unique identifier for the admin */
    private int adminId;
    /** The stock of the store */       
    private Stock stock;
    /** The password checked of the admin */
    private boolean isAdminPasswordChecked = false;

    /**
     * Constructs an Admin with the specified credentials.
     * 
     * @param adminId       The unique identifier for the admin
     * @param adminName     The name of the admin
     * @param adminPassword The password of the admin
     */
    public Admin(int adminId, String adminName, String adminPassword, Stock stock) {
        super(adminName, adminPassword);
        this.adminId = adminId;
        this.stock = stock;
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

    /**
     * Adds a product to the stock.
     * @param product The product to add
     */
    public void addProductToStock(Product product) {
         if(!isAdminPasswordChecked){
            System.out.println("Enter Admin password: ");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            scanner.close();
            
            if(verifyPassword(password)){
                isAdminPasswordChecked = true;
            } else {
                System.out.println("Incorrect password");
                return;
            }
        }

        stock.addProduct(product);
     }

    /**
     * Removes a product from the stock.
     * @param product The product to remove
     */
    public void removeProductFromStock(Product product) {
        if(!isAdminPasswordChecked){
            System.out.println("Enter Admin password: ");
            Scanner scanner = new Scanner(System.in);
            String password = scanner.nextLine();
            scanner.close();
            
            if(verifyPassword(password)){
                isAdminPasswordChecked = true;
            } else {
                System.out.println("Incorrect password");
                return;
            }
        }   
        stock.removeProduct(product);
     }
    
}
