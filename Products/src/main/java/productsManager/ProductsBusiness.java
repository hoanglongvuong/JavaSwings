/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productsManager;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author admin
 */
public class ProductsBusiness {

    private productsDAO dao = new productsDAO();

    public boolean insert(product pro) throws SQLException {
        return dao.insert(pro);
    }

    public boolean update(product pro) throws SQLException {
        return dao.update(pro);
    }

    public boolean delete(int productID) throws SQLException {
        return dao.delete(productID);
    }

    public product findById(int productID) throws SQLException {
        return dao.findById(productID);
    }

    public List<product> findAll() throws SQLException {
        return dao.retrieve();
    }
}
