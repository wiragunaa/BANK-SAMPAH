package Login_Register;

import Login_Register.MenuAwal2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import main_aplikasiBankSampah.*;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class MenuAwal3 extends javax.swing.JFrame {
    public MenuAwal3() {
        initComponents();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
         
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        Previous1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        LogIn2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel4.setBackground(new java.awt.Color(120, 148, 97));

        Previous1.setText("<< Previous");
        Previous1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Previous1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Previous1)
                .addContainerGap(945, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Previous1)
                .addGap(11, 11, 11))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jPanel5.setBackground(new java.awt.Color(80, 98, 58));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoEco_kecil.png"))); // NOI18N

        LogIn2.setBackground(new java.awt.Color(120, 148, 97));
        LogIn2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogIn2.setForeground(new java.awt.Color(255, 255, 255));
        LogIn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/human_logo.png"))); // NOI18N
        LogIn2.setText("MASUK");
        LogIn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn2LogInActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Comic Lemon", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(241, 204, 27));
        jLabel14.setText("ECO PEDULI");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 734, Short.MAX_VALUE)
                .addComponent(LogIn2)
                .addGap(15, 15, 15))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LogIn2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)))
                .addContainerGap())
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(219, 231, 201));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 1, 18)); // NOI18N
        jLabel1.setText("TATA KELOLA BANK SAMPAH");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 12, 338, -1));

        jLabel2.setFont(new java.awt.Font("Poppins ExtraBold", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/B3.png"))); // NOI18N
        jLabel2.setText("B3 ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 291, -1, -1));

        jLabel3.setFont(new java.awt.Font("Poppins ExtraBold", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/anongarnik.png"))); // NOI18N
        jLabel3.setText("ANORGANIK");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 291, 122, -1));

        jLabel5.setFont(new java.awt.Font("Poppins ExtraBold", 0, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/organik.png"))); // NOI18N
        jLabel5.setText("ORGANIK");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 291, 122, -1));

        jLabel7.setText("Tata kelola sampah dilakukan dengan melakukan pemilahan sampah melalui");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 234, 465, -1));

        jLabel8.setText("pengelompokan sampah berdasarkan jenisnya. ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 256, 465, -1));

        jLabel9.setText("Tata kelola sampah melibatkan berbagai langkah untuk mengurangi, mengelola");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 42, 441, -1));

        jLabel10.setText("- Sisa Makanan");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 358, 122, -1));

        jLabel11.setText("- Daun-daun kering");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 392, 122, -1));

        jLabel12.setText("- Ranting Pohon");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 426, 122, -1));

        jLabel15.setText("- Ampas Teh/kopi ");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 461, 122, -1));

        jLabel16.setText("- Besi");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 461, 122, -1));

        jLabel17.setText("- Plastik");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 364, 122, -1));

        jLabel18.setText("- Kaca");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 392, 122, -1));

        jLabel19.setText("- Karet ");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 426, 122, -1));

        jLabel20.setText("- Pengharum Ruangan");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 358, 179, -1));

        jLabel21.setText("- Pembersih Kamar Mandi");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 392, 179, -1));

        jLabel22.setText("- Baterai");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 426, 179, -1));

        jLabel23.setText("- Lem Perekat");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 461, 179, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Senin", "ORGANIK"},
                {"2", "Selasa", "DAUR ULANG"},
                {"3", "Rabu", "ORGANIK"},
                {"4", "Kamis", "ORGANIK"},
                {"5", "Jumat", "RESIDU"},
                {"6", "Sabtu", "DAUR ULANG"},
                {"7", "Minggu", "ORGANIK"}
            },
            new String [] {
                "No.", "Hari", "Jenis Sampah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(65);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 480));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 6, 540, 480));

        jLabel6.setText("dan mendaur ulang sampah dengan tujuan meminimalkan dampak negatif ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 64, 441, -1));

        jLabel24.setText("terhadap lingkungan dan kesehatan. Berikut adalah prinsip tata kelola sampah.");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 86, 465, -1));

        jLabel25.setText("- Reduce : Mengurangi jumlah sampah dengan mengurangi konsumsi, memilih");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 108, 465, -1));

        jLabel26.setText("- Reuse   : Menggunakan kembali barang-barang yang masih layak pakai, seperti tas ");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 148, 465, -1));

        jLabel27.setText("- Recycle : Mendaur ulang bahan-bahan seperti plastik,kertas dan logam untuk ");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 190, 465, -1));

        jLabel28.setText("menggunakan barang-barang yang lebih tahan lama.");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 126, 465, -1));

        jLabel29.setText("belanja yang dapat digunalan kembali.");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 168, 465, -1));

        jLabel30.setText("digunakan kembali bahan baku");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 212, 465, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogIn2LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn2LogInActionPerformed
        Login LoginFrame = new Login();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_LogIn2LogInActionPerformed

    private void Previous1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Previous1ActionPerformed
       MenuAwal2 MenuAwal2Frame = new MenuAwal2();
        MenuAwal2Frame.setVisible(true);
        MenuAwal2Frame.pack();
        MenuAwal2Frame.setLocationRelativeTo(null);
        this.dispose();                                     
    }//GEN-LAST:event_Previous1ActionPerformed

    /**
    loginrgs the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LogIn2;
    private javax.swing.JButton Previous1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
