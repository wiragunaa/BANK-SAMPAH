package main_user;

import javax.swing.JOptionPane;
import Login_Register.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;

public class penukaranSampah extends javax.swing.JFrame {
    String username_pengguna;
    String fullname_pengguna;
    int hitung_beras = 0, hitung_gula = 0, hitung_mie = 0, total_poin_penukaran = 0;
    int poin_pengguna_temp = 0;
    
    public penukaranSampah(String username, String fullname) {
        initComponents();
        username_pengguna = username;
        fullname_pengguna = fullname;
        username_display.setText("@" + username);
        fullname_display.setText(fullname);
        
        // cek poin yang dimiliki pengguna
        ambil_poin_pengguna();
        
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
        jPanel4 = new javax.swing.JPanel();
        harga_beras = new javax.swing.JLabel();
        gambar_beras = new javax.swing.JLabel();
        jumlah_beras = new javax.swing.JSpinner();
        angka_poin = new javax.swing.JLabel();
        gula_label = new javax.swing.JLabel();
        harga_gula = new javax.swing.JLabel();
        gambar_gula = new javax.swing.JLabel();
        jumlah_gula = new javax.swing.JSpinner();
        mie_label = new javax.swing.JLabel();
        harga_mie = new javax.swing.JLabel();
        gambar_mie = new javax.swing.JLabel();
        jumlah_mie = new javax.swing.JSpinner();
        poin_pengguna = new javax.swing.JLabel();
        fullname_display = new javax.swing.JLabel();
        username_display = new javax.swing.JLabel();
        fullname_display2 = new javax.swing.JLabel();
        beras_label1 = new javax.swing.JLabel();
        jumlah_poin1 = new javax.swing.JLabel();
        reset_poin = new javax.swing.JButton();
        tukarkan_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(950, 620));

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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        harga_beras.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        harga_beras.setForeground(new java.awt.Color(255, 51, 51));
        harga_beras.setText("300 PTS");
        jPanel4.add(harga_beras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        gambar_beras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gambarBeras.jpg"))); // NOI18N
        gambar_beras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(gambar_beras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 190, 130));

