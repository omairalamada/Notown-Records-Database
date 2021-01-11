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
//import static musicalbase.MainMusician.ps;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Omaiey
 */
public class editMusician extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public editMusician() {
        super("MainHome");
       initComponents();        
        con = DBConnection.getCon();

    }

    private Musician musician = new Musician();
    public void setData(Musician c){        
        musician = c;

        String ssn = Integer.toString(musician.getSsn());
        String phone = Long.toString(musician.getPhone());
        
        this.jTextSSN.setText(ssn);
        this.jTextFName.setText(musician.getFirstName());
        this.jTextLName.setText(musician.getLastName());
        this.jTextAddress.setText(musician.getAddress());
        this.jTextPhone.setText(phone);
    }
    
    public ArrayList<Musician> getMusicianList(){
        ArrayList<Musician> musicianList = new ArrayList<Musician>();
        
        try{
            ps = con.prepareStatement("SELECT  *FROM Musician");
            rs = ps.executeQuery();
            Musician musician;
            while(rs.next()){
                musician = new Musician(rs.getInt("SSN"), rs.getString("FName"), rs.getString("LName"), rs.getString("Address"), rs.getLong("Phone"));
                musicianList.add(musician);
            }
                       
        }catch (Exception e){
           e.printStackTrace();
        }        
        return musicianList;
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextLName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jButtonUpadate = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Musician Details");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Musician SSN:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel1.add(jTextLName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 310, 37));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel1.add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 310, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));
        jPanel1.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone Contact:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));
        jPanel1.add(jTextPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 310, 40));

        jButtonUpadate.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButtonUpadate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpadate.setText("SAVE");
        jButtonUpadate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpadateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpadate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, -1, -1));

        jButtonBack.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setText("<-");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));
        jPanel1.add(jTextFName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 310, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainMusician obj = new MainMusician();
        obj.setVisible(false);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonUpadateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpadateActionPerformed

        int row = 0;
        int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.OK_CANCEL_OPTION);
        if(command == JOptionPane.OK_OPTION){
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
                setVisible(false);
                MainMusician obj = new MainMusician();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
                
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
    }//GEN-LAST:event_jButtonUpadateActionPerformed

  
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
            java.util.logging.Logger.getLogger(editMusician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editMusician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editMusician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editMusician.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editMusician().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonUpadate;
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
