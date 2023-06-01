/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package page;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import modul.userSession;

/**
 *
 * @author BYTECOM
 */
public class dashboard_ui extends javax.swing.JFrame {

    String ulv = userSession.getUserLevel();
    
    /** initiate JFrame **/
    daftar_proyek_ui dp = new daftar_proyek_ui();
    loginPage lp = new loginPage();
    halaman_report_ui hr = new halaman_report_ui();
    daftar_PIC_SRE_ui PicSre = new daftar_PIC_SRE_ui();
    timeline_ui t = new timeline_ui();
    maintenance_ui m = new maintenance_ui();
    report_proyek_ui rp = new report_proyek_ui();
    qa_ui qa = new qa_ui();
    

    /**
     * Creates new form dashboard_ui1
     */
    public dashboard_ui() {
        initComponents();
        loadData();
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2 - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlabel1 = new javax.swing.JPanel();
        jdashboard = new javax.swing.JLabel();
        jhome = new javax.swing.JButton();
        btnMaintenance = new javax.swing.JButton();
        btnDaftarProyek = new javax.swing.JButton();
        btnTimeline = new javax.swing.JButton();
        btnQA = new javax.swing.JButton();
        btnPicSre = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnHalamanReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textUserLevel = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(102, 102, 102));

        jlabel1.setBackground(new java.awt.Color(51, 51, 51));

        jdashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jdashboard.setForeground(new java.awt.Color(255, 255, 255));
        jdashboard.setText("Dashboard");
        jdashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jhome.setBackground(new java.awt.Color(0, 204, 204));
        jhome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jhome.setForeground(new java.awt.Color(255, 255, 255));
        jhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/home.png"))); // NOI18N
        jhome.setText("Logout");
        jhome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jhome.setIconTextGap(5);
        jhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jhomeActionPerformed(evt);
            }
        });

        btnMaintenance.setBackground(new java.awt.Color(0, 204, 204));
        btnMaintenance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnMaintenance.setForeground(new java.awt.Color(255, 255, 255));
        btnMaintenance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/project.png"))); // NOI18N
        btnMaintenance.setText("Maintance");
        btnMaintenance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMaintenance.setIconTextGap(10);
        btnMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaintenanceActionPerformed(evt);
            }
        });

        btnDaftarProyek.setBackground(new java.awt.Color(0, 204, 204));
        btnDaftarProyek.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDaftarProyek.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftarProyek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/document.png"))); // NOI18N
        btnDaftarProyek.setText("Daftar Proyek");
        btnDaftarProyek.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDaftarProyek.setIconTextGap(10);
        btnDaftarProyek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarProyekActionPerformed(evt);
            }
        });

        btnTimeline.setBackground(new java.awt.Color(0, 204, 204));
        btnTimeline.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimeline.setForeground(new java.awt.Color(255, 255, 255));
        btnTimeline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/tasks.png"))); // NOI18N
        btnTimeline.setText("Timeline");
        btnTimeline.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTimeline.setIconTextGap(10);
        btnTimeline.setVerifyInputWhenFocusTarget(false);
        btnTimeline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimelineActionPerformed(evt);
            }
        });

        btnQA.setBackground(new java.awt.Color(0, 204, 204));
        btnQA.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnQA.setForeground(new java.awt.Color(255, 255, 255));
        btnQA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/log-document.png"))); // NOI18N
        btnQA.setText("QA");
        btnQA.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQA.setIconTextGap(10);
        btnQA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQAActionPerformed(evt);
            }
        });

        btnPicSre.setBackground(new java.awt.Color(0, 204, 204));
        btnPicSre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPicSre.setForeground(new java.awt.Color(255, 255, 255));
        btnPicSre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/architect.png"))); // NOI18N
        btnPicSre.setText("PIC SRE");
        btnPicSre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPicSre.setIconTextGap(10);
        btnPicSre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPicSreActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(0, 204, 204));
        btnReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReport.setForeground(new java.awt.Color(255, 255, 255));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/planner.png"))); // NOI18N
        btnReport.setText("Report");
        btnReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReport.setIconTextGap(10);
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnHalamanReport.setBackground(new java.awt.Color(0, 204, 204));
        btnHalamanReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnHalamanReport.setForeground(new java.awt.Color(255, 255, 255));
        btnHalamanReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar_icon/dok.png"))); // NOI18N
        btnHalamanReport.setText("Halaman Report");
        btnHalamanReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHalamanReport.setIconTextGap(10);
        btnHalamanReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHalamanReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jlabel1Layout = new javax.swing.GroupLayout(jlabel1);
        jlabel1.setLayout(jlabel1Layout);
        jlabel1Layout.setHorizontalGroup(
            jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel1Layout.createSequentialGroup()
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnHalamanReport)
                        .addGap(83, 83, 83))
                    .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel1Layout.createSequentialGroup()
                            .addGap(141, 141, 141)
                            .addComponent(jdashboard)
                            .addGap(18, 18, 18)
                            .addComponent(jhome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jlabel1Layout.createSequentialGroup()
                                    .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnDaftarProyek)
                                        .addComponent(btnTimeline, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnQA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPicSre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jlabel1Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(textUserLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addGap(33, 33, 33))
        );
        jlabel1Layout.setVerticalGroup(
            jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jlabel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jhome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDaftarProyek, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQA, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimeline, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPicSre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jlabel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jlabel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnHalamanReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jlabel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textUserLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // private void btnHalamanReportActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnHalamanReportActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnHalamanReportActionPerformed

    // private void btnReportActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnReportActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnReportActionPerformed

    // private void btnPicSreActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnTeknisiActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnTeknisiActionPerformed

    // private void btnTimelineActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnTimelineActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnTimelineActionPerformed

    // private void btnDaftarProyekActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnDaftarProyekActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnDaftarProyekActionPerformed

    // private void btnMaintenanceActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_btnMaintenanceActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_btnMaintenanceActionPerformed

    // private void jhomeActionPerformed(java.awt.event.ActionEvent evt)
    // {//GEN-FIRST:event_jhomeActionPerformed
    // // TODO add your handling code here:
    // }//GEN-LAST:event_jhomeActionPerformed

    private void btnQAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQAActionPerformed
        // TODO add your handling code here:
        qa.setVisible(true);
    }//GEN-LAST:event_btnQAActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        rp.setVisible(true);
    }// GEN-LAST:event_btnReportActionPerformed

    private void jhomeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jhomeActionPerformed
        // TODO add your handling code here:
        this.dispose();
        dp.dispose();
        hr.dispose();
        PicSre.dispose();
        t.dispose();
        m.dispose();
        rp.dispose();
        qa.dispose();
        lp.setVisible(true);
        // loginPage.level = null;
    }// GEN-LAST:event_jhomeActionPerformed

    private void btnMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnMaintenanceActionPerformed
        // TODO add your handling code here:
        m.setVisible(true);
    }// GEN-LAST:event_btnMaintenanceActionPerformed

    private void btnDaftarProyekActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDaftarProyekActionPerformed
        // TODO add your handling code here:
        dp.setVisible(true);

    }// GEN-LAST:event_btnDaftarProyekActionPerformed

    private void btnTimelineActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimelineActionPerformed
        // TODO add your handling code here:
        t.setVisible(true);
    }// GEN-LAST:event_btnTimelineActionPerformed

    private void btnPicSreActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPicSreActionPerformed
        // TODO add your handling code here:
        PicSre.setVisible(true);
    }// GEN-LAST:event_btnPicSreActionPerformed

    private void btnHalamanReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHalamanReportActionPerformed
        // TODO add your handling code here:
        hr.setVisible(true);
    }// GEN-LAST:event_btnHalamanReportActionPerformed

    public void loadData() {
        // String ulv = userSession.getUserLevel();
        //System.out.println(ulv);
        // JOptionPane.showMessageDialog(null, "anda login sebgai " + ulv);
        textUserLevel.setText("Login sebagai " + ulv);
        textUserLevel.setEditable(false);

        if (ulv.equals("Project Manager")) {
            btnQA.setEnabled(true);
            btnHalamanReport.setEnabled(true);
        } else if (ulv.equals("Teknisi")) {
            btnQA.setEnabled(true);
            btnHalamanReport.setEnabled(false);
        } else if (ulv.equals("Head Division")) {
            btnQA.setEnabled(true);
            btnHalamanReport.setEnabled(true);
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard_ui.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftarProyek;
    private javax.swing.JButton btnHalamanReport;
    private javax.swing.JButton btnMaintenance;
    private javax.swing.JButton btnPicSre;
    private javax.swing.JButton btnQA;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTimeline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jdashboard;
    private javax.swing.JButton jhome;
    private javax.swing.JPanel jlabel1;
    private javax.swing.JTextField textUserLevel;
    // End of variables declaration//GEN-END:variables
}
