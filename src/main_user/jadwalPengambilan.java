package main_user;

import javax.swing.JOptionPane;
import Login_Register.*;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class jadwalPengambilan extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    public jadwalPengambilan(String username, String fullname) {
        initComponents();
        username_pengguna = username;
        fullname_pengguna = fullname;
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
         
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
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
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        penukaransampah = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        edukasi = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_pengaturan = new javax.swing.JLabel();
        jadwal = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        profil = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(80, 98, 58));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Lemon", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 204, 27));
        jLabel6.setText("ECO PEDULI");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logoEco_kecil.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 14, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/dashboard_menu.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/poin_menu.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        penukaransampah.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        penukaransampah.setForeground(new java.awt.Color(255, 255, 255));
        penukaransampah.setText("Penukaran Poin");
        penukaransampah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penukaransampahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                penukaransampahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                penukaransampahMouseExited(evt);
            }
        });
        jPanel1.add(penukaransampah, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edukasi_menu.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        edukasi.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        edukasi.setForeground(new java.awt.Color(255, 255, 255));
        edukasi.setText("Edukasi Tentang Sampah");
        edukasi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                edukasiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edukasiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edukasiMouseExited(evt);
            }
        });
        jPanel1.add(edukasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/jadwal_menu.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        label_pengaturan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_pengaturan.setForeground(new java.awt.Color(255, 255, 255));
        label_pengaturan.setText("Pengaturan Akun");
        jPanel1.add(label_pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, 20));

        jadwal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jadwal.setForeground(new java.awt.Color(255, 255, 255));
        jadwal.setText("Jadwal Pengambilan Sampah");
        jadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jadwalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jadwalMouseExited(evt);
            }
        });
        jPanel1.add(jadwal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/profile_menu.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        profil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        profil.setForeground(new java.awt.Color(255, 255, 255));
        profil.setText("Profil Pengguna");
        profil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilMouseExited(evt);
            }
        });
        jPanel1.add(profil, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, 20));

        dashboard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
        dashboard.setText("Dashboard");
        dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardMouseExited(evt);
            }
        });
        jPanel1.add(dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, 20));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout_menu.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

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
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(80, 98, 58));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Comic Lemon", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 204, 27));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("eco peduli");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 620, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseClicked
        dispose();
        profilPengguna profilPage = new profilPengguna(username_pengguna, fullname_pengguna);
        profilPage.setVisible(true);
        profilPage.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_profilMouseClicked

    private void profilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseEntered
        profil.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_profilMouseEntered

    private void profilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilMouseExited
        profil.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_profilMouseExited

    private void dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseEntered
        dashboard.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_dashboardMouseEntered

    private void dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseExited
        dashboard.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_dashboardMouseExited

    private void penukaransampahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaransampahMouseEntered
        penukaransampah.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_penukaransampahMouseEntered

    private void penukaransampahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaransampahMouseExited
        penukaransampah.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_penukaransampahMouseExited

    private void edukasiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edukasiMouseEntered
        edukasi.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_edukasiMouseEntered

    private void edukasiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edukasiMouseExited
        edukasi.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_edukasiMouseExited

    private void jadwalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseEntered
        jadwal.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_jadwalMouseEntered

    private void jadwalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseExited
        jadwal.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jadwalMouseExited

    private void dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardMouseClicked
        dispose();
        Dashboard dashboardPage = new Dashboard(username_pengguna, fullname_pengguna);
        dashboardPage.setVisible(true);
        dashboardPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_dashboardMouseClicked

    private void penukaransampahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaransampahMouseClicked
        dispose();
        penukaranSampah penukaranPage = new penukaranSampah(username_pengguna, fullname_pengguna);
        penukaranPage.setVisible(true);
        penukaranPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_penukaransampahMouseClicked

    private void edukasiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edukasiMouseClicked
        dispose();
        edukasiSampah edukasiPage = new edukasiSampah(username_pengguna, fullname_pengguna);
        edukasiPage.setVisible(true);
        edukasiPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_edukasiMouseClicked

    private void jadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwalMouseClicked
        dispose();
        jadwalPengambilan jadwalPage = new jadwalPengambilan(username_pengguna, fullname_pengguna);
        jadwalPage.setVisible(true);
        jadwalPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jadwalMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(answer==0){
            dispose();
            Login LoginPage = new Login();
            LoginPage.setVisible(true);
            LoginPage.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_logoutMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel edukasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jadwal;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel penukaransampah;
    private javax.swing.JLabel profil;
    // End of variables declaration//GEN-END:variables
}
