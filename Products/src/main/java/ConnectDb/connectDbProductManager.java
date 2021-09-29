/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author admin
 */
public class connectDbProductManager {
    public static Connection OpenConnection() throws SQLException{
        String connectionUrl = "jdbc:sqlserver://LONG:1433;databaseName=productsManager;user=sa;password=12345";
        Connection con = DriverManager.getConnection(connectionUrl);
        Statement stmt = con.createStatement();
        return con;
    }
}
