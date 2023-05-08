/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package page;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modul.koneksi;
import modul.userSession;

/**
 *
 * @author BYTECOM
 */
public class qa_ui extends javax.swing.JFrame {

    String ulv = userSession.getUserLevel();
        /**
         * Creates new form daftar_proyek_ui
         */
        public qa_ui() {
                initComponents();
                loadData();
                loadTable();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnDell = new javax.swing.JButton();
        jid = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jnama_proyek = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jstart_date = new javax.swing.JLabel();
        comboNamaProyek = new javax.swing.JComboBox<>();
        textNo = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tableBast = new javax.swing.JTable();
        dateBast = new com.toedter.calendar.JDateChooser();
        jpekerjaan1 = new javax.swing.JLabel();
        textLampiran = new javax.swing.JTextField();
        labelLampiran = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btnEdit.setBackground(new java.awt.Color(0, 204, 204));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/edit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QA");

        btnDell.setBackground(new java.awt.Color(0, 204, 204));
        btnDell.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDell.setForeground(new java.awt.Color(255, 255, 255));
        btnDell.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/delete.png"))); // NOI18N
        btnDell.setText("Delete");
        btnDell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDellActionPerformed(evt);
            }
        });

        jid.setBackground(new java.awt.Color(255, 255, 255));
        jid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jid.setForeground(new java.awt.Color(255, 255, 255));
        jid.setText("ID                     :");

        btnClear.setBackground(new java.awt.Color(0, 204, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/eraser.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jnama_proyek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jnama_proyek.setForeground(new java.awt.Color(255, 255, 255));
        jnama_proyek.setText("Nama Proyek :");

        btnExit.setBackground(new java.awt.Color(0, 204, 204));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/logout.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnRefresh.setBackground(new java.awt.Color(0, 204, 204));
        btnRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(255, 255, 255));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/refresh.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRefresh.setIconTextGap(10);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jstart_date.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jstart_date.setForeground(new java.awt.Color(255, 255, 255));
        jstart_date.setText("Tanggal           :");

        comboNamaProyek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSave.setBackground(new java.awt.Color(0, 204, 204));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/floppy-disk.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSave.setIconTextGap(10);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tableBast.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tableBast.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBastMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tableBast);

        jpekerjaan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jpekerjaan1.setForeground(new java.awt.Color(255, 255, 255));
        jpekerjaan1.setText("Lampiran       :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(29, 29, 29)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(129, 129, 129)
                            .addComponent(btnRefresh))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jnama_proyek)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comboNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jid)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jpekerjaan1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(textLampiran))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jstart_date)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dateBast, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnDell, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelLampiran, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnRefresh))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jid)
                                .addComponent(textNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jstart_date)
                                .addComponent(dateBast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jnama_proyek)
                            .addComponent(comboNamaProyek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpekerjaan1)
                            .addComponent(textLampiran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSave)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDell, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(labelLampiran, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRefreshActionPerformed
                // TODO add your handling code here:
                loadData();
                loadTable();
                textNo.setText("");
                comboNamaProyek.setSelectedIndex(0);
                textLampiran.setText("");
                dateBast.setDate(null);
                labelLampiran.setIcon(null);
        }// GEN-LAST:event_btnRefreshActionPerformed

        private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
                // TODO add your handling code here:
                dispose();
        }// GEN-LAST:event_btnExitActionPerformed

        private void btnLampiranActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLampiranActionPerformed
                // TODO add your handling code here:
                try {
                        String[] pics = new String[] { "gif", "jpg", "tif", "png", "jpeg", "jfif", "tiff    " };
                        JFileChooser chooser = new JFileChooser();
                        chooser.addChoosableFileFilter(new SimpleFileFilter(pics, "Image files"));
                        chooser.setAcceptAllFileFilterUsed(false);
                        
                        int option = chooser.showOpenDialog(qa_ui.this);
                        File f = chooser.getSelectedFile();
                        String filename = f.getAbsolutePath();
                        String fileType = chooser.getTypeDescription(f);
                
                        textLampiran.setText(filename);
                        ImageIcon imageIcon = new ImageIcon(
                                        new ImageIcon(filename).getImage().getScaledInstance(labelLampiran.getWidth(),
                                                        labelLampiran.getHeight(), Image.SCALE_DEFAULT));
                        labelLampiran.setIcon(imageIcon);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Pilih File");
                }
        }// GEN-LAST:event_btnLampiranActionPerformed

        private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSaveActionPerformed
                // TODO add your handling code here:
                java.sql.Connection con;
                PreparedStatement p;
                try {
                        con = koneksi.getKoneksi();
                        p = (PreparedStatement) con.prepareStatement(
                                        "insert into bast(Nama_Project,Tanggal,lampiran,File_Name) values(?,?,?,?)");
                        p.setString(1, comboNamaProyek.getSelectedItem().toString());
                        p.setDate(2, new java.sql.Date(dateBast.getDate().getTime()));
                        String dir = textLampiran.getText();
                        File file = new File(dir);
                        FileInputStream fi = new FileInputStream(file);
                        p.setBinaryStream(3, fi, (int) file.length());
                        p.setString(4, file.getName());
                        p.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                        String sql = "update master_project set Status='Selesai' where Nama_Project='"
                                        + comboNamaProyek.getSelectedItem().toString() + "'";
                        p = (PreparedStatement) con.prepareStatement(sql);
                        p.executeUpdate();
                        textNo.setText("");
                        comboNamaProyek.setSelectedIndex(0);
                        textLampiran.setText("");
                        dateBast.setDate(null);
                        loadTable();
                        labelLampiran.setIcon(null);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data Gagal Disimpan");
                }
        }// GEN-LAST:event_btnSaveActionPerformed

        private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEditActionPerformed
                // TODO add your handling code here:
                java.sql.Connection con;
                PreparedStatement p;
                try {
                        con = koneksi.getKoneksi();
                        p = (PreparedStatement) con.prepareStatement(
                                        "update bast set Tanggal=? where ID=?");
                        p.setDate(1, new java.sql.Date(dateBast.getDate().getTime()));
                        p.setString(2, textNo.getText());
                        p.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
                        textNo.setText("");
                        comboNamaProyek.setSelectedIndex(0);
                        textLampiran.setText("");
                        dateBast.setDate(null);
                        loadTable();
                        labelLampiran.setIcon(null);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data Gagal Diubah");
                }
        }// GEN-LAST:event_btnEditActionPerformed

        private void btnDellActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDellActionPerformed
                // TODO add your handling code here:
                java.sql.Connection con;
                PreparedStatement p;
                try {
                        con = koneksi.getKoneksi();
                        p = (PreparedStatement) con.prepareStatement(
                                        "delete from bast where ID=?");
                        p.setString(1, textNo.getText());
                        p.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
                        String sql = "update master_project set Status ='On Progress' where Nama_Project ='"
                                        + comboNamaProyek.getSelectedItem().toString() + "'";
                        p = (PreparedStatement) con.prepareStatement(sql);
                        p.executeUpdate();
                        textNo.setText("");
                        comboNamaProyek.setSelectedIndex(0);
                        textLampiran.setText("");
                        dateBast.setDate(null);
                        loadTable();
                        con.close();
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
                }
        }// GEN-LAST:event_btnDellActionPerformed

        private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnClearActionPerformed
                // TODO add your handling code here:
                textNo.setText("");
                comboNamaProyek.setSelectedIndex(0);
                textLampiran.setText("");
                dateBast.setDate(null);
                labelLampiran.setIcon(null);
        }// GEN-LAST:event_btnClearActionPerformed

        private void btnUnduhActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnUnduhActionPerformed
                // TODO add your handling code here:

                // download file from database

        }// GEN-LAST:event_btnUnduhActionPerformed

        private void tableBastMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tableBastMouseClicked
                // TODO add your handling code here:
                int row = tableBast.getSelectedRow();
                String no = tableBast.getValueAt(row, 0).toString();
                textNo.setText(tableBast.getValueAt(row, 0).toString());
                comboNamaProyek.setSelectedItem(tableBast.getValueAt(row, 1).toString());
                textLampiran.setText(tableBast.getValueAt(row, 3).toString());
                String date = tableBast.getValueAt(row, 2).toString();
                try {
                        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                        Date date1 = format.parse(date);
                        dateBast.setDate(date1);
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Tanggal Salah");
                }
                try {
                        java.sql.Connection conn = (Connection) koneksi.getKoneksi();
                        String sql = "SELECT Lampiran FROM bast WHERE ID = (?)";
                        PreparedStatement pst = (PreparedStatement) conn.prepareStatement(sql);
                        pst.setString(1, no);
                        ResultSet rs = (ResultSet) pst.executeQuery();
                        if (rs.next()) {
                                byte[] img = rs.getBytes("Lampiran");
                                ImageIcon image = new ImageIcon(img);
                                Image im = image.getImage();
                                Image myImg = im.getScaledInstance(labelLampiran.getWidth(), labelLampiran.getHeight(),
                                                Image.SCALE_SMOOTH);
                                ImageIcon image1 = new ImageIcon(myImg);
                                labelLampiran.setIcon(image1);
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Gagal");
                }

        }// GEN-LAST:event_tableBastMouseClicked

        private void loadData() {
                textNo.setEditable(false);
                labelLampiran.setIcon(null);
                DefaultComboBoxModel comboBoxNamaProyek = new DefaultComboBoxModel();
                comboBoxNamaProyek.addElement("-- Pilih Nama Proyek --");

                try {
                        java.sql.Connection con = koneksi.getKoneksi();
                        Statement stmt = (Statement) con.createStatement();
                        // nama proyek
                        String sql = "SELECT Nama_Project FROM master_project";
                        ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                        while (rs.next()) {
                                comboBoxNamaProyek.addElement(rs.getString("Nama_Project"));
                        }
                        comboNamaProyek.setModel(comboBoxNamaProyek);
                        con.close();
                } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                }
                               
                
        System.out.println(ulv);
        // JOptionPane.showMessageDialog(null, "anda login sebgai " + ulv);
        switch (ulv) {
            case "admin":
                btnSave.setEnabled(true);
                btnDell.setEnabled(true);
                btnEdit.setEnabled(true);
                break;
            case "teknisi":
                btnSave.setEnabled(false);
                btnDell.setEnabled(false);
                btnEdit.setEnabled(false);
                break;
            case "ceo":
                btnSave.setEnabled(false);
                btnDell.setEnabled(false);
                btnEdit.setEnabled(false);
                break;
            default:
                break;
        }
        }

        private void loadTable() {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("No");
                model.addColumn("Nama Proyek");
                model.addColumn("Tanggal");
                model.addColumn("File Name");
                tableBast.setModel(model);
                try {
                        java.sql.Connection con = koneksi.getKoneksi();
                        Statement stmt = (Statement) con.createStatement();
                        String sql = "SELECT * FROM bast";
                        ResultSet rs = (ResultSet) stmt.executeQuery(sql);
                        while (rs.next()) {
                                model.addRow(new Object[] {
                                                rs.getString("id"),
                                                rs.getString("Nama_Project"),
                                                rs.getString("Tanggal"),
                                                rs.getString("File_Name")
                                });
                        }
                        con.close();
                } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                }
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(qa_ui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(qa_ui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(qa_ui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(qa_ui.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new qa_ui().setVisible(true);
                        }
                });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDell;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> comboNamaProyek;
    private com.toedter.calendar.JDateChooser dateBast;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jnama_proyek;
    private javax.swing.JLabel jpekerjaan1;
    private javax.swing.JLabel jstart_date;
    private javax.swing.JLabel labelLampiran;
    private javax.swing.JTable tableBast;
    private javax.swing.JTextField textLampiran;
    private javax.swing.JTextField textNo;
    // End of variables declaration//GEN-END:variables
}
