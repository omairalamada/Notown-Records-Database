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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static musicalbase.MainPerformer.ps;

/**
 *
 * @author Omaiey
 */
public class MainPlay extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
   
    public MainPlay() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
        showPlayJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextPlayerID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextInstID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePlayer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText(" Player Detail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, 73));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));
        getContentPane().add(jTextPlayerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 120, 100, 29));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Musician SSN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        getContentPane().add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 97, 32));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Instrument ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(jTextInstID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 100, 29));

        jTablePlayer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Player ID", "Musician SSN", "Instrument ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePlayer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePlayerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePlayer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 460, 316));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 399, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(51, 0, 51));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpdate.setText("Edit");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSearch.setForeground(new java.awt.Color(51, 0, 51));
        jButtonSearch.setText("View List");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        jButtonInsert.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(51, 0, 51));
        jButtonInsert.setText("Add");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 450, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 470));

        setSize(new java.awt.Dimension(814, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        MainHome ob  = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTablePlayerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePlayerMouseClicked
        int i = jTablePlayer.getSelectedRow();
        TableModel model = jTablePlayer.getModel();
        jTextPlayerID.setText(model.getValueAt(i,0).toString());
        jTextSSN.setText(model.getValueAt(i,1).toString());
        jTextInstID.setText(model.getValueAt(i, 2).toString());       
    }//GEN-LAST:event_jTablePlayerMouseClicked

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed

        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Fill up the form...", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                    ps = con.prepareStatement("INSERT INTO Play (PlayerID, SSN, InstID)"
                    + " values(?,?,?)");
                    ps.setString(1, jTextPlayerID.getText());
                    ps.setString(2, jTextSSN.getText());
                    ps.setString(3, jTextInstID.getText());
                    row2 = ps.executeUpdate();
                    showPlayJTable();
                                         
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Data inserted...");
                        setVisible(false);
                        MainPlay obj = new MainPlay();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }else{
                         JOptionPane.showMessageDialog(this, "Failed!");
                        jTextPlayerID.setText(null);
                        jTextSSN.setText(null);
                        jTextInstID.setText(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error..!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        /*try {           
            ps = con.prepareStatement("UPDATE Play SET SSN = ?, InstID = ?"
                    + " WHERE PlayerID = ?");
            ps.setString(1, jTextSSN.getText());
            ps.setString(2, jTextInstID.getText());
            ps.setString(3, jTextPlayerID.getText());
            ps.executeUpdate();
            showPlayJTable();
            JOptionPane.showMessageDialog(null, "Data updated...");
            rs.close();
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } */
        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row player to edit", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                       ps = con.prepareStatement("UPDATE Play SET SSN = ?, InstID = ?"
                        + " WHERE PlayerID = ?");
                    ps.setString(1, jTextSSN.getText());
                    ps.setString(2, jTextInstID.getText());
                    ps.setString(3, jTextPlayerID.getText());
                    row2 = ps.executeUpdate();
                    showPlayJTable();           
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Data updated...");
                        setVisible(false);
                        MainPlay obj = new MainPlay();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error.. !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row player to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Are you sure to delete this player", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                    ps = con.prepareStatement("DELETE FROM Play WHERE PlayerID = ?");
                    ps.setString(1, jTextPlayerID.getText());
                    row2 = ps.executeUpdate();
                    showPlayJTable();
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Performer " + jTextPlayerID.getText() + " Deleted...");
                        JOptionPane.showMessageDialog(null, "Deleted Successfully.");
                        setVisible(false);
                        MainPlay obj = new MainPlay();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Can't delete..", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        setVisible(false);
        SearchPlayForm ob  = new SearchPlayForm();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonSearchActionPerformed

     public ArrayList<Play> getPlayList(){
        ArrayList<Play> playList = new ArrayList<Play>();
        
        try{
            ps = con.prepareStatement("SELECT *FROM Play");
            rs = ps.executeQuery();
            Play play;
            while(rs.next()){
                play = new Play(rs.getInt("PlayerID"), rs.getInt("SSN"), rs.getInt("InstID"));
                playList.add(play);
            }
                       
        }catch (Exception e){
           e.printStackTrace();
        }        
        return playList;
    }
    
    public void showPlayJTable(){
        ArrayList<Play> list = getPlayList();
        DefaultTableModel model = (DefaultTableModel)jTablePlayer.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getPlayerID();
            row[1] = list.get(i).getSsn();
            row[2] = list.get(i).getInstrumentID();
            model.addRow(row);
        }
    }
    
    public void executeSQLQuery(String query, String message){
        try{
            if(ps.executeUpdate(query) == 1){             
                JOptionPane.showMessageDialog(null, "Data" + message + "Succesfully");
            }
            else{
                JOptionPane.showMessageDialog(null, "Data Not" + message);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePlayer;
    private javax.swing.JTextField jTextInstID;
    private javax.swing.JTextField jTextPlayerID;
    private javax.swing.JTextField jTextSSN;
    // End of variables declaration//GEN-END:variables

    private int getRow() {
        int i = jTablePlayer.getSelectedRow();       
        return i;
    }
}

