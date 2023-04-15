/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tp2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author 62831
 */
public class AddDirector extends javax.swing.JFrame {

    dbConnection db = new dbConnection();
    private File file;
    private Integer id = -1;
    /**
     * Creates new form AddFilm
     */
    public AddDirector() {
        initComponents();
    }
    
    public AddDirector(Integer id_director, String img, String nama, String jumlah_film)
    {
        initComponents();
        inputNama.setText(nama);
        inputJumlah.setText(jumlah_film);
      
        this.id = id_director;
    }
    
    private void uploadImage() {
        try {
            Path fileDir = Paths.get("src/assets/" + file.getName());
            Path fromDir = Paths.get(file.getAbsolutePath());
            Files.copy(fromDir, fileDir, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.err.println("Upload Image Gagal! " + e.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTxt = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jumlahFilm = new javax.swing.JLabel();
        chooseBtn = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        namaLabel1 = new javax.swing.JLabel();
        inputJumlah = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTxt.setForeground(new java.awt.Color(255, 255, 255));
        lblTxt.setText("Add Director");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        jumlahFilm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jumlahFilm.setForeground(new java.awt.Color(255, 255, 255));
        jumlahFilm.setText("Jumlah Film :");

        chooseBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        chooseBtn.setForeground(new java.awt.Color(102, 102, 102));
        chooseBtn.setText("Choose Image");
        chooseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseBtnActionPerformed(evt);
            }
        });

        submitBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(102, 102, 102));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        namaLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        namaLabel1.setForeground(new java.awt.Color(255, 255, 255));
        namaLabel1.setText("Nama :");

        inputJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJumlahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jumlahFilm)
                    .addComponent(namaLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseBtn)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTxt)
                        .addGap(159, 159, 159))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn)
                        .addGap(173, 173, 173))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahFilm))
                .addGap(23, 23, 23)
                .addComponent(chooseBtn)
                .addGap(39, 39, 39)
                .addComponent(submitBtn)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void chooseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        fieldFotoAlbumPath.setText(f.getAbsolutePath());
        fieldFotoAlbum.setText(f.getName());
    }//GEN-LAST:event_chooseBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        // TODO add your handling code here:
        String nama   = inputNama.getText();
        String jumlah_film = inputJumlah.getText();

        if(!nama.equals("") && ! jumlah_film.equals("") && file != null)
        {
//            try {
//                String imgFile  = file.getName();
//                uploadImage();
////                if(this.id >= 0){
////                    db.stmt.execute("UPDATE film SET img='" + imgFile + "',judul='" + judul + "',genre" + genre + " WHERE id="+ this.id.toString() + ";");
////                }
////                else{
////                    db.stmt.execute("INSERT INTO film values (null,'" + imgFile + "','" + judul + "'," + genre + ");");
////                }
//                JOptionPane.showMessageDialog(null, "BERHASIL!");
//            } catch (SQLException e) {
//                System.err.println("Input Gagal " + e.getMessage());
//            }
            inputNama.setText("");
            inputJumlah.setText("");

            file = null;
        }
        else{
            JOptionPane.showMessageDialog(null, "Ada data yang kosong!");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void inputJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJumlahActionPerformed

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
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDirector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDirector().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseBtn;
    private javax.swing.JTextField inputJumlah;
    private javax.swing.JTextField inputNama;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jumlahFilm;
    private javax.swing.JLabel lblTxt;
    private javax.swing.JLabel namaLabel1;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables

    private static class chooser {

        private static void setFileFilter(FileFilter imageFile) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addChoosableFileFilter(FileFilter imageFile) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static int showOpenDialog(AddDirector aThis) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static File getSelectedFile() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public chooser() {
        }
    }

    private static class fieldFotoAlbumPath {

        private static void setText(String absolutePath) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public fieldFotoAlbumPath() {
        }
    }

    private static class fieldFotoAlbum {

        private static void setText(String name) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public fieldFotoAlbum() {
        }
    }
}