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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import static musicalbase.MainMusician.ps;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Omaiey
 */
public class MainInstrument extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public MainInstrument() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();       
        jButtonDelete.setEnabled(false);
        jButtonUpdate.setEnabled(false); 
        showInstrumentJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInstrument = new javax.swing.JTable();
        jTextSearch = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxSearch = new javax.swing.JComboBox();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Instrument Info");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 60));

        jTableInstrument.setModel(new javax.swing.table.DefaultTableModel(
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
                "Instrument ID", "Instrument Name", "Musical Key"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableInstrument.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInstrumentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInstrument);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 700, 321));

        jTextSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextSearchMouseClicked(evt);
            }
        });
        jTextSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchActionPerformed(evt);
            }
        });
        jTextSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchKeyReleased(evt);
            }
        });
        jPanel4.add(jTextSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 230, 30));

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInsert.setBackground(new java.awt.Color(204, 204, 204));
        jButtonInsert.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(102, 0, 51));
        jButtonInsert.setText("Add New Insrument");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jButtonUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(102, 0, 51));
        jButtonUpdate.setText("Edit Instrument Details");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDelete.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(102, 0, 51));
        jButtonDelete.setText("Delete Insrument");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 640, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search by");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Instrument ID", "Instrument Name", "Key" }));
        jPanel4.add(jComboBoxSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 130, 30));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(731, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 370, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 371, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 269, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 269, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(757, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Instrument> getInstrumentList(){
        instrumentList.clear();
        
        try{
            ps = con.prepareStatement("SELECT  *FROM Instrument");
            rs = ps.executeQuery();
            Instrument instrument;
            while(rs.next()){
                instrument = new Instrument(rs.getInt("InstID"), rs.getString("InstName"), rs.getString("MusicalKey"));
                instrumentList.add(instrument);
            }
                       
        }catch (Exception e){
           e.printStackTrace();
        }        
        return instrumentList;
    }
    
    public ArrayList<Instrument> searchInstrumentList(String lastName){
        instrumentList.clear();
        
        try{
            
            ps = con.prepareStatement("SELECT  *FROM Instrument WHERE instName like ?");
            ps.setString(1, lastName);
            rs = ps.executeQuery();
            Instrument instrument;
            while(rs.next()){
                instrument = new Instrument(rs.getInt("InstID"), rs.getString("InstName"), rs.getString("MusicalKey"));
                instrumentList.add(instrument);
            }
                       
        }catch (Exception e){
           e.printStackTrace();
        }        
        return instrumentList;
    }
    
    public void showInstrumentJTable(){
        ArrayList<Instrument> list = getInstrumentList();
        DefaultTableModel model = (DefaultTableModel)jTableInstrument.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getInstID();
            row[1] = list.get(i).getInstName();
            row[2] = list.get(i).getMusicalKey();         
            model.addRow(row);
        }
    }
    
    private void showInstrumentTable(int i, String value){

        try{
            if(i == 0){
                String query = "SELECT *FROM Instrument WHERE InstID = '"+ value +"'";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                jTableInstrument.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else if(i == 1){
                String query = "SELECT *FROM Instrument WHERE InstName = '"+ value +"'";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                jTableInstrument.setModel(DbUtils.resultSetToTableModel(rs));
            }
            else{
                String query = "SELECT *FROM Instrument WHERE MusicalKey = '"+ value +"'";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                jTableInstrument.setModel(DbUtils.resultSetToTableModel(rs));
            }
            
           
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        int n = instrumentList.get(instrumentList.size() - 1).getInstID();
        setVisible(true);
        editInstrument obj = new editInstrument();
        obj.setVisible(true);
        obj.setData2(n, this);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        setVisible(true);
        int i = jTableInstrument.getSelectedRow();
        TableModel model = jTableInstrument.getModel();
        String instID = model.getValueAt(i, 0).toString();
        int index = Integer.parseInt(instID);
        
        Instrument temp = new Instrument();
        temp = instrumentList.get(index-1);
        
        editInstrument obj = new editInstrument();
        obj.setVisible(true);
        obj.setData(temp, this);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        int row = getRow(), row2;

        int  index = this.jTableInstrument.getSelectedRow();
        int temp = instrumentList.get(index).getInstID();
        String rowSelected = Integer.toString(temp);
        
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row instrument to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Are you sure to delete this instrument?", null, JOptionPane.OK_CANCEL_OPTION);
            
            if(command == JOptionPane.OK_OPTION){
                try {
                    ps = con.prepareStatement("DELETE FROM Instrument WHERE InstID = ?");
                    ps.setString(1, rowSelected);
                    row2 = ps.executeUpdate();
                    showInstrumentJTable();
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Instrument " + rowSelected + " Successfully Deleted...");
                        showInstrumentJTable();
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Can't delete this instrument...", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }          
        }
        
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableInstrumentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInstrumentMouseClicked
        jButtonDelete.setEnabled(true);
        jButtonUpdate.setEnabled(true);
    }//GEN-LAST:event_jTableInstrumentMouseClicked

    private void jTextSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchKeyReleased
        if(jTextSearch.getText() != null && jTextSearch.getText().trim().length() > 0){
            int i = jComboBoxSearch.getSelectedIndex();
            String  value = jTextSearch.getText();
        
            showInstrumentTable(i, value);
        }else{
            showInstrumentJTable();
        }
    }//GEN-LAST:event_jTextSearchKeyReleased

    private void jTextSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchActionPerformed
         
    }//GEN-LAST:event_jTextSearchActionPerformed

    private void jTextSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextSearchMouseClicked
        jButtonUpdate.setEnabled(false);
        jButtonDelete.setEnabled(false);
    }//GEN-LAST:event_jTextSearchMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInstrument().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBoxSearch;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInstrument;
    private javax.swing.JTextField jTextSearch;
    // End of variables declaration//GEN-END:variables


    private int getRow() {
       int i = jTableInstrument.getSelectedRow();       
        return i;
    }
    
    private String getInstID(){
        int i = jTableInstrument.getSelectedRow();
        TableModel model = jTableInstrument.getModel();
        
        String instID = model.getValueAt(i, 0).toString();
        
        return instID;
    }
    
     private ArrayList<Instrument> instrumentList = new ArrayList<Instrument>();
}
