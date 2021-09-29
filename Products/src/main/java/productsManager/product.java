/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsManager;

/**
 *
 * @author admin
 */
public class product {
    private int productID, quantity;
    private String Name, DateIn , DateOut;
    private float PriceIn , PriceOut;

    public product(){
    }
    
    public product(int productID, int quantity, String Name, String DateIn, String DateOut, float PriceIn, float PriceOut) {
        this.productID = productID;
        this.quantity = quantity;
        this.Name = Name;
        this.DateIn = DateIn;
        this.DateOut = DateOut;
        this.PriceIn = PriceIn;
        this.PriceOut = PriceOut;
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDateIn() {
        return DateIn;
    }

    public void setDateIn(String DateIn) {
        this.DateIn = DateIn;
    }

    public String getDateOut() {
        return DateOut;
    }

    public void setDateOut(String DateOut) {
        this.DateOut = DateOut;
    }

    public float getPriceIn() {
        return PriceIn;
    }

    public void setPriceIn(float PriceIn) {
        this.PriceIn = PriceIn;
    }

    public float getPriceOut() {
        return PriceOut;
    }

    public void setPriceOut(float PriceOut) {
        this.PriceOut = PriceOut;
    }

}
