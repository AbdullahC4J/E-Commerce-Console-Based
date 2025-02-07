package com.ab.ecommerce;

import com.ab.ecommerce.stock.Stock;
import com.ab.ecommerce.users.Admin;
import com.ab.ecommerce.users.Customer;

import java.util.ArrayList;
import java.util.List;



public class Store {
    /** The stock of the store */   
    private final Stock stock = new Stock();
    /** The customers of the store */
    private final List<Customer> customers = new ArrayList<>(10);
    /** The admins of the store */
    private final List<Admin> admins = new ArrayList<>(3);

    /**
     * Constructs a new Store with the specified stock.
     */
    public Store(){
        admins.add(new Admin(1, "Abdullah", "Abdullah123", stock));
    }

    /**
     * Adds a new customer to the store.
     * @param customer The customer to add
     */
    public void addNewCustomer(Customer customer){
        customers.add(customer);
    }

    /**
     * Adds a new admin to the store.
     * @param admin The admin to add
     */
    public void addNewAdmin(Admin admin){
        admins.add(admin);
    }

    /**
     * Removes a customer from the store.
     * @param customer The customer to remove
     */
    public void removeCustomer(Customer customer){
        customers.remove(customer);
    }

    /**
     * Removes an admin from the store.
     * @param admin The admin to remove
     */
    public void removeAdmin(Admin admin){
        admins.remove(admin);
    }

    /**
     * Prints all customers in the store.
     */
    public void printCustomers(){
        for (Customer customer : customers) {
            customer.printCustomerInfo();
        }
    }

    /**
     * Prints all admins in the store.
     */
    public void printAdmins(){
        for (Admin admin : admins) {
            admin.printAdminInfo();
        }
    }

    /**
     * Prints all products in the stock.
     */
    public void printStock(){
        stock.printStock();
    }

    /**
     * Prints all books in the stock.
     */
    public void printStockBook(){
        stock.printStockBook();
    }   

    /**
     * Prints all electronics in the stock.
     */
    public void printStockElectronic(){
        stock.printStockElectronic();
    }       

    /**
     * Prints all fashion in the stock.
     */
    public void printStockFashion(){
        stock.printStockFashion();
    }   

    /**
     * Prints all supermarket in the stock.
     */
    public void printStockSuperMarket(){
        stock.printStockSuperMarket();
    }   

    /**
     * Prints the total stock count.
     */ 
    public void printTotalStock(){
        stock.getTotalStockCount();
    }
}
