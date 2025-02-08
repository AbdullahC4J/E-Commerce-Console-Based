package com.ab.ecommerce;

import com.ab.ecommerce.users.Admin;

import java.util.Scanner;

public class UserInterface {
    /** The store of the user interface */
    private final Store store = new Store();
    /** The scanner of the user interface */
    private final Scanner scanner = new Scanner(System.in);

    public UserInterface(){
    }

    public void showMainPage(){
        System.out.println("1. Admin Page");
        System.out.println("2. Customer Page");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showAdminPage();
                break;
            case 2:
                showCustomerPage();
                break;
            case 3:
                System.exit(0);
        }
        showMainPage();
    }

    public void showAdminPage(){
        System.out.println("Admin Page");
        System.out.println("1. Sign Up");
        System.out.println("2. Login");
        System.out.println("3. Return to Main Page");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                showAdminSignUpPage();
                break;
            case 2:
                showAdminLoginPage();
                break;
            case 3:
                return;
        }   
    }

    //TODO : SEARCH ABOUT THE LOGIC IF THROUGH STORE OR ADMIN
    public void showAdminSignUpPage(){
        System.out.println("Sign Up New Admin");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        Admin admin = store.addNewAdmin(username, password);
        System.out.println("Admin signed up successfully");
        showAdminOperation(admin);
    }
    //TODO : SEARCH ABOUT THE LOGIC IF THROUGH STORE OR ADMIN
    public void showAdminLoginPage() {
        System.out.println("Login as Admin");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        Admin admin = store.verifyAdminLogin(username, password);
        if (admin == null) {
            System.out.println("Invalid Username or Password");
            return;
        } else {
            showAdminOperation(admin);
        }
    }
    //TODO : SEARCH ABOUT THE LOGIC IF THROUGH STORE OR ADMIN
    public void showAdminOperation(Admin admin){
        System.out.println("Admin " + admin.getUserName() + "Operations");
        System.out.println("1. Show item in stock");
        System.out.println("2. Show Electronics in stock");
        System.out.println("3. Show Books in stock");
        System.out.println("4. Show Fashions in stock");
        System.out.println("5. Show Groceries in stock");
        System.out.println("6. Add new item to stock");
        System.out.println("7. Remove item from stock");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> store.printStock();
            case 2 -> store.printStockElectronic();
            case 3 -> store.printStockBook();
            case 4 -> store.printStockFashion();
            case 5 -> store.printStockSuperMarket();
            case 6 -> store.addProductToStock(admin);
            case 7 -> store.removeProductFromStock(admin);
            default -> showAdminOperation(admin);
        }
    }
    








    public void showCustomerPage(){
        System.out.println("Customer Login");
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();
        if (username.equals("customer") && password.equals("customer")) {
            showCustomerPage();
        } else {
            System.out.println("Invalid username or password");         
        }
    }

    

}