package main_user;

import javax.swing.JOptionPane;
import Login_Register.*;

public class penukaranSampah extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    public penukaranSampah(String username, String fullname) {
        initComponents();
        username_pengguna = username;
        fullname_pengguna = fullname;
        username_display.setText("@" + username);
        fullname_display.setText(fullname);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username_display = new javax.swing.JLabel();
        fullname_display = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        judul_halaman = new javax.swing.JLabel();

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
        penukaransampah.setText("Penukaran Sampah");
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

        jPanel2.setBackground(new java.awt.Color(241, 204, 27));
        jPanel2.setPreferredSize(new java.awt.Dimension(270, 150));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/human_logo_putih.png"))); // NOI18N

        username_display.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username_display.setForeground(new java.awt.Color(255, 255, 255));
        username_display.setText("@guest");

        fullname_display.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fullname_display.setForeground(new java.awt.Color(255, 255, 255));
        fullname_display.setText("guest_full_name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fullname_display)
                            .addComponent(username_display)))
                    .addComponent(jLabel3))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username_display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fullname_display, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(241, 204, 27));
        jPanel3.setPreferredSize(new java.awt.Dimension(270, 150));

        judul_halaman.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        judul_halaman.setForeground(new java.awt.Color(255, 255, 255));
        judul_halaman.setText("Halaman Penukaran");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(judul_halaman)
                .addGap(42, 42, 42))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(judul_halaman, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        penukaranSampah dashboardPage = new penukaranSampah(username_pengguna, fullname_pengguna);
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
    private javax.swing.JLabel fullname_display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jadwal;
    private javax.swing.JLabel judul_halaman;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel penukaransampah;
    private javax.swing.JLabel profil;
    private javax.swing.JLabel username_display;
    // End of variables declaration//GEN-END:variables
}
