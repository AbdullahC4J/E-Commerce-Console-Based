package com.ab.ecommerce.users;

import com.ab.ecommerce.products.Product;
//import com.ab.ecommerce.billsandpayment.Bills;
import com.ab.ecommerce.cart.Cart;


public class Customer extends User{
    private String customerPhoneNumber;
    private String customerAddress;
    private Cart cart = new Cart();
    //private Bills bills = new Bills();


    public Customer(String customerPhoneNumber, String customerAddress, String userName, String password) {
        super(userName, password);
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerAddress = customerAddress; 
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public String getCustomerAddress() {    
        return customerAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }   

    public void printCustomerInfo() {
        System.out.println("Customer Information:");
        System.out.println("Name: " + getUserName());
        System.out.println("Phone Number: " + customerPhoneNumber);
        System.out.println("Address: " + customerAddress);
    }

    public void addProductToCart(Product product) {
        cart.addProduct(product);
    }

    public void removeProductFromCart(Product product) {
        cart.removeProduct(product);
    }


    public void checkout() {
        // TODO: Implement this method when object of Cart created
    }
}
