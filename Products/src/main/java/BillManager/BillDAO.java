/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillManager;

import customerManager.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ConnectDb.connectDbProductManager;
import java.text.NumberFormat;
import java.util.Locale;
import productsManager.product;

/**
 *
 * @author admin
 */
public class BillDAO {

    private ArrayList<Bill> list = new ArrayList<>();
    private int currentIndex = 0;

    public void setCurrentEmployee(Bill bill) {
        currentIndex = list.indexOf(bill);
    }

    //insert
    public boolean insert(Bill bill) throws SQLException {
        String sql = "insert into BillManager (billId , customerId , customerName , "
                + "productID , productName , QuantityBuy, PriceOut , DateBuy) "
                + "values(?,?,?,?,?,?,?,?)";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, bill.getBillId());
        pstmt.setInt(2, bill.getCustomerId());
        pstmt.setString(3, bill.getCustomerName());
        pstmt.setInt(4, bill.getProductId());
        pstmt.setString(5, bill.getProductName());
        pstmt.setInt(6, bill.getQuantityBuy());
        pstmt.setFloat(7, bill.getPriceOut());
        pstmt.setString(8, bill.getDateBuy());
        return pstmt.executeUpdate() > 0;
    }

    public boolean updateQuantity(Bill bill) throws SQLException {
        String sql = "update productsManager\n"
                + "set quantity = productsManager.quantity - ? from BillManager\n"
                + "where productsManager.productID = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, bill.getQuantityBuy());
        pstmt.setInt(2, bill.getProductId());
        return pstmt.executeUpdate() > 0;
    }

    //show list bill
    public List<Bill> retrieve() throws SQLException {
        String sql = "select * from BillManager";

        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        try (
                 ResultSet rs = pstmt.executeQuery();) {
            List<Bill> list = new ArrayList<Bill>();

            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillId(rs.getInt("BillId"));
                bill.setCustomerId(rs.getInt("CustomerId"));
                bill.setCustomerName(rs.getString("customerName"));
                bill.setProductId(rs.getInt("productId"));
                bill.setProductName(rs.getString("productName"));
                bill.setDateBuy(rs.getString("dateBuy"));
                bill.setQuantityBuy(rs.getInt("quantityBuy"));
                bill.setPriceOut(rs.getFloat("priceOut"));

                list.add(bill);
            }
            return list;

        }
    }

    public List<Bill> findByGroupId(int BillId) throws SQLException {
        String sql = "select * from BillManager  where billId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, BillId);
        try (
                 ResultSet rs = pstmt.executeQuery();) {

            List<Bill> list = new ArrayList<Bill>();

            while (rs.next()) {
                Bill bill = new Bill();
                bill.setBillId(rs.getInt("BillId"));
                bill.setCustomerId(rs.getInt("CustomerId"));
                bill.setCustomerName(rs.getString("customerName"));
                bill.setProductId(rs.getInt("productId"));
                bill.setProductName(rs.getString("productName"));
                bill.setDateBuy(rs.getString("dateBuy"));
                bill.setQuantityBuy(rs.getInt("quantityBuy"));
                bill.setPriceOut(rs.getFloat("priceOut"));

                list.add(bill);
            }
            return list;

        }
    }

    public Bill findByIdtbl(int BillId) throws SQLException {
        String sql = "select * from BillManager where billId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, BillId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Bill bill = new Bill();
            bill.setBillId(rs.getInt("billId"));
            bill.setCustomerId(rs.getInt("CustomerId"));
            bill.setCustomerName(rs.getString("customerName"));
            bill.setProductId(rs.getInt("productId"));
            bill.setProductName(rs.getString("productName"));
            bill.setDateBuy(rs.getString("dateBuy"));
            bill.setQuantityBuy(rs.getInt("quantityBuy"));
            bill.setPriceOut(rs.getFloat("priceOut"));
            return bill;
        }
        return null;
    }

    public Bill findById(int BillId) throws SQLException {
        String sql = "select * from BillManager where billId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, BillId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Bill bill = new Bill();

            bill.setCustomerId(rs.getInt("CustomerId"));
            bill.setCustomerName(rs.getString("customerName"));
            bill.setProductId(rs.getInt("productId"));
            bill.setProductName(rs.getString("productName"));
            bill.setDateBuy(rs.getString("dateBuy"));
            bill.setQuantityBuy(rs.getInt("quantityBuy"));
            bill.setPriceOut(rs.getFloat("priceOut"));
            return bill;
        }
        return null;
    }

    public boolean update(Bill bill) throws SQLException {
        String sql = "update BillManager set CustomerId = ? , customerName = ?, productId = ? , productName = ?, quantityBuy= ? , priceOut = ? , dateBuy = ?  where billId = ? ";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(8, bill.getBillId());
        pstmt.setInt(1, bill.getCustomerId());
        pstmt.setString(2, bill.getCustomerName());
        pstmt.setInt(3, bill.getProductId());
        pstmt.setString(4, bill.getProductName());
        pstmt.setInt(5, bill.getQuantityBuy());
        pstmt.setFloat(6, bill.getPriceOut());
        pstmt.setString(7, bill.getDateBuy());

        return pstmt.executeUpdate() > 0;
    }

    public boolean delete(int BillId) throws SQLException {
        String sql = "delete from BillManager  where billId = ?";
        try (
                 Connection con = connectDbProductManager.OpenConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, BillId);

            return pstmt.executeUpdate() > 0;
        }
    }

    //produt enter show name product
    public product selectProductId(int productID) throws SQLException {
        String sql = "select Name from productsManager where productID = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, productID);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            product pro = new product();

            pro.setName(rs.getString("name"));
            return pro;
        }
        return null;
    }

    //customer enter show name customer
    public Customer selectCustomerId(int CustomerId) throws SQLException {
        String sql = "select Name from customerManager where CustomerId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, CustomerId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Customer cus = new Customer();

            cus.setName(rs.getString("name"));
            return cus;
        }
        return null;
    }

    public Bill TotalSalesBill() throws SQLException {
        String sql = "select sum(priceOut) as tong from BillManager";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Bill bill = new Bill();

            bill.setTotalSalesBill(rs.getFloat("tong"));
            return bill;
        }
        return null;
    }
    
        public Bill TotalById(int BillId) throws SQLException {
        String sql = "select sum(priceOut) as tong from BillManager where billId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, BillId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Bill bill = new Bill();

            bill.setTotalSalesBill(rs.getFloat("tong"));
            return bill;
        }
        return null;
    }

}
