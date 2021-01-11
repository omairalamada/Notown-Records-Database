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

public class addNewSong extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static Statement ps;
    static ResultSet rs;
    static PreparedStatement pst;


    /**
     * Creates new form addNewSong
     */
    public addNewSong() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldSongID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAuthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAlbumID = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 543, 400, -1));

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("Add New Song");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Song ID:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel3.add(jTextFieldSongID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 330, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel3.add(jTextFieldTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 330, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Author:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        jPanel3.add(jTextFieldAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 330, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Album ID:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel3.add(jTextFieldAlbumID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 330, 40));

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonAdd.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAdd.setText("ADD");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, -1, -1));

        jButtonBack.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBack.setText("X");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainSong obj = new MainSong();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        String SongID = jTextFieldSongID.getText();
        String Title = jTextFieldTitle.getText();
        String Author = jTextFieldAuthor.getText();
        String AlbumID = jTextFieldAlbumID.getText();
        int row = 0;
        
        try{
            ps = con.createStatement();
            String query = "INSERT INTO Song(SongID, Title, Author, AlbumID)"
                        + "VALUES('"+SongID+"','"+Title+"','"+Author+"','"+AlbumID+"')";
            row = ps.executeUpdate(query);
            if(row != 0){
                JOptionPane.showMessageDialog(this, "New Song was Added Successfully!");
                setVisible(false);
                MainSong obj = new MainSong();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
                jTextFieldSongID.setText(null);
                jTextFieldTitle.setText(null);
                jTextFieldAuthor.setText(null);
                jTextFieldAlbumID.setText(null);
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill up the form...");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

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
            java.util.logging.Logger.getLogger(addNewSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewSong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewSong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldAlbumID;
    private javax.swing.JTextField jTextFieldAuthor;
    private javax.swing.JTextField jTextFieldSongID;
    private javax.swing.JTextField jTextFieldTitle;
    // End of variables declaration//GEN-END:variables
}
