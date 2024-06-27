package operator;

import admin.*;
import javax.swing.JOptionPane;
import Login_Register.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;


public class jadwal_operator extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    public jadwal_operator(String username, String fullname) {
        initComponents();
        username_pengguna = username;
        fullname_pengguna = fullname;
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
        jPanel5 = new javax.swing.JPanel();
        label_utama = new javax.swing.JLabel();
        tanggal_label = new javax.swing.JLabel();
        tanggal_field = new javax.swing.JTextField();
        hari_label = new javax.swing.JLabel();
        hari_field = new javax.swing.JTextField();
        jenis_label = new javax.swing.JLabel();
        jenis_field = new javax.swing.JTextField();
        tambah_button = new javax.swing.JButton();

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                penukaranpoin_nameMouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jadwal_name1MouseClicked(evt);
            }
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_utama.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        label_utama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_utama.setText("TAMBAHKAN PENGINGAT JADWAL");
        jPanel5.add(label_utama, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 30, 620, -1));

        tanggal_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tanggal_label.setText("Tanggal");
        jPanel5.add(tanggal_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        tanggal_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tanggal_field.setForeground(new java.awt.Color(102, 102, 102));
        tanggal_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggal_fieldActionPerformed(evt);
            }
        });
        jPanel5.add(tanggal_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 40));

        hari_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        hari_label.setText("Hari");
        jPanel5.add(hari_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        hari_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hari_field.setForeground(new java.awt.Color(102, 102, 102));
        hari_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hari_fieldActionPerformed(evt);
            }
        });
        jPanel5.add(hari_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 310, 40));

        jenis_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jenis_label.setText("Jenis Sampah");
        jPanel5.add(jenis_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jenis_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jenis_field.setForeground(new java.awt.Color(102, 102, 102));
        jenis_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenis_fieldActionPerformed(evt);
            }
        });
        jPanel5.add(jenis_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 40));

        tambah_button.setBackground(new java.awt.Color(120, 148, 97));
        tambah_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tambah_button.setForeground(new java.awt.Color(255, 255, 255));
        tambah_button.setText("Tambah Pengingat!");
        tambah_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_buttonActionPerformed(evt);
            }
        });
        jPanel5.add(tambah_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 230, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void penukaranpoin_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_penukaranpoin_nameMouseClicked
        dispose();
        penukaran_admin penukaranPage = new penukaran_admin(username_pengguna, fullname_pengguna);
        penukaranPage.setVisible(true);
        penukaranPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_penukaranpoin_nameMouseClicked

    private void jadwal_name1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jadwal_name1MouseClicked
        dispose();
        jadwal_operator jadwalPage = new jadwal_operator(username_pengguna, fullname_pengguna);
        jadwalPage.setVisible(true);
        jadwalPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jadwal_name1MouseClicked

    private void tanggal_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggal_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggal_fieldActionPerformed

    private void hari_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hari_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hari_fieldActionPerformed

    private void jenis_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenis_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenis_fieldActionPerformed

    private void tambah_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_buttonActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda ingin memberikan pengingat?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(answer == 0){
            // deklarasi variabel
            String hari = "", tanggal = "", jenis_sampah = "";
            String SUrl, SUser, SPass, query;
            

            // Persiapan database, ganti nama db
            SUrl = "jdbc:MySQL://localhost:3306/db_pengguna_banksampah";
            SUser = "root";
            SPass = "";

            try{
                // menghubungkan ke database
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                Statement st = con.createStatement();
                
                // mengisi variabel
                hari = hari_field.getText();
                tanggal = tanggal_field.getText();
                jenis_sampah = jenis_field.getText();
                
                // Memasukkan data ke database
                query = "UPDATE tb_jadwal SET hari = '"+hari+"', tanggal = '"+tanggal+"', jenis_sampah = '"+jenis_sampah+"' WHERE id = 1";
                st.execute(query);
                
                showMessageDialog(null, "Berhasil Menambahkan Pengingat!");
                
                // set ke default
                hari_field.setText(" ");
                tanggal_field.setText(" ");
                jenis_field.setText(" ");
            } catch (Exception e){
                System.out.println("Error!" + e.getMessage());
            }
        }

    }//GEN-LAST:event_tambah_buttonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dashboard_name1;
    private javax.swing.JTextField hari_field;
    private javax.swing.JLabel hari_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel jadwal_name1;
    private javax.swing.JTextField jenis_field;
    private javax.swing.JLabel jenis_label;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel label_utama;
    private javax.swing.JLabel logout_name;
    private javax.swing.JLabel penukaranpoin_name;
    private javax.swing.JButton tambah_button;
    private javax.swing.JTextField tanggal_field;
    private javax.swing.JLabel tanggal_label;
    // End of variables declaration//GEN-END:variables
}