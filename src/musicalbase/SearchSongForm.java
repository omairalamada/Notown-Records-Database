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
public class SearchSongForm extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
    DefaultTableModel model;
 
    public SearchSongForm() {
        initComponents();
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextSearchSong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSearchSong = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextSearchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchSongActionPerformed(evt);
            }
        });
        jTextSearchSong.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchSongKeyReleased(evt);
            }
        });
        jPanel1.add(jTextSearchSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 230, 20));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("List of Song belong to its Album:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 580, 40));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jTableSearchSong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Song Title", "Album Title"
            }
        ));
        jScrollPane1.setViewportView(jTableSearchSong);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 580, 360));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/search-iconNew.png"))); // NOI18N
        jLabel2.setText("Search");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 90, 20));

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(51, 0, 51));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 550));

        setSize(new java.awt.Dimension(636, 581));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchSongActionPerformed

    }//GEN-LAST:event_jTextSearchSongActionPerformed
    
    private void showTable() {
        try{
            ps =  con.prepareStatement("SELECT Song.Title, Album.Title FROM Song,Album \n" +
" WHERE Album.AlbumID = Song.AlbumId");
            rs = ps.executeQuery();
            
            while(rs.next()){
                String AlbumTitle = rs.getString("Song.Title");
                String SongTitle = rs.getString("Album.Title");
                
                String [] content = {AlbumTitle, SongTitle};
                
                model = (DefaultTableModel) jTableSearchSong.getModel();
                model.addRow(content);
            }
        }catch(SQLException e){
            
        }
    }
    
    private void jTextSearchSongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchSongKeyReleased
        String query = jTextSearchSong.getText();
        filter(query);
    }//GEN-LAST:event_jTextSearchSongKeyReleased

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainSong ob = new MainSong();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        setVisible(false);
        MainHome ob = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchSongForm().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSearchSong;
    private javax.swing.JTextField jTextSearchSong;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableSearchSong.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
