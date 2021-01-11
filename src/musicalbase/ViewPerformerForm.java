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
import net.proteanit.sql.DbUtils;
import static musicalbase.MainInstrument.ps;

/**
 *
 * @author Omaiey
 */
public class ViewPerformerForm extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
    DefaultTableModel model;
    
    public ViewPerformerForm() {
        initComponents();
        showTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButtonManagePerformer = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jTextViewPerformer = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewPerformer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));

        jButtonManagePerformer.setBackground(new java.awt.Color(204, 204, 204));
        jButtonManagePerformer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonManagePerformer.setForeground(new java.awt.Color(102, 0, 102));
        jButtonManagePerformer.setText("Manage Performer");
        jButtonManagePerformer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManagePerformerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonManagePerformer, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonManagePerformer)
                .addGap(58, 58, 58))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 290, 50));

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 570, -1, -1));

        jTextViewPerformer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextViewPerformerActionPerformed(evt);
            }
        });
        jTextViewPerformer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextViewPerformerKeyReleased(evt);
            }
        });
        jPanel2.add(jTextViewPerformer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 260, 36));

        jTableViewPerformer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Performer ID", "First Name", "Last Name", "Song Title", "Instrument Name"
            }
        ));
        jScrollPane1.setViewportView(jTableViewPerformer);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 801, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 158, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/images (1).jpeg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 350, 160));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter musician last name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 160, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 620));

        setSize(new java.awt.Dimension(929, 616));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainHome ob = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonManagePerformerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManagePerformerActionPerformed
        setVisible(false);
        MainPerformer ob = new MainPerformer();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonManagePerformerActionPerformed

    private void jTextViewPerformerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextViewPerformerKeyReleased

    }//GEN-LAST:event_jTextViewPerformerKeyReleased

    private void jTextViewPerformerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextViewPerformerActionPerformed
        try{
           // String selection = (String)jComboBoxSelection.getSelectedItem();
            String query = "SELECT Performer.PerformerID, Instrument.InstName, Musician.FName, Musician.LName, Song.Title FROM Musician, Song, Performer, Instrument WHERE Musician.SSN = Performer.SSN and Song.SongID = Performer.SongID and Instrument.InstID = Performer.InstID and Musician.LName = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, jTextViewPerformer.getText());
            rs = ps.executeQuery();
            jTableViewPerformer.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextViewPerformerActionPerformed
    
    private void showTable() {
        try{
            ps =  con.prepareStatement("SELECT Performer.PerformerID, Instrument.InstName, Musician.FName, Musician.LName, Song.Title FROM Musician, Song, Performer, Instrument WHERE Musician.SSN = Performer.SSN and Song.SongID = Performer.SongID and Instrument.InstID = Performer.InstID ORDER BY Performer.PerformerID");
            rs = ps.executeQuery();
            

            while(rs.next()){
                String PerformerID = rs.getString("Performer.PerformerID");
                String MusicianFName = rs.getString("Musician.FName");
                String MusicianLName = rs.getString("Musician.LName");
                String SongTitle = rs.getString("Song.Title");
                String InstrumentName = rs.getString("Instrument.InstName");
                
                String [] content = {PerformerID, MusicianFName, MusicianLName, SongTitle, InstrumentName};
                
                model = (DefaultTableModel) jTableViewPerformer.getModel();
                model.addRow(content);
            }
        }catch(SQLException e){
            
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPerformerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonManagePerformer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewPerformer;
    private javax.swing.JTextField jTextViewPerformer;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableViewPerformer.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
