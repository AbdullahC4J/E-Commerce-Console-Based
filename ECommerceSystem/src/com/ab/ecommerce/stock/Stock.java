package com.ab.ecommerce.stock;

import com.ab.ecommerce.products.*;
import java.util.ArrayList;

/**
 * Manages the inventory of all products in the e-commerce system.
 * Handles adding, removing, and querying stock levels for different product types.
 */
public class Stock {
    /** List to store book products in stock */
    protected ArrayList<Book> stockBookList = new ArrayList<>();
    
    /** List to store electronic products in stock */
    protected ArrayList<Electronic> stockElectronicList = new ArrayList<>();
    
    /** List to store fashion products in stock */
    protected ArrayList<Fashion> stockFashionList = new ArrayList<>();
    
    /** List to store supermarket products in stock */
    protected ArrayList<SuperMarket> stockSuperMarketList = new ArrayList<>();

    /**
     * Adds a book to the book stock list.
     * @param book The book to add to stock
     */
    public void addBook(Book book) {
        stockBookList.add(book);
    }

    /**
     * Adds an electronic item to the electronics stock list.
     * @param electronic The electronic item to add to stock
     */
    public void addElectronic(Electronic electronic) {
        stockElectronicList.add(electronic);
    }   

    /**
     * Adds a fashion item to the fashion stock list.
     * @param fashion The fashion item to add to stock
     */
    public void addFashion(Fashion fashion) {
        stockFashionList.add(fashion);
    }   

    /**
     * Adds a supermarket item to the supermarket stock list.
     * @param superMarket The supermarket item to add to stock
     */
    public void addSuperMarket(SuperMarket superMarket) {
        stockSuperMarketList.add(superMarket);
    }      

    /**
     * Removes a book from the book stock list.
     * @param book The book to remove from stock
     */
    public void removeBook(Book book) {
        stockBookList.remove(book);
    }       

    /**
     * Removes an electronic item from the electronics stock list.
     * @param electronic The electronic item to remove from stock
     */
    public void removeElectronic(Electronic electronic) {
        stockElectronicList.remove(electronic);
    }   

    /**
     * Removes a fashion item from the fashion stock list.
     * @param fashion The fashion item to remove from stock
     */
    public void removeFashion(Fashion fashion) {
        stockFashionList.remove(fashion);
    }   

    /**
     * Removes a supermarket item from the supermarket stock list.
     * @param superMarket The supermarket item to remove from stock
     */
    public void removeSuperMarket(SuperMarket superMarket) {
        stockSuperMarketList.remove(superMarket);
    } 

    /**
     * Prints the current stock levels for all product types.
     * Shows the number of items in each category.
     */
    public void printStock() {      
        System.out.println("Stock:\n" + "Books: " + stockBookList.size() + "\n" + 
            "Electronic: " + stockElectronicList.size() + "\n" + 
            "Fashion: " + stockFashionList.size() + "\n" + 
            "SuperMarket: " + stockSuperMarketList.size());
    }   

    /**
     * Prints detailed information for all books in stock.
     */
    public void printStockBook() {
        for (Book book : stockBookList) {
            book.printProductInfo();
        }
    }

    /**
     * Prints detailed information for all electronic items in stock.
     */
    public void printStockElectronic() {
        for (Electronic electronic : stockElectronicList) {
            electronic.printProductInfo();
        }
    }       

    /**
     * Prints detailed information for all fashion items in stock.
     */
    public void printStockFashion() {
        for (Fashion fashion : stockFashionList) {
            fashion.printProductInfo();
        }
    }      

    /**
     * Prints detailed information for all supermarket items in stock.
     */
    public void printStockSuperMarket() {
        for (SuperMarket superMarket : stockSuperMarketList) {
            superMarket.printProductInfo();
        }
    }              
    
    /**
     * Gets the total count of all items in stock.
     * @return Total number of items across all categories
     */
    public int getTotalStockCount() {
        return stockBookList.size() + stockElectronicList.size() + 
               stockFashionList.size() + stockSuperMarketList.size();
    }
    
    /**
     * Gets the count of books in stock.
     * @return Number of books in stock
     */
    public int getBookCount() {
        return stockBookList.size();
    }

    /**
     * Gets the count of electronic items in stock.
     * @return Number of electronic items in stock
     */
    public int getElectronicCount() {
        return stockElectronicList.size();
    }           

    /**
     * Gets the count of fashion items in stock.
     * @return Number of fashion items in stock
     */
    public int getFashionCount() {
        return stockFashionList.size();
    }

    /**
     * Gets the count of supermarket items in stock.
     * @return Number of supermarket items in stock
     */
    public int getSupermarketCount() {
        return stockSuperMarketList.size();
    }
}