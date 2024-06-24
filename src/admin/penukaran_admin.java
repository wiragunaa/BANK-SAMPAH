package admin;

import javax.swing.JOptionPane;
import Login_Register.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

public class penukaran_admin extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    public penukaran_admin(String username, String fullname) {
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
        jPanel2 = new javax.swing.JPanel();
        label_utama = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        totalpenukaran_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catatan_field = new javax.swing.JTextArea();
        catatan_label = new javax.swing.JLabel();
        tambah_button = new javax.swing.JButton();
        tambahpoin_label = new javax.swing.JLabel();
        totalpenukaran_field = new javax.swing.JSpinner();
        tambahpoin_field = new javax.swing.JSpinner();

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_utama.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        label_utama.setText("TAMBAH POIN PENGGUNA");

        username_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        username_label.setText("Username");

        username_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username_field.setForeground(new java.awt.Color(102, 102, 102));
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        totalpenukaran_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        totalpenukaran_label.setText("Total Penukaran (Kg)");

        catatan_field.setColumns(20);
        catatan_field.setRows(5);
        jScrollPane1.setViewportView(catatan_field);

        catatan_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        catatan_label.setText("Catatan");

        tambah_button.setBackground(new java.awt.Color(120, 148, 97));
        tambah_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tambah_button.setForeground(new java.awt.Color(255, 255, 255));
        tambah_button.setText("Tambah Poin!");
        tambah_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_buttonActionPerformed(evt);
            }
        });

        tambahpoin_label.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        tambahpoin_label.setText("Tambah Poin");

        totalpenukaran_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalpenukaran_field.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        tambahpoin_field.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tambahpoin_field.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(username_field)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambah_button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(catatan_label)
                            .addComponent(username_label))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(totalpenukaran_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalpenukaran_field))
                        .addGap(113, 113, 113)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tambahpoin_label)
                            .addComponent(tambahpoin_field))))
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_utama)
                .addGap(128, 128, 128))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(label_utama)
                .addGap(71, 71, 71)
                .addComponent(username_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalpenukaran_label)
                    .addComponent(tambahpoin_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalpenukaran_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahpoin_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(catatan_label)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(tambah_button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static boolean isNumber(String num){
        try{
            Integer.parseInt(num);
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
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
        jadwal_admin jadwalPage = new jadwal_admin(username_pengguna, fullname_pengguna);
        jadwalPage.setVisible(true);
        jadwalPage.setLocationRelativeTo(null);
    }//GEN-LAST:event_jadwal_name1MouseClicked

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_fieldActionPerformed

    private void tambah_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_buttonActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda ingin memberikan poin?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(answer == 0){
            // deklarasi variabel
            String username = "", catatan = "", query;
            String SUrl, SUser, SPass;
            int poin_tambahan = 0, berat_total = 0;

            // Persiapan database, ganti nama db
            SUrl = "jdbc:MySQL://localhost:3306/db_pengguna_banksampah";
            SUser = "root";
            SPass = "";

            try{
                // menghubungkan ke database
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                Statement st = con.createStatement();

                // membaca beberapa field
                username = username_field.getText();
                poin_tambahan = (int) tambahpoin_field.getValue();
                berat_total = (int) totalpenukaran_field.getValue();
                catatan = catatan_field.getText();

                if("".equals(username_field.getText())){ // jika username kosong
                    JOptionPane.showMessageDialog(new JFrame(), "Username Tidak Boleh Kosong", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if(poin_tambahan == 0){ // jika poin kosong
                    JOptionPane.showMessageDialog(new JFrame(), "Poin Diperlukan", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if(berat_total == 0){ // jika berat kosong
                    JOptionPane.showMessageDialog(new JFrame(), "Banyak Sampah Diperlukan", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else if(poin_tambahan < 0 || berat_total < 0 ){
                    JOptionPane.showMessageDialog(new JFrame(), "Poin atau berat harus valid!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else{
                    // buat query untuk mengecek apakah username ada
                    query = "SELECT * FROM tb_pengguna WHERE username_pengguna = '"+username+"' ";

                    // cek apakah di database ada hasilnya
                    int Found = 0;
                    ResultSet rs = st.executeQuery(query);
                    while(rs.next()){
                        Found = 1;
                    }

                    // jika tidak ada usernamenya, maka pesan error
                    if(Found == 0){
                        JOptionPane.showMessageDialog(new JFrame(), "Username yang dimasukkan tidak ada!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                    } else{
                        // Mencoba print hasil masukan dari user
                        System.out.println("username pengguna: " + username);
                        System.out.println(berat_total);
                        System.out.println(poin_tambahan);
                        System.out.println(catatan);

                        // Masukkan seluruh data ke tabel penukaran atau databse
                        query = "INSERT INTO tb_penukaran_sampah(username_pengguna, poin_tambahan, berat_total, catatan) VALUES ('"
                                + username + "', "+poin_tambahan+", "+berat_total+", '"+
                                catatan+"') ";
                        st.execute(query);

                        // Perbarui data poin pada tabel pengguna
                        query = "UPDATE tb_pengguna SET poin_pengguna = poin_pengguna + " + poin_tambahan
                                + " WHERE username_pengguna = '" + username + "' ";
                        st.execute(query);

                        showMessageDialog(null, "Berhasil Menambahkan Poin!");
                        
                        // set default
                        username_field.setText(" ");
                        catatan_field.setText(" ");
                        totalpenukaran_field.setValue(0);
                        tambahpoin_field.setValue(0);
                    }
                }
            } catch (Exception e){
                System.out.println("Error!" + e.getMessage());
            }
        }
        
    }//GEN-LAST:event_tambah_buttonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea catatan_field;
    private javax.swing.JLabel catatan_label;
    private javax.swing.JLabel dashboard_name1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jadwal_name1;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel label_utama;
    private javax.swing.JLabel logout_name;
    private javax.swing.JLabel penukaranpoin_name;
    private javax.swing.JButton tambah_button;
    private javax.swing.JSpinner tambahpoin_field;
    private javax.swing.JLabel tambahpoin_label;
    private javax.swing.JSpinner totalpenukaran_field;
    private javax.swing.JLabel totalpenukaran_label;
    private javax.swing.JTextField username_field;
    private javax.swing.JLabel username_label;
    // End of variables declaration//GEN-END:variables
}
