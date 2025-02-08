package com.ab.ecommerce;

import com.ab.ecommerce.stock.Stock;
import com.ab.ecommerce.users.Admin;
import com.ab.ecommerce.users.Customer;
import com.ab.ecommerce.products.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



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
     * @param adminName The admin name
     * @param adminPassword The admin password
     */
    public Admin addNewAdmin(String adminName, String adminPassword){
        Admin admin = new Admin(admins.getLast().getAdminId() + 1, adminName,  adminPassword, stock);
        admins.add(admin);
        return admin;
    }

    public Admin verifyAdminLogin(String name, String paswrd){
        for (Admin admin : admins) {

            if (name.equals(admin.getUserName())){
                if(admin.verifyPassword(paswrd)) {
                    admin.setIsPasswordChecked(true);
                    return admin;
                }
                else{
                    return null;
                }
            }
        }
        return null;
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

    public void addProductToStock(Admin admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Category:");
        String category = scanner.nextLine();

        switch (category.toLowerCase()) {
            case "electronics" -> {
                System.out.println("Enter Product Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Product Price:");
                double price = scanner.nextDouble();
                System.out.println("Enter Product Brand:");
                String brand = scanner.nextLine();
                System.out.println("Enter Product Type:");
                String type = scanner.nextLine();
                System.out.println("Enter Product Color:");
                String color = scanner.nextLine();
                admin.addProductToStock(new Electronic(name, price, brand, ElectronicProductType.valueOf(type), color));
            }
                case "books" -> {
                System.out.println("Enter Product Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Product Price:");
                double price = scanner.nextDouble();
                System.out.println("Enter Product Author:");
                String author = scanner.nextLine();
                admin.addProductToStock(new Book(name, price, author));
            }
                case "fashion" -> {
                System.out.println("Enter Product Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Product Price:");
                double price = scanner.nextDouble();
                System.out.println("Enter Product Brand:");
                String brand = scanner.nextLine();
                System.out.println("Enter Product Type:");
                String type = scanner.nextLine();       
                System.out.println("Enter Product Color:");
                String color = scanner.nextLine();
                admin.addProductToStock(new Fashion(name, price, brand, FashionType.valueOf(type), color));
            }

            case "supermarket" -> {
                System.out.println("Enter Product Name:");
                String name = scanner.nextLine();
                System.out.println("Enter Product Price:");
                double price = scanner.nextDouble();
                System.out.println("Enter Product Brand:");
                String brand = scanner.nextLine();
                System.out.println("Enter Product Type:");
                String type = scanner.nextLine();
                System.out.println("Enter Product Color:");
                String color = scanner.nextLine();
                admin.addProductToStock(new Supermarket(name, price, brand, SupermarketType.valueOf(type), color));
            }
                default -> System.out.println("Invalid category");
        }
    }

    public void removeProductFromStock(Admin admin) {
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Enter Product Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Product Price:");
        double price = scanner.nextDouble();
        admin.removeProductFromStock(stock.getProduct(name, price));
        scanner.close();
    }

}
