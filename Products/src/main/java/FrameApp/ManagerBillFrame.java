/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameApp;

import BillManager.Bill;
import BillManager.BillDAO;
import ConnectDb.connectDbProductManager;
import customerManager.Customer;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import productsManager.product;
import productsManager.productsDAO;

/**
 *
 * @author admin
 */
public class ManagerBillFrame extends javax.swing.JPanel {

    Calendar cal = Calendar.getInstance();
    private boolean isEditMode = false;
    private DefaultTableModel tblmodel = null;
    private BillDAO billDao = new BillDAO();

    /**
     * Creates new form ManagerBillFrame
     */
    public ManagerBillFrame() throws SQLException {
        initComponents();
        initTable();
//        getListCombox();
    }

    public void initTable() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new Object[]{"Mã", "Mã Khách Hàng", "Tên Khách Hàng",
            "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng Mua", "Giá Bán", "Ngày Mua"});
        tblBill.setModel(tblmodel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        txtBillId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtBillQuantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBillDateOut = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtProductName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        txtBillPriceOut = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNewBill = new javax.swing.JButton();
        btnUpdateBill = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDeleteBill = new javax.swing.JButton();
        btnShowListBill = new javax.swing.JButton();
        btnAddBill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        btnFindById = new javax.swing.JButton();
        txtfindbyid = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtTotalById = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản Lí Đơn Hàng");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Mã Sản Phẩm:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã Hóa Đơn");

        txtCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số Lượng mua:");

        txtProductId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtProductIdMouseEntered(evt);
            }
        });
        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });
        txtProductId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductIdKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Giá Bán:");

        txtBillQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillQuantityActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Ngày Mua Hàng:");

        txtBillDateOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillDateOutActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tên Khách Hàng:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên Sản Phẩm:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã Khách Hàng:");

        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });

        txtBillPriceOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillPriceOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(269, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBillDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBillQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillPriceOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBillDateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNewBill.setText("Tạo mới Đơn Hàng");
        btnNewBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewBillActionPerformed(evt);
            }
        });

        btnUpdateBill.setText("Chỉnh Sửa Đơn Hàng");
        btnUpdateBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBillActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDeleteBill.setText("Xóa Đơn Hàng");
        btnDeleteBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBillActionPerformed(evt);
            }
        });

        btnShowListBill.setText("Thông Tin Đơn Hàng");
        btnShowListBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowListBillActionPerformed(evt);
            }
        });

        btnAddBill.setText("Lưu Đơn Hàng");
        btnAddBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnShowListBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNewBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeleteBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdateBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddBill)
                .addGap(18, 18, 18)
                .addComponent(btnNewBill)
                .addGap(23, 23, 23)
                .addComponent(btnShowListBill)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteBill)
                .addGap(18, 18, 18)
                .addComponent(btnUpdateBill)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(92, 92, 92))
        );

        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBill);

        btnFindById.setText(" Thống Kê Đơn Hàng Theo Mã");
        btnFindById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindByIdActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Tổng :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnFindById)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtfindbyid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(98, 98, 98)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTotalById))
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1003, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindById)
                    .addComponent(txtfindbyid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtTotalById, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        try {
            productsManager.product pro = billDao.selectProductId(Integer.parseInt(txtProductId.getText()));
            if (pro != null) {
                txtProductName.setText(pro.getName());
            } else {
                JOptionPane.showMessageDialog(this, "không tìm thấy mã khách hàng !");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error : " + e);
        }
    }//GEN-LAST:event_txtProductIdActionPerformed

    private void txtBillDateOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillDateOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillDateOutActionPerformed

    private void btnNewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewBillActionPerformed
        txtBillId.setText("");
        txtCustomerId.setText("");
        txtCustomerName.setText("");
        txtProductId.setText("");
        txtProductName.setText("");
        txtBillPriceOut.setText("");
        txtBillQuantity.setText("");
        txtBillDateOut.setText("");
    }//GEN-LAST:event_btnNewBillActionPerformed

    private void txtBillQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillQuantityActionPerformed

    private void btnAddBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBillActionPerformed
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        try {

            Bill bill = new Bill();

            bill.setBillId(Integer.parseInt(txtBillId.getText()));
            bill.setCustomerId(Integer.parseInt(txtCustomerId.getText()));
            bill.setCustomerName(txtCustomerName.getText());
            bill.setProductId(Integer.parseInt(txtProductId.getText()));
            bill.setProductName(txtProductName.getText());
            bill.setQuantityBuy(Integer.parseInt(txtBillQuantity.getText()));
            bill.setPriceOut(Float.parseFloat(txtBillPriceOut.getText()));

            txtBillDateOut.setText("" + date);
            bill.setDateBuy(txtBillDateOut.getText());

            BillDAO billDao = new BillDAO();
            billDao.insert(bill);
//            if (isEditMode) {
//                if (this.billDao.findById(Integer.parseInt(txtBillId.getText())) == null) {
//                    JOptionPane.showMessageDialog(this, "Mã Đơn Hàng tồn tại ");
//                    return;
//                }// neu ton tai se goi method update
//                this.billDao.update(bill);
//                billDao.updateQuantity(bill);
//
//            } else {
//                if (billDao.findById(Integer.parseInt(txtBillId.getText())) != null) {
//                    JOptionPane.showMessageDialog(this, "Nhập đơn hàng mới");
//                    return;
//                }// neu ton tai thi se them moi 
//                this.billDao.insert(bill);
//                billDao.updateQuantity(bill);
//            }
            btnShowListBillActionPerformed(evt);
            JOptionPane.showMessageDialog(this, "luu thanh cong");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error : " + e);
        }
    }//GEN-LAST:event_btnAddBillActionPerformed

    private void btnShowListBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowListBillActionPerformed
        tblmodel.setRowCount(0);
        List<Bill> list;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        try {
            list = billDao.retrieve();
            for (Bill item : list) {
                Object[] row = new Object[]{
                    item.getBillId(), item.getCustomerId(), item.getCustomerName(),
                    item.getProductId(), item.getProductName(),
                    item.getQuantityBuy(), currencyVN.format(item.getPriceOut()), item.getDateBuy()};

                tblmodel.addRow(row);
            }
            tblmodel.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnShowListBillActionPerformed

    private void btnDeleteBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBillActionPerformed
        try {
            boolean bill = billDao.delete(Integer.parseInt(txtBillId.getText()));
            if (bill) {
                JOptionPane.showMessageDialog(this, "Xóa thành công ! ");
                btnShowListBillActionPerformed(evt);
            } else {
                JOptionPane.showMessageDialog(this, "Không Thể Xóa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteBillActionPerformed

    private void btnUpdateBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBillActionPerformed
        try {
            Bill bill = billDao.findById(Integer.parseInt(txtBillId.getText()));
            if (bill != null) {
                txtCustomerId.setText("" + bill.getCustomerId());
                txtCustomerName.setText(bill.getCustomerName());
                txtProductId.setText("" + bill.getProductId());
                txtProductName.setText(bill.getProductName());
                txtBillQuantity.setText("" + bill.getQuantityBuy());
                txtBillPriceOut.setText("" + bill.getPriceOut());
                txtBillDateOut.setText(bill.getDateBuy());
//                fillEmloyeelToForm(bill);
                billDao.update(bill);
            } else {
                JOptionPane.showMessageDialog(this, "mã sản phẩm không tồn tại ! ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error :" + e);
        }
    }//GEN-LAST:event_btnUpdateBillActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        JOptionPane.showConfirmDialog(this, "bạn có muốn thoát không ? ");
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void fillEmloyeelToForm(Bill bill) { // do du lieu vao bang // neu tim kiem tra ve employee hien co trong ds va nap du lieu len fomr
        //che do edit
        txtCustomerId.setText("" + bill.getCustomerId());
        txtCustomerName.setText(bill.getCustomerName());
        txtProductId.setText("" + bill.getProductId());
        txtProductName.setText(bill.getProductName());
        txtBillQuantity.setText("" + bill.getQuantityBuy());
        txtBillPriceOut.setText("" + bill.getPriceOut());
        txtBillDateOut.setText(bill.getDateBuy());
        txtBillId.setText("" + bill.getBillId());
    }

    private void tblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillMouseClicked
        int row = tblBill.getSelectedRow();
        if (row > 0) {
            int BillId = (int) tblBill.getValueAt(row, 0);
            try {
                Bill bill;
                bill = billDao.findByIdtbl(BillId);
                if (bill != null) {
                    fillEmloyeelToForm(bill);
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error:" + ex);
            }
        }
    }//GEN-LAST:event_tblBillMouseClicked

    private void txtBillPriceOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillPriceOutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillPriceOutActionPerformed

    private void txtProductIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductIdKeyPressed

    }//GEN-LAST:event_txtProductIdKeyPressed

    private void txtProductIdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductIdMouseEntered

    }//GEN-LAST:event_txtProductIdMouseEntered

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
        try {
            customerManager.Customer cus = billDao.selectCustomerId(Integer.parseInt(txtCustomerId.getText()));
            if (cus != null) {
                txtCustomerName.setText(cus.getName());
            } else {
                JOptionPane.showMessageDialog(this, "không tìm thấy mã khách hàng !");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error : " + e);
        }
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void btnFindByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindByIdActionPerformed
        tblmodel.setRowCount(0);
        List<Bill> list;
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        try {
            list = (List<Bill>) billDao.findByGroupId(Integer.parseInt(txtfindbyid.getText()));
            Bill bill = billDao.TotalById(Integer.parseInt(txtfindbyid.getText()));
            txtTotalById.setText("" + currencyVN.format(bill.getTotalSalesBill()));
            for (Bill item : list) {
                Object[] row = new Object[]{
                    item.getBillId(), item.getCustomerId(), item.getCustomerName(),
                    item.getProductId(), item.getProductName(),
                    item.getQuantityBuy(), currencyVN.format(item.getPriceOut()), item.getDateBuy()};

                tblmodel.addRow(row);
            }
            tblmodel.fireTableDataChanged();

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnFindByIdActionPerformed
//    public List<product> getListCombox() throws SQLException {
//        JcomboboxChoose.removeAllItems();
//        String sql = "select * from productsManager";
//        Connection con = connectDbProductManager.OpenConnection();
//        PreparedStatement pstmt = con.prepareStatement(sql);
//
//        try (
//                 ResultSet rs = pstmt.executeQuery();) {
//            List<product> list = new ArrayList<product>();
//
//            while (rs.next()) {
//                product pro;
//                pro = new product(rs.getInt("productID"),
//                        rs.getInt("quantity"),
//                        rs.getString("name"),
//                        rs.getString("dateIn"),
//                        rs.getString("dateOut"),
//                        rs.getFloat("priceIn"),
//                        rs.getFloat("priceOut"));
//
//                list.add(pro);
//                JcomboboxChoose.addItem(rs.getString("name"));
//            }
//            return list;
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddBill;
    private javax.swing.JButton btnDeleteBill;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindById;
    private javax.swing.JButton btnNewBill;
    private javax.swing.JButton btnShowListBill;
    private javax.swing.JButton btnUpdateBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField txtBillDateOut;
    private javax.swing.JTextField txtBillId;
    private javax.swing.JTextField txtBillPriceOut;
    private javax.swing.JTextField txtBillQuantity;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtProductId;
    private javax.swing.JTextField txtProductName;
    private javax.swing.JTextField txtTotalById;
    private javax.swing.JTextField txtfindbyid;
    // End of variables declaration//GEN-END:variables
}
