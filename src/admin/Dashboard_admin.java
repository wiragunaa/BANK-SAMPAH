package admin;

import javax.swing.JOptionPane;
import Login_Register.*;

public class Dashboard_admin extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    public Dashboard_admin(String username, String fullname) {
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
        penukaranpoin_name = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label_pengaturan = new javax.swing.JLabel();
        jadwal_name1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logout_name = new javax.swing.JLabel();
        dashboard_name1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        username_display = new javax.swing.JLabel();
        fullname_display = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        judul_halaman1 = new javax.swing.JLabel();

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

        penukaranpoin_name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        penukaranpoin_name.setForeground(new java.awt.Color(255, 255, 255));
        penukaranpoin_name.setText("Penukaran Sampah");
        penukaranpoin_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                penukaranpoin_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                penukaranpoin_nameMouseExited(evt);
            }
        });
        jPanel1.add(penukaranpoin_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/jadwal_menu.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        label_pengaturan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        label_pengaturan.setForeground(new java.awt.Color(255, 255, 255));
        label_pengaturan.setText("Pengaturan Akun");
        jPanel1.add(label_pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 20));

        jadwal_name1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jadwal_name1.setForeground(new java.awt.Color(255, 255, 255));
        jadwal_name1.setText("Jadwal Pengambilan Sampah");
        jadwal_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jadwal_name1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jadwal_name1MouseExited(evt);
            }
        });
        jPanel1.add(jadwal_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout_menu.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        logout_name.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout_name.setForeground(new java.awt.Color(255, 255, 255));
        logout_name.setText("Logout");
        logout_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_nameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logout_nameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logout_nameMouseExited(evt);
            }
        });
        jPanel1.add(logout_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, 20));

        dashboard_name1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        dashboard_name1.setForeground(new java.awt.Color(255, 255, 255));
        dashboard_name1.setText("Dashboard");
        dashboard_name1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboard_name1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboard_name1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboard_name1MouseExited(evt);
            }
        });
        jPanel1.add(dashboard_name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, 20));

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

        jPanel4.setBackground(new java.awt.Color(241, 204, 27));
        jPanel4.setPreferredSize(new java.awt.Dimension(270, 150));

        judul_halaman1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        judul_halaman1.setForeground(new java.awt.Color(255, 255, 255));
        judul_halaman1.setText("HALAMAN ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(judul_halaman1)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(judul_halaman1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void logout_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_nameMouseClicked
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(answer==0){
            dispose();
            Login LoginPage = new Login();
            LoginPage.setVisible(true);
            LoginPage.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_logout_nameMouseClicked

    private void logout_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_nameMouseEntered
        logout_name.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_logout_nameMouseEntered

    private void logout_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_nameMouseExited
        logout_name.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_logout_nameMouseExited

    private void dashboard_name1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_name1MouseEntered
        dashboard_name1.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_dashboard_name1MouseEntered

    private void dashboard_name1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_name1MouseExited
        dashboard_name1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_dashboard_name1MouseExited

    private void penukaranpoin_nameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaranpoin_nameMouseEntered
        penukaranpoin_name.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_penukaranpoin_nameMouseEntered

    private void penukaranpoin_nameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaranpoin_nameMouseExited
        penukaranpoin_name.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_penukaranpoin_nameMouseExited

    private void jadwal_name1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwal_name1MouseEntered
        jadwal_name1.setForeground(new java.awt.Color(30, 30, 123));
    }//GEN-LAST:event_jadwal_name1MouseEntered

    private void jadwal_name1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwal_name1MouseExited
        jadwal_name1.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jadwal_name1MouseExited

    private void dashboard_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboard_name1MouseClicked
        dispose();
        Dashboard_admin dashboardPage = new Dashboard_admin(username_pengguna, fullname_pengguna);
        dashboardPage.setVisible(true);
        dashboardPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_dashboard_name1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboard_name1;
    private javax.swing.JLabel fullname_display;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jadwal_name1;
    private javax.swing.JLabel judul_halaman1;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel logout_name;
    private javax.swing.JLabel penukaranpoin_name;
    private javax.swing.JLabel username_display;
    // End of variables declaration//GEN-END:variables
}
