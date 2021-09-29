/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ConnectDb.connectDbProductManager;
import productsManager.product;

/**
 *
 * @author admin
 */
public class CustomerDAO {
    //insert 

    public boolean insert(Customer cus) throws SQLException {
        String sql = "insert into customerManager (CustomerId , Name , Address , Phone) values(?,?,?,?)";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, cus.getCustomerId());
        pstmt.setString(2, cus.getName());
        pstmt.setString(3, cus.getAddress());
        pstmt.setInt(4, cus.getPhone());
        return pstmt.executeUpdate() > 0;
    }

    public boolean update(Customer cus) throws SQLException {
        String sql = "update customerManager set Name = ? , Address = ?, Phone = ? where CustomerId = ? ";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(4, cus.getCustomerId());
        pstmt.setString(1, cus.getName());
        pstmt.setString(2, cus.getAddress());
        pstmt.setInt(3, cus.getPhone());

        return pstmt.executeUpdate() > 0;
    }

    public Customer findById(int customerId) throws SQLException {
        String sql = "select * from customerManager where customerId = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, customerId);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            Customer cus = new Customer();
            cus.setName(rs.getString("name"));
            cus.setAddress(rs.getString("Address"));
            cus.setPhone(rs.getInt("phone"));
            return cus;
        }
        return null;
    }

    //show data
    public List<Customer> retrieve() throws SQLException {
        String sql = "select * from customerManager";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        try (
                 ResultSet rs = pstmt.executeQuery();) {
            List<Customer> list = new ArrayList<Customer>();

            while (rs.next()) {
                Customer cus = new Customer();
                cus.setCustomerId(rs.getInt("CustomerId"));
                cus.setName(rs.getString("name"));
                cus.setAddress(rs.getString("Address"));
                cus.setPhone(rs.getInt("Phone"));

                list.add(cus);

            }
            return list;
        }
    }

    public boolean delete(int customerId) throws SQLException {
        String sql = "delete from customerManager  where CustomerId = ?";
        try (
                 Connection con = connectDbProductManager.OpenConnection();  
                PreparedStatement pstmt = con.prepareStatement(sql);) {
                pstmt.setInt(1, customerId);

            return pstmt.executeUpdate() > 0;
        }
    }
}
