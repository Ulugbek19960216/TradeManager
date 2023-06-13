/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class Product {
    private ArrayList<Product> products;
    private String name;
    private String color;
    private double purchasingPrice;
    private double sellingPrice;
    private int quantity;
    private boolean status;
    
    
    
    
    
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return purchasingPrice;
    }
    
    public int getKuantity() {
        return quantity;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double price) {
        this.purchasingPrice = price;
    }
    
    public void setKuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public  void  setStatus(boolean status) {
        this.status = status;
    }
    // name price kuantity statut
    
//    public String getColor() {
//        
//    }
}
