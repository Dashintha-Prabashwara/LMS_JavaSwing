/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package evo_lms;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author praba
 */
public class Admin_records extends javax.swing.JInternalFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    int selectedid;
    /**
     * Creates new form Admin_records
     */
    public Admin_records() {
        initComponents();
        table();
    }
   
    void table(){
        try {
            conn =  EvoDatabase.connect();
            String getstudentdata = "SELECT Admin_Id,Admin_FirstName,Admin_lastName,Admin_UserName,Admin_Password FROM admins";
            pst = (PreparedStatement)conn.prepareStatement(getstudentdata);
            rs = pst.executeQuery();
            
            admin_table.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(Admin_records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        admin_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        admin_first_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        admin_last_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        admin_username = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        admin_password = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();

        jPanel13.setBackground(new java.awt.Color(222, 222, 222));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Admin Data Management Console");

        admin_table.setBackground(new java.awt.Color(222, 222, 222));
        admin_table.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        admin_table.setForeground(new java.awt.Color(51, 51, 51));
        admin_table.setModel(new javax.swing.table.DefaultTableModel(
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
        admin_table.setColumnSelectionAllowed(false);
        admin_table.setRowHeight(20);
        admin_table.setRowSelectionAllowed(true);
        admin_table.setSelectionBackground(new java.awt.Color(102, 102, 102));
        admin_table.setSelectionForeground(new java.awt.Color(204, 204, 204));
        admin_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        admin_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        admin_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                admin_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(admin_table);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("First Name  :");

        admin_first_name.setBackground(new java.awt.Color(204, 204, 204));
        admin_first_name.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        admin_first_name.setForeground(new java.awt.Color(51, 51, 51));
        admin_first_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_first_nameActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Last Name   :");

        admin_last_name.setBackground(new java.awt.Color(204, 204, 204));
        admin_last_name.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        admin_last_name.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("User Name   :");

        admin_username.setBackground(new java.awt.Color(204, 204, 204));
        admin_username.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        admin_username.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Password    :");

        admin_password.setBackground(new java.awt.Color(204, 204, 204));
        admin_password.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        admin_password.setForeground(new java.awt.Color(51, 51, 51));
        admin_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_passwordActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 204, 204));
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesAndIcons/search.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        search.setBackground(new java.awt.Color(204, 204, 204));
        search.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        search.setForeground(new java.awt.Color(51, 51, 51));
        search.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin_username, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin_password))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin_last_name))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admin_first_name)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_first_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(admin_last_name, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin_username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String userinput = search.getText();
            conn =  EvoDatabase.connect();
            String getdata = "SELECT Admin_Id,Admin_FirstName,Admin_lastName,Admin_UserName,Admin_Password FROM admins WHERE Admin_Id LIKE '%"+userinput+"%' OR Admin_FirstName LIKE '%"+userinput+"%' OR Admin_lastName LIKE '%"+userinput+"%' OR Admin_UserName LIKE '%"+userinput+"%'";
            pst = (PreparedStatement)conn.prepareStatement(getdata);
            ResultSet search_rs = pst.executeQuery();
            admin_table.setModel(DbUtils.resultSetToTableModel(search_rs));

        } catch (SQLException ex) {
            Logger.getLogger(Admin_records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

    }//GEN-LAST:event_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String message = "Are you sure you want to delete this record???";
        int reply = JOptionPane.showConfirmDialog(null, message, "Delete Record",JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
            try {
                String deleteqery ="DELETE FROM admins Where Admin_Id=?";
                pst = (PreparedStatement) conn.prepareStatement(deleteqery);
                pst.setInt(1, selectedid);
                pst.executeUpdate();
                table();
            } catch (SQLException ex) {
                Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String getfirstname = admin_first_name.getText();
            String getlastname = admin_last_name.getText();
            String getusername = admin_username.getText();
            String getpassword = admin_password.getText();

            String update = "UPDATE admins SET Admin_FirstName='" + getfirstname + "', Admin_lastName='" + getlastname + "', Admin_UserName='" + getusername + "', Admin_Password='" + getpassword + "' WHERE Admin_Id = '"+selectedid+"'";
            pst = (PreparedStatement) conn.prepareStatement(update);
            pst.execute();
            table();
            JOptionPane.showMessageDialog(null, "Record Successfully Updated..");

        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void admin_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_passwordActionPerformed

    private void admin_first_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_first_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_first_nameActionPerformed

    private void admin_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admin_tableMouseClicked
        int rowindex = admin_table.getSelectedRow();
        selectedid = (int) admin_table.getModel().getValueAt(rowindex, 0);
        
        try {
            String getrowdata = "SELECT * FROM admins WHERE Admin_Id="+selectedid;
            pst = (PreparedStatement)conn.prepareStatement(getrowdata);
            rs = pst.executeQuery();
            
            if(rs.next()==true){
                admin_first_name.setText(rs.getString("Admin_FirstName"));
                admin_last_name.setText(rs.getString("Admin_lastName"));
                admin_username.setText(rs.getString("Admin_UserName"));
                admin_password.setText(rs.getString("Admin_Password"));
                
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }//GEN-LAST:event_admin_tableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField admin_first_name;
    private javax.swing.JTextField admin_last_name;
    private javax.swing.JTextField admin_password;
    private javax.swing.JTable admin_table;
    private javax.swing.JTextField admin_username;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}