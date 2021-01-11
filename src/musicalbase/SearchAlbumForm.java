/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Omaiey
 */
public class SearchAlbumForm extends javax.swing.JFrame {
    
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
    DefaultTableModel model;
    
    public SearchAlbumForm() {
        initComponents();
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextSearchAlbum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearchAlbum = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 102));
        jPanel1.setForeground(new java.awt.Color(153, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextSearchAlbum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchAlbumKeyReleased(evt);
            }
        });
        jPanel1.add(jTextSearchAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 212, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/search-iconNew.png"))); // NOI18N
        jLabel3.setText("Search");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 20));

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 70, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));

        jTableSearchAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Album Title", "Prodcucer F_Name", "Producer L_Name"
            }
        ));
        jScrollPane1.setViewportView(jTableSearchAlbum);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 362, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 640, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("List of Album Produced by Musician:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 640, 40));

        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(51, 0, 51));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 540));

        setSize(new java.awt.Dimension(683, 578));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainAlbum ob = new MainAlbum();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextSearchAlbumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchAlbumKeyReleased
        String query = jTextSearchAlbum.getText();
        filter(query);
    }//GEN-LAST:event_jTextSearchAlbumKeyReleased

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        setVisible(false);
        MainHome ob = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void showTable() {
        try{
            ps =  con.prepareStatement("SELECT Album.Title, Musician.FName, Musician.LName FROM Album, Musician\n" +
" WHERE Musician.SSN = Album.SSN ORDER BY Album.Title");
            rs = ps.executeQuery();
            

            while(rs.next()){
                String Title = rs.getString("Album.Title");
                String MusicianFName = rs.getString("Musician.FName");
                String MusicianLName = rs.getString("Musician.LName");
                
                String [] content = {Title, MusicianFName, MusicianLName};
                
                model = (DefaultTableModel) jTableSearchAlbum.getModel();
                model.addRow(content);
            }
        }catch(SQLException e){
            
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchAlbumForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSearchAlbum;
    private javax.swing.JTextField jTextSearchAlbum;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableSearchAlbum.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
