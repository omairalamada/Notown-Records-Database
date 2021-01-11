/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static musicalbase.MainMusician.con;
import net.proteanit.sql.DbUtils;

public class addUpdateMusician extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public addUpdateMusician() {
        super("MainHome");
        initComponents();
        con = DBConnection.getCon();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jTextFName = new javax.swing.JTextField();
        jTextLName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jTextPhone = new javax.swing.JTextField();
        jButtonAddUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Musician Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Musician SSN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Last Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jTextSSN.setEnabled(false);
        jPanel1.add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 330, 40));
        jPanel1.add(jTextFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 330, 40));
        jPanel1.add(jTextLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 330, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));
        jPanel1.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 330, 40));
        jPanel1.add(jTextPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 330, 40));

        jButtonAddUpdate.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButtonAddUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAddUpdate.setText("SAVE");
        jButtonAddUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private Musician musician = new Musician();
    public void setData2(Musician c, MainMusician m){        
        musician = c;
        obj = m;
        String ssn = Integer.toString(musician.getSsn());
        String phone = Long.toString(musician.getPhone());
        
        this.jTextSSN.setText(ssn);
        this.jTextFName.setText(musician.getFirstName());
        this.jTextLName.setText(musician.getLastName());
        this.jTextAddress.setText(musician.getAddress());
        this.jTextPhone.setText(phone);
    }
    
    public void setData(int idnum, MainMusician m){
        obj = m;
        int id = idnum + 1;
        String p = id + "";
        this.jTextSSN.setText(p);
    }
    
    private void jButtonAddUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddUpdateActionPerformed
        int row = 0;
        String ssn = Integer.toString(musician.getSsn());
        
        int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.OK_CANCEL_OPTION);
        if(command == JOptionPane.OK_OPTION){
            
        if (jTextSSN.getText().equals(ssn)){
            
           try{
            if("".equals(jTextSSN.getText()) || "".equals(jTextFName.getText()) || "".equals(jTextLName.getText()) || "".equals(jTextAddress.getText()) || "".equals(jTextPhone.getText()))
                JOptionPane.showMessageDialog(null, "Please fill out all the blanks.");
            else{
             ps = con.prepareStatement("UPDATE Musician SET FName = ?, LName = ?, Address = ?, Phone = ?"
                    + " WHERE SSN = ?");
            ps.setString(1, jTextFName.getText());
            ps.setString(2, jTextLName.getText());
            ps.setString(3, jTextAddress.getText());
            ps.setString(4, jTextPhone.getText());
            ps.setString(5, jTextSSN.getText());
            row = ps.executeUpdate();
            
            if(row != 0){
                JOptionPane.showMessageDialog(this, "Musician successfully updated.");
                this.setVisible(false);
                obj.showMusicianJTable();
                
            }else{
                JOptionPane.showMessageDialog(this, "Musician was not updated.");
                jTextFName.setText(null);
                jTextLName.setText(null);
                jTextAddress.setText(null);
                jTextPhone.setText(null);
                jTextSSN.setText(null);
            }
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill the form...");
        }
        
        }
        else{
            try{
            if("".equals(jTextSSN.getText()) || "".equals(jTextFName.getText()) || "".equals(jTextLName.getText()) || "".equals(jTextAddress.getText()) || "".equals(jTextPhone.getText()))
                JOptionPane.showMessageDialog(null, "Please fill out all the blanks.");
            else{
            
            ps = con.prepareStatement("INSERT INTO Musician(FName, LName, Address, Phone)"
                +"values(?,?,?,?)");
            ps.setString(1, jTextFName.getText());
            ps.setString(2, jTextLName.getText());
            ps.setString(3, jTextAddress.getText());
            ps.setString(4, jTextPhone.getText());
            row = ps.executeUpdate();

            if(row != 0){
                JOptionPane.showMessageDialog(this, "Musician successfully inserted.");
                setVisible(false);
                obj.showMusicianJTable();             
            }else{
                JOptionPane.showMessageDialog(this, "Failed.");
                jTextFName.setText(null);
                jTextLName.setText(null);
                jTextAddress.setText(null);
                jTextPhone.setText(null);
                jTextSSN.setText(null);
            }
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill the form...");
        }
            
        }
        }
             
    }//GEN-LAST:event_jButtonAddUpdateActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addUpdateMusician().setVisible(true);
            }
        });
    }
    private MainMusician obj = new MainMusician();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextFName;
    private javax.swing.JTextField jTextLName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextSSN;
    // End of variables declaration//GEN-END:variables
}
