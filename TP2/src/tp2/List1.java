/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package tp2;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.GridLayout;
import javax.swing.JFrame;
import tp2.cardDirector;
import tp2.cardFilm;
import tp2.dbConnection;
import tp2.director;
import tp2.film;

/**
 *
 * @author cacan
 */

public class List1 extends javax.swing.JFrame
{
    private DefaultTableModel dtm;
    private dbConnection db;
    private Boolean switchData = false;
    
    /**
     * Creates new form Main
     */
    public List1()
    {
        initComponents();
        db = new dbConnection();
        setCardPanel();
    }
    
    private void setCardPanel()
    {
        cardPanel.removeAll();
        cardPanel.setLayout(new GridLayout(0,1,10,10));
        try
        {
            ResultSet res;
            res = db.selectQuery((!switchData) ? "SELECT * FROM film" : "SELECT * FROM director");
            while(res.next())
            {
                if(!switchData)
                {
                    cardPanel.add(new cardFilm(res.getInt("id_film"), res.getString("img"),res.getString("judul"),res.getString("genre"),res.getString("director"),res.getString("deskripsi")));
                }
                else
                {
                    cardPanel.add(new cardDirector(res.getInt("id_director"), res.getString("img"),res.getString("nama"),res.getString("jumlah_film")));
                }
            }
        }
        catch (SQLException ex)
        {
            System.out.println("Gagal " + ex.getMessage());
        }
        cardPanel.revalidate();
        cardPanel.repaint();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();
        lblTxt = new javax.swing.JLabel();
        btnAddMov = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cardPanel = new javax.swing.JPanel();
        btnAddDir = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnSwitch = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(102, 102, 102));

        lblTxt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTxt.setForeground(new java.awt.Color(255, 255, 255));
        lblTxt.setText("Top Rank");

        btnAddMov.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddMov.setForeground(new java.awt.Color(102, 102, 102));
        btnAddMov.setText("Add Movies");
        btnAddMov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMovActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 102));

        cardPanel.setBackground(new java.awt.Color(218, 218, 218));

        javax.swing.GroupLayout cardPanelLayout = new javax.swing.GroupLayout(cardPanel);
        cardPanel.setLayout(cardPanelLayout);
        cardPanelLayout.setHorizontalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        cardPanelLayout.setVerticalGroup(
            cardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(cardPanel);

        btnAddDir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAddDir.setForeground(new java.awt.Color(102, 102, 102));
        btnAddDir.setText("Add Director");
        btnAddDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDirActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(102, 102, 102));
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnSwitch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSwitch.setForeground(new java.awt.Color(102, 102, 102));
        btnSwitch.setText("Switch");
        btnSwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSwitchActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(102, 102, 102));
        btnLogout.setText("Logout");
        btnLogout.setActionCommand("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTxt)
                .addGap(163, 163, 163))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(btnAddMov)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddDir)
                                .addGap(18, 18, 18)
                                .addComponent(btnRefresh)
                                .addGap(18, 18, 18)
                                .addComponent(btnSwitch))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(btnLogout)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddMov)
                    .addComponent(btnAddDir)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSwitch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddMovActionPerformed
        // TODO add your handling code here:
        AddFilm inputFilm = new AddFilm();
        inputFilm.setVisible(true);
        inputFilm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddMovActionPerformed

    private void btnSwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSwitchActionPerformed
        // TODO add your handling code here:
        switchData = (!switchData) ? true : false;
        setCardPanel();
    }//GEN-LAST:event_btnSwitchActionPerformed

    private void btnAddDirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDirActionPerformed
        // TODO add your handling code here:
        AddDirector inputDir = new AddDirector();
        inputDir.setVisible(true);
        inputDir.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnAddDirActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        setCardPanel();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(List1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(List1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(List1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(List1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new List1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDir;
    private javax.swing.JButton btnAddMov;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSwitch;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}
