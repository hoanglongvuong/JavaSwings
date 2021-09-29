/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillManager;

/**
 *
 * @author admin
 */
public class Bill {
    private int BillId , CustomerId , ProductId,QuantityBuy;
    private String CustomerName, ProductName , DateBuy;
    private float PriceOut;
    private float totalSalesBill;

    public float getTotalSalesBill() {
        return totalSalesBill;
    }

    public void setTotalSalesBill(float totalSalesBill) {
        this.totalSalesBill = totalSalesBill;
    }

    public Bill() {
    }

    public int getBillId() {
        return BillId;
    }

    public void setBillId(int BillId) {
        this.BillId = BillId;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public int getQuantityBuy() {
        return QuantityBuy;
    }

    public void setQuantityBuy(int QuantityBuy) {
        this.QuantityBuy = QuantityBuy;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getDateBuy() {
        return DateBuy;
    }

    public void setDateBuy(String DateBuy) {
        this.DateBuy = DateBuy;
    }

    public float getPriceOut() {
        return PriceOut;
    }

    public void setPriceOut(float PriceOut) {
        this.PriceOut = PriceOut;
    }

    public Bill(int BillId, int CustomerId, int ProductId, int QuantityBuy, String CustomerName, String ProductName, String DateBuy, float PriceOut , float totalSalesBill) {
        this.BillId = BillId;
        this.CustomerId = CustomerId;
        this.ProductId = ProductId;
        this.QuantityBuy = QuantityBuy;
        this.CustomerName = CustomerName;
        this.ProductName = ProductName;
        this.DateBuy = DateBuy;
        this.PriceOut = PriceOut;
        this.totalSalesBill = totalSalesBill;
    }
}
