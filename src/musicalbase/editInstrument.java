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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static musicalbase.MainInstrument.ps;
import static musicalbase.editSong.ps;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Omaiey
 */
public class editInstrument extends javax.swing.JFrame {
    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;

    public editInstrument() {
        super("MainHome");
        initComponents();        
        con = DBConnection.getCon();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelInstID = new javax.swing.JLabel();
        jLabelCheckInput = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextInstID = new javax.swing.JTextField();
        jTextInstName = new javax.swing.JTextField();
        jTextMusicalKey = new javax.swing.JTextField();
        jButtonAddAndUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInstID.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabelInstID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelInstID.setText("Instrument ID: ");
        jPanel1.add(jLabelInstID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelCheckInput.setFont(new java.awt.Font("Tahoma", 0, 25)); // NOI18N
        jLabelCheckInput.setForeground(new java.awt.Color(102, 102, 255));
        jLabelCheckInput.setText("Instrument Details");
        jPanel1.add(jLabelCheckInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Instrument Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Musical Key:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel1.add(jTextInstID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 280, 40));
        jPanel1.add(jTextInstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 280, 40));
        jPanel1.add(jTextMusicalKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 280, 40));

        jButtonAddAndUpdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButtonAddAndUpdate.setForeground(new java.awt.Color(51, 0, 51));
        jButtonAddAndUpdate.setText("SAVE");
        jButtonAddAndUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAndUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonAddAndUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

     public ArrayList<Instrument> getInstrumentList(){
        ArrayList<Instrument> instrumentList = new ArrayList<Instrument>();
        
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
     
    private Instrument instrument = new Instrument();
    public void setData(Instrument c, MainInstrument m){        
        instrument = c;
        obj = m;

        String instID = Integer.toString(instrument.getInstID());
        
        this.jTextInstID.setText(instID);
        this.jTextInstName.setText(instrument.getInstName());
        this.jTextMusicalKey.setText(instrument.getMusicalKey());
    }
    public void setData2(int idNum, MainInstrument m){
        obj = m;
        int id = idNum + 1;
        String p = id + "";
        this.jTextInstID.setText(p);
    }
    
    private void jButtonAddAndUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAndUpdateActionPerformed
        int row = 0;
        String instID = Integer.toString(instrument.getInstID());
        
        
        int command = JOptionPane.showConfirmDialog(null, "Do you want to save?", null, JOptionPane.OK_CANCEL_OPTION);
        if(command == JOptionPane.OK_OPTION){
        
        if("".equals(jTextInstID.getText()) || "".equals(jTextInstName.getText()) || "".equals(jTextMusicalKey.getText()))
                JOptionPane.showMessageDialog(null, "Please fill out all the blanks.");
        else{
        
        if(jTextInstID.getText().equals(instID)){
            
        try{
       
            ps = con.prepareStatement("UPDATE Instrument SET InstName = ?, MusicalKey = ?"
                    + " WHERE InstID = ?");
            
            ps.setString(1, jTextInstName.getText());
            ps.setString(2, jTextMusicalKey.getText());
            ps.setString(3, jTextInstID.getText());

            row = ps.executeUpdate();

            if(row != 0){
                JOptionPane.showMessageDialog(this, "Instrument was Updated Successfully!");
                this.setVisible(false);
                obj.showInstrumentJTable();                
                
            }else{
                JOptionPane.showMessageDialog(this, "Instrument was not updated.");
                jTextInstName.setText(null);
                jTextMusicalKey.setText(null);
                jTextInstID.setText(null);
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        }else {//addOrUpdate
            try{
            ps = con.prepareStatement("INSERT INTO Instrument(InstID, InstName, Musicalkey)"
                +"values(?,?,?)");
            ps.setString(1, jTextInstID.getText());
            ps.setString(2, jTextInstName.getText());
            ps.setString(3, jTextMusicalKey.getText());

            row = ps.executeUpdate();
            
            if(row != 0){
                JOptionPane.showMessageDialog(this, "New Instrument was Added Successfully!");
                this.setVisible(false);
                obj.showInstrumentJTable();
                
            }else{
                JOptionPane.showMessageDialog(this, "Failed!");
                 jTextInstID.setText(null);
                jTextInstName.setText(null);
                jTextMusicalKey.setText(null);
            }
            
        }catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, "Fill up the form or Wrong input!!!");
        }
            
        }
        
        }
        }

    }//GEN-LAST:event_jButtonAddAndUpdateActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editInstrument().setVisible(true);
            }
        });
    }
    private MainInstrument obj = new MainInstrument();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddAndUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCheckInput;
    private javax.swing.JLabel jLabelInstID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextInstID;
    private javax.swing.JTextField jTextInstName;
    private javax.swing.JTextField jTextMusicalKey;
    // End of variables declaration//GEN-END:variables
}
