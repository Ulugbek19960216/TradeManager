/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author HP
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String gmail;
    private String phone;
    private boolean status;
    private float balance;
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public float getBalance() {
        return balance;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public String getGmail() {
        return gmail;
    }
    
    public String getPhone() {
        return phone;
    }
    public boolean getStatus() {
        return status;
    }
    
    
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public  void  setStatus(boolean status) {
        this.status = status;
    }
    
    public void setBalance(float balance) {
        this.balance = balance;
    }
    
}
