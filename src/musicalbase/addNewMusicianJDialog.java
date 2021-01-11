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
import static musicalbase.addNewMusician.ps;
/**
 *
 * @author Omaiey
 */
public class addNewMusicianJDialog extends javax.swing.JDialog {

    static Connection con = DBConnection.getCon();
    static Statement ps;
    static ResultSet rs;
    static PreparedStatement pst;
    
    public addNewMusicianJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFirstName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextPhone = new javax.swing.JTextField();
        jTextAddress = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ADD New Musician");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Muscian SSN:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 107, -1, -1));
        jPanel1.add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 137, 314, 36));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 191, -1, -1));
        jPanel1.add(jTextFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 221, 314, 41));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 284, -1, -1));
        jPanel1.add(jTextLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 314, 310, 37));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));
        jPanel1.add(jTextPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 310, 40));
        jPanel1.add(jTextAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 40));

        jButtonAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAdd.setText("SAVE");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, -1, -1));

        jButtonExit.setBackground(new java.awt.Color(204, 204, 204));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonExit.setText("X");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        setVisible(false);
        MainMusician obj = new MainMusician();
        obj.setLocationRelativeTo(null);
        obj.setVisible(false);
    }//GEN-LAST:event_jButtonExitActionPerformed
    
    public void setData(int idnum){
        int id = idnum + 1;
        String p = id + "";
        this.jTextSSN.setText(p);
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
 
        String FirstName = jTextFirstName.getText();
        String LastName = jTextLastName.getText();
        String MAddress = jTextAddress.getText();
        String PhoneNo = jTextPhone.getText();
        int row = 0;
        
        try{
            if("".equals(jTextSSN.getText()) || "".equals(jTextFirstName.getText()) || "".equals(jTextLastName.getText()) || "".equals(jTextAddress.getText()) || "".equals(jTextPhone.getText()))
                JOptionPane.showMessageDialog(null, "Please fill out all the blanks.");
            else{
            ps = con.createStatement();
            String query = "INSERT INTO Musician(FName, LName, Address, Phone)"
                        + "VALUES('"+FirstName+"','"+LastName+"','"+MAddress+"','"+PhoneNo+"')";
            row = ps.executeUpdate(query);
            if(row != 0){
                JOptionPane.showMessageDialog(this, "New Musician was Added Successfully!");
                setVisible(false);
                MainMusician obj = new MainMusician();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
                jTextFirstName.setText(null);
                jTextLastName.setText(null);
                jTextAddress.setText(null);
                jTextPhone.setText(null);
            }
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill up the form...");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed


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
            java.util.logging.Logger.getLogger(addNewMusicianJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewMusicianJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewMusicianJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewMusicianJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addNewMusicianJDialog dialog = new addNewMusicianJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextAddress;
    private javax.swing.JTextField jTextFirstName;
    private javax.swing.JTextField jTextLastName;
    private javax.swing.JTextField jTextPhone;
    private javax.swing.JTextField jTextSSN;
    // End of variables declaration//GEN-END:variables
}
