/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package musicalbase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Omaiey
 */
public class MainHome extends javax.swing.JFrame {

    static Connection con = DBConnection.getCon();
    static PreparedStatement ps;
    static ResultSet rs;
    
    public MainHome() {
        super("MainHome");
        initComponents();
        con = DBConnection.getCon();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPlayer = new javax.swing.JButton();
        jButtonPerformer = new javax.swing.JButton();
        jButtonSong = new javax.swing.JButton();
        jButtonMusician = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonAlbum = new javax.swing.JButton();
        jButtonInstrument = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 3), "Notown Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 35), new java.awt.Color(51, 0, 51))); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonPlayer.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Album.png"))); // NOI18N
        jButtonPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlayerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 128, 129));

        jButtonPerformer.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonPerformer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Performers.png"))); // NOI18N
        jButtonPerformer.setToolTipText("");
        jButtonPerformer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerformerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPerformer, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 143, 139));

        jButtonSong.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Song icon.png"))); // NOI18N
        jButtonSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSongActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSong, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 120));

        jButtonMusician.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonMusician.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Musician icon.jpg"))); // NOI18N
        jButtonMusician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMusicianActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMusician, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 119, 120));

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(51, 0, 51));
        jButtonExit.setText("Close");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 530, -1, -1));

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 51));
        jLabel1.setText("SONG");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Performer of Songs");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Player of Instruments");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("MUSICIAN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 760, 210));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("ALBUM");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 161, -1, -1));

        jButtonAlbum.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonAlbum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Album Icon.png"))); // NOI18N
        jButtonAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlbumActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonAlbum, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 31, 124, 122));

        jButtonInstrument.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButtonInstrument.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Instrument icon.png"))); // NOI18N
        jButtonInstrument.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInstrumentActionPerformed(evt);
            }
        });
        jPanel5.add(jButtonInstrument, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 31, 130, 120));

        jLabel6.setFont(new java.awt.Font("Bauhaus 93", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 51));
        jLabel6.setText("INSTRUMENT");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 159, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 760, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(815, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMusicianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMusicianActionPerformed
        setVisible(true);
        MainMusician ob = new MainMusician();
        ob.setVisible(true);       
    }//GEN-LAST:event_jButtonMusicianActionPerformed

    private void jButtonPerformerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerformerActionPerformed
        setVisible(true);
        ViewPerformerForm ob = new ViewPerformerForm();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonPerformerActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden

    }//GEN-LAST:event_formComponentHidden

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSongActionPerformed
        setVisible(true);
        MainSong ob = new MainSong();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonSongActionPerformed

    private void jButtonInstrumentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInstrumentActionPerformed
        setVisible(true);
        MainInstrument ob = new MainInstrument();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonInstrumentActionPerformed

    private void jButtonAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlbumActionPerformed
        setVisible(true);
        MainAlbum ob = new MainAlbum();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonAlbumActionPerformed

    private void jButtonPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlayerActionPerformed
        setVisible(true);
        MainPlay ob = new MainPlay();
        ob.setVisible(true);
    }//GEN-LAST:event_jButtonPlayerActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlbum;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonInstrument;
    private javax.swing.JButton jButtonMusician;
    private javax.swing.JButton jButtonPerformer;
    private javax.swing.JButton jButtonPlayer;
    private javax.swing.JButton jButtonSong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
  
}
