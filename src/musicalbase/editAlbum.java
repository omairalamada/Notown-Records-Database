

package musicalbase;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static musicalbase.MainAlbum.ps;
import static musicalbase.MainMusician.con;
import static musicalbase.MainMusician.ps;
import static musicalbase.editMusician.con;
import static musicalbase.editMusician.ps;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Omaiey
 */
public class editAlbum extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public editAlbum() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
        showAlbumJTable();
    }
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
        DefaultTableModel model = (DefaultTableModel)jTableUpdate.getModel();
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


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextAlbumID = new javax.swing.JTextField();
        jTextTitle = new javax.swing.JTextField();
        jTextFormat = new javax.swing.JTextField();
        jTextCopyrightDate = new javax.swing.JTextField();
        jTextMusicianSSN = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUpdate = new javax.swing.JTable();
        jButtonUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Update Album");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Album ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Title:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Format: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CopyrightDate:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Musician SSN:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));
        jPanel1.add(jTextAlbumID, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 240, 30));
        jPanel1.add(jTextTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, 240, 30));
        jPanel1.add(jTextFormat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 240, 30));
        jPanel1.add(jTextCopyrightDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, 240, 30));
        jPanel1.add(jTextMusicianSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 240, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableUpdate.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Album ID", "Title", "Format", "CopyrightDate", "Musician SSN"
            }
        ));
        jTableUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUpdateMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUpdate);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 590, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 630, 430));

        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButtonUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        MainAlbum obj = new MainAlbum();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
          int row = 0;
        
        try{
             ps = con.prepareStatement("UPDATE Album SET Title = ?, Format = ?, CopyrightDate = ?, SSN = ?"
                    + " WHERE AlbumID = ?");
            ps.setString(1, jTextTitle.getText());
            ps.setString(2, jTextFormat.getText());
            ps.setString(3, jTextCopyrightDate.getText());
            ps.setString(4, jTextMusicianSSN.getText());
            ps.setString(5, jTextAlbumID.getText());
            row = ps.executeUpdate();
            showAlbumJTable();
            if(row != 0){
                JOptionPane.showMessageDialog(this, "Album successfully updated.");
                setVisible(false);
                MainAlbum obj = new MainAlbum();
                obj.setVisible(true);
                obj.setLocationRelativeTo(null);
                
            }else{
                JOptionPane.showMessageDialog(this, "Album was not updated.");
                jTextTitle.setText(null);
                jTextFormat.setText(null);
                jTextCopyrightDate.setText(null);
                jTextMusicianSSN.setText(null);
                jTextAlbumID.setText(null);
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jTableUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUpdateMouseClicked
        int i = jTableUpdate.getSelectedRow();
        TableModel model = jTableUpdate.getModel();
        jTextAlbumID.setText(model.getValueAt(i,0).toString());
        jTextTitle.setText(model.getValueAt(i,1).toString());
        jTextFormat.setText(model.getValueAt(i, 2).toString());
        jTextCopyrightDate.setText(model.getValueAt(i, 3).toString());
        jTextMusicianSSN.setText(model.getValueAt(i, 4).toString()); 
    }//GEN-LAST:event_jTableUpdateMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editAlbum().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUpdate;
    private javax.swing.JTextField jTextAlbumID;
    private javax.swing.JTextField jTextCopyrightDate;
    private javax.swing.JTextField jTextFormat;
    private javax.swing.JTextField jTextMusicianSSN;
    private javax.swing.JTextField jTextTitle;
    // End of variables declaration//GEN-END:variables
}
