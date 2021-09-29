/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerManager;

/**
 *
 * @author admin
 */
public class Customer {
    private int CustomerId, Phone;
    private String Name , Address;

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Customer() {
    }

    public Customer(int CustomerId, int Phone, String Name, String Address) {
        this.CustomerId = CustomerId;
        this.Phone = Phone;
        this.Name = Name;
        this.Address = Address;
    }
    
}
