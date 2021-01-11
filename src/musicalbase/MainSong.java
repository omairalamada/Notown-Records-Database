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
import static musicalbase.MainMusician.ps;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Omaiey
 */
public class MainSong extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public MainSong() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
        showSongJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextSongID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextAuthor = new javax.swing.JTextField();
        jTextAlbumID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextSearchSong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButtonInsert = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonViewList = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSong = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTitleActionPerformed(evt);
            }
        });
        jPanel1.add(jTextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 123, 31));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Title:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Song ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));
        jPanel1.add(jTextSongID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 123, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Author:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jTextAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAuthorActionPerformed(evt);
            }
        });
        jPanel1.add(jTextAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 125, 32));
        jPanel1.add(jTextAlbumID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 125, 30));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Album ID:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

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
        jPanel1.add(jTextSearchSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 248, 30));

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 204));
        jLabel5.setText("Song Detail");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, 83));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInsert.setBackground(new java.awt.Color(204, 204, 204));
        jButtonInsert.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(51, 0, 51));
        jButtonInsert.setText("Add New Song");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jButtonUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpdate.setText("Edit Song Details");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDelete.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(51, 0, 51));
        jButtonDelete.setText("Delete Song");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 130, -1));

        jButtonViewList.setBackground(new java.awt.Color(204, 204, 204));
        jButtonViewList.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonViewList.setForeground(new java.awt.Color(51, 0, 51));
        jButtonViewList.setText("View List");
        jButtonViewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewListActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonViewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 670, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableSong.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Song ID", "Title", "Author", "Album ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSong);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 670, 390));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 700, 430));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Title ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, 30));

        jButtonSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSearch.setForeground(new java.awt.Color(51, 0, 51));
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 610));

        setSize(new java.awt.Dimension(1007, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public ArrayList<Song> getSongList(){
        ArrayList<Song> songList = new ArrayList<Song>();
        
        try{
            ps = con.prepareStatement("SELECT *FROM Song");
            rs = ps.executeQuery();
            Song song;
            while(rs.next()){
                song = new Song(rs.getInt("SongID"), rs.getString("Title"), rs.getString("Author"), rs.getInt("AlbumID"));
                songList.add(song);
            }
                       
        }catch (Exception e){ 
           e.printStackTrace();
        }        
        return songList;
    }
    
    public void showSongJTable(){
        ArrayList<Song> list = getSongList();
        DefaultTableModel model = (DefaultTableModel)jTableSong.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getSongID();
            row[1] = list.get(i).getTitle();
            row[2] = list.get(i).getAuthor();
            row[3] = list.get(i).getAlbumID();
            
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
    
    private void jTextTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTitleActionPerformed

    }//GEN-LAST:event_jTextTitleActionPerformed

    private void jTableSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSongMouseClicked

        int i = jTableSong.getSelectedRow();
        TableModel model = jTableSong.getModel();
        jTextSongID.setText(model.getValueAt(i,0).toString());
        jTextTitle.setText(model.getValueAt(i,1).toString());
        jTextAuthor.setText(model.getValueAt(i, 2).toString());
        jTextAlbumID.setText(model.getValueAt(i, 3).toString()); 
         
    }//GEN-LAST:event_jTableSongMouseClicked

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        setVisible(false);
        addNewSong obj = new addNewSong();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        setVisible(false);
        editSong obj = new editSong();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed

        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row song to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                    
                    ps = con.prepareStatement("DELETE FROM Song WHERE SongID = ? ");
                    ps.setString(1, jTextSongID.getText());
                    row2 = ps.executeUpdate();
                    showSongJTable();
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Deleted Successfully.");
                        setVisible(false);
                        MainSong obj = new MainSong();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Can't delete. This song was used in performing.. ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
          
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAuthorActionPerformed
       
    }//GEN-LAST:event_jTextAuthorActionPerformed

    private void jTextSearchSongKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchSongKeyReleased
       // String query = jTextSearchSong.getText();
        //filter(query);
        
    }//GEN-LAST:event_jTextSearchSongKeyReleased

    private void jButtonViewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewListActionPerformed
        setVisible(false);
        SearchSongForm ob = new SearchSongForm();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonViewListActionPerformed

    private void jTextSearchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchSongActionPerformed
        try{
           // String selection = (String)jComboBoxSelection.getSelectedItem();
            String query = "SELECT *FROM Song WHERE Title = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, jTextSearchSong.getText());
            rs = ps.executeQuery();
            jTableSong.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextSearchSongActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        showSongJTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonViewList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSong;
    private javax.swing.JTextField jTextAlbumID;
    private javax.swing.JTextField jTextAuthor;
    private javax.swing.JTextField jTextSearchSong;
    private javax.swing.JTextField jTextSongID;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        DefaultTableModel model = (DefaultTableModel)jTableSong.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableSong.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    private int getRow() {
        int i = jTableSong.getSelectedRow();
        
        return i;
    }
}
