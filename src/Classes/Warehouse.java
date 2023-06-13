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
public class Warehouse {
    private Observable observable;
    private static Warehouse instance = null;
    private ArrayList<Product> productList = new ArrayList<>();
    private ArrayList<Customer> customerList = new ArrayList<>();
    
    private Warehouse() {
        
    }
    
    public void registerObservable(Observable o) {
        observable = o;
    }
    
    public static Warehouse getInstance() {
        if(instance == null) {
            instance = new Warehouse();
        }
        return instance;
    }
    
    // Add Product
    public void addProduct(Product item) {
        productList.add(item);
        observable.onUpdate();

    }
    
    public Product getProduct(int index) {
        return productList.get(index);
    }
    
      public int getProductCount() {
        return productList.size();
    }
    
      // Create Customer
      
    public void createCustomer(Customer customer) {
        customerList.add(customer);
        observable.onUpdate();
    }
    
    public Customer getCustomer(int index) {
        return customerList.get(index);
    }
    
    public int getCustomerCount() {
        return customerList.size();
    }
    
    
    

            
}
