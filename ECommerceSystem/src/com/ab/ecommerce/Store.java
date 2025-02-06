package com.ab.ecommerce;

import com.ab.ecommerce.stock.Stock;    
import com.ab.ecommerce.cart.Cart;
import com.ab.ecommerce.users.*;

import java.util.ArrayList;
import java.util.List;



public class Store {
    private Stock stock;
    private List<Customer> customers;
    private List<Admin> admins;

    public Store(){
        this.stock = new Stock();
        this.customers = new ArrayList<>();
        this.admins = new ArrayList<>();
    }


    public void addProductToStock(Product product){
        stock.addProduct(product);
    }
    
    
}
