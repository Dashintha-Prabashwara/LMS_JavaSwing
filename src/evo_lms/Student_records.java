/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package evo_lms;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author praba
 */
public class Student_records extends javax.swing.JFrame {

    /**
     * Creates new form Student_records
     */
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    String selectedid;
    
    public Student_records() {
        initComponents();
        setLocationRelativeTo(null);
        table();
        
        
    }
    
    void table(){
        try {
            conn =  EvoDatabase.connect();
            String getstudentdata = "SELECT Student_ID,Student_Name,Email,Course_ID,Batch,NIC_NO,Phone_No,Address FROM students";
            pst = (PreparedStatement)conn.prepareStatement(getstudentdata);
            rs = pst.executeQuery();
            
            student_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
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
        jLabel2 = new javax.swing.JLabel();
        update_student_name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        update_student_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        update_student_id = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        update_student_courseid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        update_student_nic = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        update_student_phonenumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        update_student_address = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        batch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel13.setBackground(new java.awt.Color(222, 222, 222));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Student Data Management Console");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Student Name  :");

        update_student_name.setBackground(new java.awt.Color(204, 204, 204));
        update_student_name.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_name.setForeground(new java.awt.Color(51, 51, 51));
        update_student_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_nameActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Email         :");

        update_student_email.setBackground(new java.awt.Color(204, 204, 204));
        update_student_email.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_email.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Student Id    :");

        update_student_id.setBackground(new java.awt.Color(204, 204, 204));
        update_student_id.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_id.setForeground(new java.awt.Color(51, 51, 51));

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Course Id   :");

        update_student_courseid.setBackground(new java.awt.Color(204, 204, 204));
        update_student_courseid.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_courseid.setForeground(new java.awt.Color(51, 51, 51));
        update_student_courseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_courseidActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("NIC No        :");

        update_student_nic.setBackground(new java.awt.Color(204, 204, 204));
        update_student_nic.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_nic.setForeground(new java.awt.Color(51, 51, 51));
        update_student_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_nicActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Phone No      :");

        update_student_phonenumber.setBackground(new java.awt.Color(204, 204, 204));
        update_student_phonenumber.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_phonenumber.setForeground(new java.awt.Color(51, 51, 51));
        update_student_phonenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_student_phonenumberActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Address       :");

        update_student_address.setBackground(new java.awt.Color(204, 204, 204));
        update_student_address.setColumns(20);
        update_student_address.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        update_student_address.setForeground(new java.awt.Color(51, 51, 51));
        update_student_address.setRows(5);
        jScrollPane2.setViewportView(update_student_address);

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

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 204, 204));
        jButton6.setText("Back to DashBoard");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        student_table.setBackground(new java.awt.Color(222, 222, 222));
        student_table.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        student_table.setForeground(new java.awt.Color(51, 51, 51));
        student_table.setModel(new javax.swing.table.DefaultTableModel(
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
        student_table.setRowHeight(20);
        student_table.setSelectionBackground(new java.awt.Color(102, 102, 102));
        student_table.setSelectionForeground(new java.awt.Color(204, 204, 204));
        student_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        student_table.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        student_table.getTableHeader().setReorderingAllowed(false);
        student_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(student_table);
        if (student_table.getColumnModel().getColumnCount() > 0) {
            student_table.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            student_table.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            student_table.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            student_table.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Batch       :");

        batch.setBackground(new java.awt.Color(204, 204, 204));
        batch.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        batch.setForeground(new java.awt.Color(51, 51, 51));
        batch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_student_name))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_student_email))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_student_phonenumber))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_student_nic))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(update_student_courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(update_student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_student_email, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_student_courseid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_student_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(batch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_student_phonenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void update_student_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_student_nameActionPerformed

    private void update_student_courseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_courseidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_student_courseidActionPerformed

    private void update_student_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_nicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_student_nicActionPerformed

    private void update_student_phonenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_student_phonenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_student_phonenumberActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            String getname = update_student_name.getText();
            String getemail = update_student_email.getText();
            String getstudentid = update_student_id.getText();
            String getcourseid = update_student_courseid.getText();
            String getbatch = batch.getText();
            String getnic = update_student_nic.getText();
            int getphoneno = Integer.parseInt(update_student_phonenumber.getText());
            String getaddress = update_student_address.getText();

            String update = "UPDATE students SET Student_ID='" + getstudentid + "', Student_Name='" + getname + "', Email='" + getemail + "', Course_ID='" + getcourseid + "',Batch='" + getbatch + "', NIC_NO='" + getnic + "', Phone_No='" + getphoneno + "', Address='" + getaddress + "' WHERE Student_ID = '"+selectedid+"'";
            pst = (PreparedStatement) conn.prepareStatement(update);
            pst.execute();
            table();
            JOptionPane.showMessageDialog(null, "Record Successfully Updated..");

        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String message = "Are you sure you want to delete this record???";
        int reply = JOptionPane.showConfirmDialog(null, message, "Delete Record",JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
            try {
                String deleteqery ="DELETE FROM students Where Student_ID=?";
                pst = (PreparedStatement) conn.prepareStatement(deleteqery);
                pst.setString(1, selectedid);
                pst.executeUpdate();
                table();
            } catch (SQLException ex) {
                Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        record_inner_home recordinner = new record_inner_home();
        recordinner.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        try {
            String userinput = search.getText();
            conn =  EvoDatabase.connect();
            String getdata = "SELECT Student_ID,Student_Name,Email,Course_ID,NIC_NO,Phone_No,Address FROM students WHERE Student_ID LIKE '%"+userinput+"%' OR Student_Name LIKE '%"+userinput+"%' OR NIC_NO LIKE '%"+userinput+"%' OR Course_ID LIKE '%"+userinput+"%' OR Batch LIKE '%"+userinput+"%'";
            pst = (PreparedStatement)conn.prepareStatement(getdata);
            ResultSet search_rs = pst.executeQuery();
            student_table.setModel(DbUtils.resultSetToTableModel(search_rs));
            
        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchKeyReleased

    private void student_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_tableMouseClicked
        try {
        int rowindex = student_table.getSelectedRow();
        selectedid = (String) student_table.getModel().getValueAt(rowindex, 0);

        String getrowdata = "SELECT * FROM students WHERE Student_ID = ?";
        pst = (PreparedStatement) conn.prepareStatement(getrowdata);
        pst.setString(1, selectedid);

        rs = pst.executeQuery();

        if (rs.next()) {
            update_student_name.setText(rs.getString("Student_Name"));
            update_student_email.setText(rs.getString("Email"));
            update_student_id.setText(rs.getString("Student_ID"));
            update_student_courseid.setText(rs.getString("Course_ID"));
            batch.setText(rs.getString("Batch"));
            update_student_nic.setText(rs.getString("NIC_NO"));
            update_student_phonenumber.setText(String.valueOf(rs.getInt("Phone_No")));
            update_student_address.setText(rs.getString("Address"));
        }

        } catch (SQLException ex) {
            Logger.getLogger(Student_records.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }//GEN-LAST:event_student_tableMouseClicked

    private void batchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_records.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_records().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batch;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField search;
    private javax.swing.JTable student_table;
    private javax.swing.JTextArea update_student_address;
    private javax.swing.JTextField update_student_courseid;
    private javax.swing.JTextField update_student_email;
    private javax.swing.JTextField update_student_id;
    private javax.swing.JTextField update_student_name;
    private javax.swing.JTextField update_student_nic;
    private javax.swing.JTextField update_student_phonenumber;
    // End of variables declaration//GEN-END:variables
}