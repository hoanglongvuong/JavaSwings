/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsManager;

import ConnectDb.connectDbProductManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class productsDAO {

    //insert 
    public boolean insert(product pro) throws SQLException {
        String sql = "insert into productsManager (productID , Name , PriceIn , PriceOut , quantity , DateIn , DateOut)   values(?,?,?,?,?,?,?)";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, pro.getProductID());
        pstmt.setString(2, pro.getName());
        pstmt.setFloat(3, pro.getPriceIn());
        pstmt.setFloat(4, pro.getPriceOut());
        pstmt.setInt(5, pro.getQuantity());
        pstmt.setString(6, pro.getDateIn());
        pstmt.setString(7, pro.getDateOut());

        return pstmt.executeUpdate() > 0;
    }

    public boolean update(product pro) throws SQLException {
        String sql = "update productsManager set Name = ? , PriceIn = ?, PriceOut = ? , quantity = ?, DateIn = ?, DateOut= ?   where productID = ? ";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(7, pro.getProductID());
        pstmt.setString(1, pro.getName());
        pstmt.setFloat(2, pro.getPriceIn());
        pstmt.setFloat(3, pro.getPriceOut());
        pstmt.setInt(4, pro.getQuantity());
        pstmt.setString(5, pro.getDateIn());
        pstmt.setString(6, pro.getDateOut());

        return pstmt.executeUpdate() > 0;
    }

    public product findById(int productID) throws SQLException {
        String sql = "select * from productsManager where productID = ?";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        pstmt.setInt(1, productID);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            product pro = new product();
            pro.setName(rs.getString("name"));
            pro.setPriceIn(rs.getFloat("priceIn"));
            pro.setPriceOut(rs.getFloat("priceOut"));
            pro.setQuantity(rs.getInt("quantity"));
            pro.setDateIn(rs.getString("dateIn"));
            pro.setDateOut(rs.getString("dateOut"));
            return pro;
        }
        return null;
    }

    //show data
    public List<product> retrieve() throws SQLException {
        String sql = "select * from productsManager";
        Connection con = connectDbProductManager.OpenConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);

        try (
                 ResultSet rs = pstmt.executeQuery();) {
            List<product> list = new ArrayList<product>();

            while (rs.next()) {
                product pro = new product();
                pro.setProductID(rs.getInt("productID"));
                pro.setName(rs.getString("name"));
                pro.setPriceIn(rs.getFloat("priceIn"));
                pro.setPriceOut(rs.getFloat("priceOut"));
                pro.setQuantity(rs.getInt("quantity"));
                pro.setDateIn(rs.getString("dateIn"));
                pro.setDateOut(rs.getString("dateOut"));

                list.add(pro);

            }
            return list;
        }
    }



    public boolean delete(int productID) throws SQLException {
        String sql = "delete from productsManager  where productID = ?";
        try (
                 Connection con = connectDbProductManager.OpenConnection();  PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setInt(1, productID);

            return pstmt.executeUpdate() > 0;
        }
    }
}
