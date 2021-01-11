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
import javax.swing.JOptionPane;

public class addNewMusician extends javax.swing.JFrame{
    
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public addNewMusician() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        LName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setText("Musician Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phone Contact:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));
        jPanel1.add(Phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, 330, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel1.add(FName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 330, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));
        jPanel1.add(LName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 330, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));
        jPanel1.add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 40));

        jButtonAdd.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAdd.setText("SAVE");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 520, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Musician SSN:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextSSN.setEnabled(false);
        jPanel1.add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

        public void setData(int idnum, MainMusician m){
        obj = m;
        int id = idnum + 1;
        String p = id + "";
        this.jTextSSN.setText(p);
    }
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed

        int row = 0;
        int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.OK_CANCEL_OPTION);
        
        if(command == JOptionPane.OK_OPTION){
            
        try{
            ps = con.prepareStatement("INSERT INTO Musician(FName, LName, Address, Phone)"
                +"values(?,?,?,?)");
            ps.setString(1, FName.getText());
            ps.setString(2, LName.getText());
            ps.setString(3, Address.getText());
            ps.setString(4, Phone.getText());
            
            row = ps.executeUpdate();
            
            if(row != 0){
                JOptionPane.showMessageDialog(this, "New Musician was Added Successfully!");
                setVisible(false);
                MainMusician obj = new MainMusician();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
                FName.setText(null);
                LName.setText(null);
                Address.setText(null);
                Phone.setText(null);
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill up the form or Wrong input!!!");
        }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewMusician().setVisible(true);
            }
        });
    }
    private MainMusician obj = new MainMusician();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField Phone;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextSSN;
    // End of variables declaration//GEN-END:variables
}