        jumlah_beras.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jumlah_beras.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlah_berasStateChanged(evt);
            }
        });
        jPanel4.add(jumlah_beras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 190, 30));

        angka_poin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        angka_poin.setForeground(new java.awt.Color(255, 51, 51));
        angka_poin.setText("0 PTS");
        jPanel4.add(angka_poin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));

        gula_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gula_label.setText("Gula (Kg)");
        jPanel4.add(gula_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        harga_gula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        harga_gula.setForeground(new java.awt.Color(255, 51, 51));
        harga_gula.setText("250 PTS");
        jPanel4.add(harga_gula, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        gambar_gula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gambarGula.jpg"))); // NOI18N
        gambar_gula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(gambar_gula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 190, 130));

        jumlah_gula.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jumlah_gula.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlah_gulaStateChanged(evt);
            }
        });
        jPanel4.add(jumlah_gula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 190, 30));

        mie_label.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mie_label.setText("Mie (Biji)");
        jPanel4.add(mie_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        harga_mie.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        harga_mie.setForeground(new java.awt.Color(255, 51, 51));
        harga_mie.setText("60 PTS");
        jPanel4.add(harga_mie, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, -1));

        gambar_mie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/gambarMie.png"))); // NOI18N
        gambar_mie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(gambar_mie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 190, 130));

        jumlah_mie.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jumlah_mie.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jumlah_mieStateChanged(evt);
            }
        });
        jPanel4.add(jumlah_mie, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 190, 30));

        poin_pengguna.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        poin_pengguna.setForeground(new java.awt.Color(255, 51, 51));
        poin_pengguna.setText("0 PTS");
        jPanel4.add(poin_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        fullname_display.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fullname_display.setText("guest_full_name");
        jPanel4.add(fullname_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 20));

        username_display.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        username_display.setText("@guest");
        jPanel4.add(username_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 20));

        fullname_display2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        fullname_display2.setText("HALAMAN PENUKARAN POIN PENGGUNA");
        jPanel4.add(fullname_display2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 30));

        beras_label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        beras_label1.setText("Beras (Kg)");
        jPanel4.add(beras_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jumlah_poin1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jumlah_poin1.setText("Total Poin: ");
        jPanel4.add(jumlah_poin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));

        reset_poin.setBackground(new java.awt.Color(255, 153, 153));
        reset_poin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reset_poin.setForeground(new java.awt.Color(255, 255, 255));
        reset_poin.setText("Reset Barang");
        reset_poin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_poinActionPerformed(evt);
            }
        });
        jPanel4.add(reset_poin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 150, 40));

        tukarkan_button.setBackground(new java.awt.Color(120, 148, 97));
        tukarkan_button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tukarkan_button.setForeground(new java.awt.Color(255, 255, 255));
        tukarkan_button.setText("TUKARKAN!");
        tukarkan_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tukarkan_buttonActionPerformed(evt);
            }
        });
        jPanel4.add(tukarkan_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 510, 210, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ambil_poin_pengguna(){
        // mencoba mengambil database
        try{
            String SUrl, SUser, SPass, query;
            String alamat, kabupaten, kecamatan, kelurahan, notelp;

            // isi sesuai dengan database
            SUrl = "jdbc:MySQL://localhost:3306/db_pengguna_banksampah"; // UBAH SESUAI DATABASE
            SUser = "root";
            SPass = "";

            // koneksikan ke database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
            Statement st = con.createStatement();
                
            // Mengambil poin
            query = "SELECT poin_pengguna FROM tb_pengguna WHERE username_pengguna = '" + username_pengguna + "'";
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                poin_pengguna_temp = rs.getInt("poin_pengguna");
            }
            
            poin_pengguna.setText(poin_pengguna_temp + " PTS");
        } catch(Exception e){
            System.out.println("Error!" + e.getMessage());
        }
    }
    
    private void hitung_poin(){
        // mengambil masing-masing nilai dari spinner
        hitung_beras = (int) jumlah_beras.getValue();
        hitung_gula = (int) jumlah_gula.getValue();
        hitung_mie = (int) jumlah_mie.getValue();
        
        // menghitung poin total
        total_poin_penukaran = hitung_beras*300 + hitung_gula*250 + hitung_mie*60;
        angka_poin.setText(Integer.toString(total_poin_penukaran));
    }
    
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

    private void reset_poinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_poinActionPerformed
        jumlah_beras.setValue(0);
        jumlah_gula.setValue(0);
        jumlah_mie.setValue(0);
    }//GEN-LAST:event_reset_poinActionPerformed

    private void tukarkan_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tukarkan_buttonActionPerformed
        hitung_poin();
        int answer = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menukarkan poin?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if(answer==0){
            try{
                String SUrl, SUser, SPass, query, list_barang = "";
                int cnt = 0;

                // isi sesuai dengan database
                SUrl = "jdbc:MySQL://localhost:3306/db_pengguna_banksampah"; // UBAH SESUAI DATABASE
                SUser = "root";
                SPass = "";

                // koneksikan ke database
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection(SUrl, SUser, SPass);
                Statement st = con.createStatement();
                ResultSet rs;
                
                // percobaan penukaran barang
                if(total_poin_penukaran > poin_pengguna_temp){
                    JOptionPane.showMessageDialog(new JFrame(), "POIN KURANG!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                } else if(hitung_beras == 0 && hitung_gula==0 && hitung_mie == 0){
                    JOptionPane.showMessageDialog(new JFrame(), "Harap Isi Jumlah Barang!", "Error",
                        JOptionPane.ERROR_MESSAGE);
                } else{
                    // Mengurangi poin pengguna yang ditukar
                    query = "UPDATE tb_pengguna SET poin_pengguna = poin_pengguna - " + total_poin_penukaran
                            + " WHERE username_pengguna = '" + username_pengguna + "' ";
                    st.execute(query);
                    
                    // mencari banyak penukaran yang ada
                    query = "SELECT COUNT(*) FROM tb_penukaran_barang";
                    rs = st.executeQuery(query);
                    
                    while(rs.next()){
                        cnt = Integer.parseInt(rs.getString("COUNT(*)"));
                    }
                    
                    // Membuat kode unik
                    String kodeUnik = "PNK0" + Integer.toString(cnt+1);
                    
                    // melihat list barang
                    if(hitung_beras > 0){
                        list_barang = list_barang + Integer.toString(hitung_beras) + " Kg beras. ";
                    }
                    if(hitung_gula > 0){
                        list_barang = list_barang + Integer.toString(hitung_gula) + " Kg gula. ";
                    }
                    if(hitung_mie > 0){
                        list_barang = list_barang + Integer.toString(hitung_mie) + " buah mie. ";
                    }
                    
                    System.out.println(list_barang);
                    // Memasukkan ke tabel penukaran barang
                    query = "INSERT INTO tb_penukaran_barang(id_unik, username_pengguna, poin_ditukarkan, list_barang, status_pengambilan) VALUES ('"
                            +kodeUnik+"', '"+username_pengguna+"', "+total_poin_penukaran+", '"+list_barang+"', 'Belum')";
                    st.execute(query);
                    
                    // Pesan Penting
                    showMessageDialog(null, "Berhasil Menukarkan Poin!");
                    showMessageDialog(null, "Silahkan Sebutkan Kode Unik: "+kodeUnik+" dan Username Pada Saat Penukaran");
                    
                    dispose();
                    Dashboard dashboardPage = new Dashboard(username_pengguna, fullname_pengguna);
                    dashboardPage.setVisible(true);
                    dashboardPage.setLocationRelativeTo(null);
                }
            } catch(Exception e){
                System.out.println("Error!" + e.getMessage());
            }
        }
    }//GEN-LAST:event_tukarkan_buttonActionPerformed

    private void jumlah_berasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlah_berasStateChanged
        hitung_poin();
    }//GEN-LAST:event_jumlah_berasStateChanged

    private void jumlah_gulaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlah_gulaStateChanged
        hitung_poin();
    }//GEN-LAST:event_jumlah_gulaStateChanged

    private void jumlah_mieStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jumlah_mieStateChanged
        hitung_poin();
    }//GEN-LAST:event_jumlah_mieStateChanged

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel angka_poin;
    private javax.swing.JLabel beras_label1;
    private javax.swing.JLabel dashboard;
    private javax.swing.JLabel edukasi;
    private javax.swing.JLabel fullname_display;
    private javax.swing.JLabel fullname_display2;
    private javax.swing.JLabel gambar_beras;
    private javax.swing.JLabel gambar_gula;
    private javax.swing.JLabel gambar_mie;
    private javax.swing.JLabel gula_label;
    private javax.swing.JLabel harga_beras;
    private javax.swing.JLabel harga_gula;
    private javax.swing.JLabel harga_mie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel jadwal;
    private javax.swing.JSpinner jumlah_beras;
    private javax.swing.JSpinner jumlah_gula;
    private javax.swing.JSpinner jumlah_mie;
    private javax.swing.JLabel jumlah_poin1;
    private javax.swing.JLabel label_pengaturan;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel mie_label;
    private javax.swing.JLabel penukaransampah;
    private javax.swing.JLabel poin_pengguna;
    private javax.swing.JLabel profil;
    private javax.swing.JButton reset_poin;
    private javax.swing.JButton tukarkan_button;
    private javax.swing.JLabel username_display;
    // End of variables declaration//GEN-END:variables
}
