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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static musicalbase.ViewPerformerForm.ps;

/**
 *
 * @author Omaiey
 */
public class MainPerformer extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public MainPerformer() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
        showPerformerJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextPerformerID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextSongID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextInstID = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePerformer = new javax.swing.JTable();
        jButtonHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Performer Detail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 20, -1, 82));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Performer ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 120, -1, -1));
        getContentPane().add(jTextPerformerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 114, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Musician SSN:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 178, -1, -1));
        getContentPane().add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 178, 112, 31));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Song ID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 228, -1, -1));
        getContentPane().add(jTextSongID, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 227, 112, 33));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Instrument ID:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 279, -1, -1));
        getContentPane().add(jTextInstID, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 278, 110, 32));

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonBack.setBackground(new java.awt.Color(204, 204, 204));
        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(51, 0, 51));
        jButtonBack.setText("X");
        jButtonBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBackMouseClicked(evt);
            }
        });
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInsert.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(51, 0, 51));
        jButtonInsert.setText("Add");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jButtonUpdate.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpdate.setText("Edit");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jButtonDelete.setFont(new java.awt.Font("Tw Cen MT", 1, 20)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(51, 0, 51));
        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 510));

        jTablePerformer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Performer ID", "Musician SSN", "Song ID", "Instrument ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTablePerformer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePerformerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePerformer);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 570, 360));

        jButtonHome.setBackground(new java.awt.Color(204, 204, 204));
        jButtonHome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonHome.setForeground(new java.awt.Color(51, 0, 51));
        jButtonHome.setText("Home");
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

        setSize(new java.awt.Dimension(904, 539));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBackMouseClicked
 
    }//GEN-LAST:event_jButtonBackMouseClicked

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        setVisible(false);
        ViewPerformerForm ob = new ViewPerformerForm();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jTablePerformerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePerformerMouseClicked
        int i = jTablePerformer.getSelectedRow();
        TableModel model = jTablePerformer.getModel();
        jTextPerformerID.setText(model.getValueAt(i,0).toString());
        jTextSSN.setText(model.getValueAt(i,1).toString());
        jTextSongID.setText(model.getValueAt(i, 2).toString());
        jTextInstID.setText(model.getValueAt(i, 3).toString()); 
    }//GEN-LAST:event_jTablePerformerMouseClicked

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
                     ps = con.prepareStatement("INSERT INTO Performer (PerformerID, SSN, SongID, InstID)"
                            + " values(?,?,?,?)");
                        ps.setString(1, jTextPerformerID.getText());
                        ps.setString(2, jTextSSN.getText());
                        ps.setString(3, jTextSongID.getText());
                        ps.setString(4, jTextInstID.getText());
                        row2 =ps.executeUpdate();
                        showPerformerJTable();                      
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Data inserted...");
                        setVisible(false);
                        MainPerformer obj = new MainPerformer();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }else{
                         JOptionPane.showMessageDialog(this, "Failed!");
                        jTextPerformerID.setText(null);
                        jTextSSN.setText(null);
                        jTextSongID.setText(null);
                        jTextInstID.setText(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error.. !", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row player to edit", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                     ps = con.prepareStatement("UPDATE Performer SET SSN = ?, SongID = ?, InstID = ?"
                    + " WHERE PerformerID = ?");
                        ps.setString(1, jTextSSN.getText());
                        ps.setString(2, jTextSongID.getText());
                        ps.setString(3, jTextInstID.getText());
                        ps.setString(4, jTextPerformerID.getText());
                        row2 = ps.executeUpdate();
                        showPerformerJTable();                    
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Data updated...");
                        setVisible(false);
                        MainPerformer obj = new MainPerformer();
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
            JOptionPane.showMessageDialog(panel, "Please select a row performer to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Are you sure to delete this performer", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                    ps = con.prepareStatement("DELETE FROM Performer WHERE PerformerID = ?");
                    ps.setString(1, jTextPerformerID.getText());
                    row2 = ps.executeUpdate();
                    showPerformerJTable();
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Performer " + jTextPerformerID.getText() + " Deleted...");
                        JOptionPane.showMessageDialog(null, "Deleted Successfully.");
                        setVisible(false);
                        MainPerformer obj = new MainPerformer();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Can't delete..", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        setVisible(false);
        MainHome ob = new MainHome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed
    
    public ArrayList<Performer> getPerformerList(){
        ArrayList<Performer> performerList = new ArrayList<Performer>();
        
        try{
            ps = con.prepareStatement("SELECT *FROM Performer");
            rs = ps.executeQuery();
            Performer performer;
            while(rs.next()){
                performer = new Performer(rs.getInt("PerformerID"), rs.getInt("SSN"), rs.getInt("SongID"), rs.getInt("InstID"));
                performerList.add(performer);
            }
                       
        }catch (Exception e){ 
           e.printStackTrace();
        }        
        return performerList;
    }
    
    public void showPerformerJTable(){
        ArrayList<Performer> list = getPerformerList();
        DefaultTableModel model = (DefaultTableModel)jTablePerformer.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getPerformerID();
            row[1] = list.get(i).getSsn();
            row[2] = list.get(i).getSongID();
            row[3] = list.get(i).getInstID();
            
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
                new MainPerformer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePerformer;
    private javax.swing.JTextField jTextInstID;
    private javax.swing.JTextField jTextPerformerID;
    private javax.swing.JTextField jTextSSN;
    private javax.swing.JTextField jTextSongID;
    // End of variables declaration//GEN-END:variables


    private int getRow() {
       int i = jTablePerformer.getSelectedRow();       
        return i;
    }
}
