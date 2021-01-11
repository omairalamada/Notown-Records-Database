
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
import static musicalbase.MainInstrument.ps;
import static musicalbase.MainMusician.ps;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Omaiey
 */
public class MainAlbum extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public MainAlbum() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
        showAlbumJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextAlbumID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFormat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextCopyrightDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextSSN = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonViewList = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonInsert = new javax.swing.JButton();
        jTextTitle = new javax.swing.JTextField();
        jTextSearchAlbum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlbum = new javax.swing.JTable();
        jButtonSearch = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Album Detail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 11, -1, 75));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Album ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jTextAlbumID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAlbumIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextAlbumID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("Title: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("Format:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(jTextFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 190, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("CopyrightDate: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(jTextCopyrightDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 140, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("SSN: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));
        getContentPane().add(jTextSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonViewList.setBackground(new java.awt.Color(204, 204, 204));
        jButtonViewList.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonViewList.setForeground(new java.awt.Color(51, 0, 51));
        jButtonViewList.setText("View List");
        jButtonViewList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewListActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonViewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jButtonDelete.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDelete.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonDelete.setForeground(new java.awt.Color(51, 0, 51));
        jButtonDelete.setText("Delete Album");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jButtonUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonUpdate.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpdate.setText("Edit Album Details");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        jButtonInsert.setBackground(new java.awt.Color(204, 204, 204));
        jButtonInsert.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        jButtonInsert.setForeground(new java.awt.Color(51, 0, 51));
        jButtonInsert.setText("Add New Album");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 600, 50));
        jPanel2.add(jTextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 190, 28));

        jTextSearchAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSearchAlbumActionPerformed(evt);
            }
        });
        jTextSearchAlbum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextSearchAlbumKeyReleased(evt);
            }
        });
        jPanel2.add(jTextSearchAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 250, 30));

        jTableAlbum.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Album ID", "Title", "Format", "CopyrightDate", "Producer SSN", "Producer F_Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAlbum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlbumMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAlbum);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 650, 340));

        jButtonSearch.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Title");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 500));

        setSize(new java.awt.Dimension(1012, 533));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAlbumIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAlbumIDActionPerformed
 
    }//GEN-LAST:event_jTextAlbumIDActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        setVisible(false);
        addNewAlbum obj = new addNewAlbum();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed

        setVisible(false);
        editAlbum obj = new editAlbum();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
       
        int row = getRow(), row2;
        final JPanel panel = new JPanel();
        
        if(row == -1){
            JOptionPane.showMessageDialog(panel, "Please select a row album to delete.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int command = JOptionPane.showConfirmDialog(null, "Are you sure to delete?", null, JOptionPane.YES_NO_OPTION);
            
            if(command == JOptionPane.YES_OPTION){
                try {
                    
                    ps = con.prepareStatement("DELETE FROM Album WHERE AlbumID = ? ");
                    ps.setString(1, jTextAlbumID.getText());
                    row2 = ps.executeUpdate();
                    showAlbumJTable();
                    
                    if((row2 != 0)){
                        JOptionPane.showMessageDialog(null, "Deleted Successfully.");
                        setVisible(false);
                        MainMusician obj = new MainMusician();
                        obj.setVisible(true);
                        obj.setLocationRelativeTo(null);
                    }
                    
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, " Can't delete... ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
          
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTableAlbumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlbumMouseClicked
        
        int i = jTableAlbum.getSelectedRow();
        TableModel model = jTableAlbum.getModel();
        jTextAlbumID.setText(model.getValueAt(i,0).toString());
        jTextTitle.setText(model.getValueAt(i,1).toString());
        jTextFormat.setText(model.getValueAt(i, 2).toString());
        jTextCopyrightDate.setText(model.getValueAt(i, 3).toString());
        jTextSSN.setText(model.getValueAt(i, 4).toString()); 
    }//GEN-LAST:event_jTableAlbumMouseClicked

    private void jTextSearchAlbumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextSearchAlbumKeyReleased
        //String query = jTextSearchAlbum.getText();
        //filter(query);
    }//GEN-LAST:event_jTextSearchAlbumKeyReleased

    private void jButtonViewListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewListActionPerformed
        setVisible(false);
        SearchAlbumForm ob = new SearchAlbumForm();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonViewListActionPerformed

    private void jTextSearchAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSearchAlbumActionPerformed
         try{
           // String selection = (String)jComboBoxSelection.getSelectedItem();
            String query = "SELECT *FROM Album WHERE Title = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, jTextSearchAlbum.getText());
            rs = ps.executeQuery();
            jTableAlbum.setModel(DbUtils.resultSetToTableModel(rs));
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextSearchAlbumActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
         showAlbumJTable();
    }//GEN-LAST:event_jButtonSearchActionPerformed
    
    public ArrayList<Album> getAlbumList(){
        ArrayList<Album> albumList = new ArrayList<Album>();
        
        try{
            ps = con.prepareStatement("SELECT AlbumID, Title, Format, CopyrightDate, Musician.SSN, Musician.FName FROM Musician, Album where Musician.SSN = Album.SSN");
            rs = ps.executeQuery();
            Album album;
            while(rs.next()){
                album = new Album(rs.getInt("AlbumID"), rs.getString("Title"), rs.getString("Format"), rs.getDate("CopyrightDate"), rs.getInt("Musician.SSN"), rs.getString("Musician.FName"));
                albumList.add(album);
            }
                       
        }catch (Exception e){  
           e.printStackTrace();
        }        
        return albumList;
    }
    
    public void showAlbumJTable(){
        ArrayList<Album> list = getAlbumList();
        DefaultTableModel model = (DefaultTableModel)jTableAlbum.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6];
        for(int i = 0; i < list.size(); i++){
            row[0] = list.get(i).getAlbumID();
            row[1] = list.get(i).getTitle();
            row[2] = list.get(i).getFormat();
            row[3] = list.get(i).getCopyrightDate();
            row[4] = list.get(i).getSsn();
            row[5] = list.get(i).getFirstName();
            
            model.addRow(row);
        }
    } 
        
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAlbum().setVisible(true);
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlbum;
    private javax.swing.JTextField jTextAlbumID;
    private javax.swing.JTextField jTextCopyrightDate;
    private javax.swing.JTextField jTextFormat;
    private javax.swing.JTextField jTextSSN;
    private javax.swing.JTextField jTextSearchAlbum;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables

    private void filter(String query) {
        DefaultTableModel model = (DefaultTableModel)jTableAlbum.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(model);
        jTableAlbum.setRowSorter(tr);
               
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
    private int getRow() {
        int i = jTableAlbum.getSelectedRow();
        
        return i;
    }
}
