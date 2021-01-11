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
public class SearchInstrumentForm extends javax.swing.JFrame {

    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
    DefaultTableModel model;
    public SearchInstrumentForm() {
        initComponents();
        showTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextSearchInstrument = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearchInstrument = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("List of Instruments used in a Song perform:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 610, -1));

        jTextSearchInstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchInstrumentActionPerformed(evt);
            }
        });
        jTextSearchInstrument.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchInstrumentKeyReleased(evt);
            }
        });
        jPanel2.add(jTextSearchInstrument, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 69, 190, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/search-iconNew.png"))); // NOI18N
        jLabel2.setText("Search");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 80, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jTableSearchInstrument.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instrument Name", "Song Title"
            }
        ));
        jScrollPane1.setViewportView(jTableSearchInstrument);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 105, -1, -1));

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 70, -1));

        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(51, 0, 51));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 620, 570));

        setSize(new java.awt.Dimension(602, 595));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainInstrument ob  = new MainInstrument();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTextSearchInstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchInstrumentActionPerformed

    }//GEN-LAST:event_jTextSearchInstrumentActionPerformed
    
    private void showTable() {
        try{
            ps =  con.prepareStatement("SELECT Song.Title, Instrument.InstName FROM Song,Instrument, Performer\n" +
" where Song.SongID = Performer.SongID and\n" +
" Instrument.InstID = Performer.InstID ORDER BY Instrument.InstName");
            rs = ps.executeQuery();
            

            while(rs.next()){
                String InstName = rs.getString("Instrument.InstName");
                String Title = rs.getString("Song.Title");
                
                String [] content = {InstName, Title};
                
                model = (DefaultTableModel) jTableSearchInstrument.getModel();
                model.addRow(content);
            }
        }catch(SQLException e){
            
        }
    }
    
    private void jTextSearchInstrumentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchInstrumentKeyReleased
        String query = jTextSearchInstrument.getText();
        filter(query);
    }//GEN-LAST:event_jTextSearchInstrumentKeyReleased

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        setVisible(false);
        MainHome ob = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchInstrumentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSearchInstrument;
    private javax.swing.JTextField jTextSearchInstrument;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableSearchInstrument.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}