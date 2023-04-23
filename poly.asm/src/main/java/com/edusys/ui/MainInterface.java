/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.edusys.ui;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author nongn
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        init();
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
        lbltitle = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        lblBanner = new javax.swing.JLabel();
        lblfooter = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnLogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnThematic = new javax.swing.JButton();
        btnCourse = new javax.swing.JButton();
        btnLearner = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnGuide = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSystem = new javax.swing.JMenu();
        mniChangeyourpassword = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniLogout = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniExit = new javax.swing.JMenuItem();
        mnuThematic = new javax.swing.JMenu();
        mniThematic = new javax.swing.JMenuItem();
        mniCourse = new javax.swing.JMenuItem();
        mniLearner = new javax.swing.JMenuItem();
        mniStudent = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mniStaff = new javax.swing.JMenuItem();
        mnuStatistical = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mniProductIntroduction = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniGuide = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Training management system");
        setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        setForeground(new java.awt.Color(0, 51, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbltitle.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        lbltitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/exclamation-14-32.png"))); // NOI18N
        lbltitle.setText("Training management system");
        lbltitle.setToolTipText("");

        lblClock.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/clock-147-32.png"))); // NOI18N
        lblClock.setText("Clock");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClock))
                .addContainerGap())
        );

        lblBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/banner.jpg"))); // NOI18N

        lblfooter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/footer.png"))); // NOI18N

        jToolBar1.setRollover(true);

        btnLogout.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 102, 0));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/logout.png"))); // NOI18N
        btnLogout.setText("Log Out");
        btnLogout.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        btnExit.setBackground(new java.awt.Color(255, 0, 51));
        btnExit.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/power-off.png"))); // NOI18N
        btnExit.setFocusable(false);
        btnExit.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnExit.setMaximumSize(new java.awt.Dimension(119, 76));
        btnExit.setMinimumSize(new java.awt.Dimension(119, 76));
        btnExit.setPreferredSize(new java.awt.Dimension(119, 76));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExit);

        btnThematic.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnThematic.setForeground(new java.awt.Color(255, 102, 0));
        btnThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/Thematic.png"))); // NOI18N
        btnThematic.setText("Thematic");
        btnThematic.setFocusable(false);
        btnThematic.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThematicActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThematic);

        btnCourse.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnCourse.setForeground(new java.awt.Color(255, 102, 0));
        btnCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/course.png"))); // NOI18N
        btnCourse.setText("Course");
        btnCourse.setFocusable(false);
        btnCourse.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCourse);

        btnLearner.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnLearner.setForeground(new java.awt.Color(255, 102, 0));
        btnLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/learner.png"))); // NOI18N
        btnLearner.setText("Learner");
        btnLearner.setFocusable(false);
        btnLearner.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLearnerActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLearner);

        btnStudent.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnStudent.setForeground(new java.awt.Color(255, 102, 0));
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/student.png"))); // NOI18N
        btnStudent.setText("Student");
        btnStudent.setFocusable(false);
        btnStudent.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        jToolBar1.add(btnStudent);

        btnGuide.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnGuide.setForeground(new java.awt.Color(255, 102, 0));
        btnGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/UserManual.png"))); // NOI18N
        btnGuide.setText("Guide");
        btnGuide.setFocusable(false);
        btnGuide.setMargin(new java.awt.Insets(10, 34, 10, 34));
        btnGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuideActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGuide);

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 102, 0));
        jMenuBar1.setMargin(new java.awt.Insets(5, 20, 5, 20));

        mnuSystem.setText("System");
        mnuSystem.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        mnuSystem.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniChangeyourpassword.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniChangeyourpassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/change.png"))); // NOI18N
        mniChangeyourpassword.setText("Change Your Password");
        mniChangeyourpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChangeyourpasswordActionPerformed(evt);
            }
        });
        mnuSystem.add(mniChangeyourpassword);
        mnuSystem.add(jSeparator1);

        mniLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLogout.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/logout.png"))); // NOI18N
        mniLogout.setText("Log Out");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnuSystem.add(mniLogout);
        mnuSystem.add(jSeparator2);

        mniExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniExit.setBackground(new java.awt.Color(255, 0, 51));
        mniExit.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniExit.setForeground(new java.awt.Color(255, 0, 51));
        mniExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/power-off.png"))); // NOI18N
        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuSystem.add(mniExit);

        jMenuBar1.add(mnuSystem);

        mnuThematic.setText("Thematic");
        mnuThematic.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        mnuThematic.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniThematic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniThematic.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniThematic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/Thematic.png"))); // NOI18N
        mniThematic.setText("Thematic");
        mniThematic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThematicActionPerformed(evt);
            }
        });
        mnuThematic.add(mniThematic);

        mniCourse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCourse.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/course.png"))); // NOI18N
        mniCourse.setText("Course");
        mniCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCourseActionPerformed(evt);
            }
        });
        mnuThematic.add(mniCourse);

        mniLearner.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniLearner.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniLearner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/learner.png"))); // NOI18N
        mniLearner.setText("Learner");
        mniLearner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLearnerActionPerformed(evt);
            }
        });
        mnuThematic.add(mniLearner);

        mniStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniStudent.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/student.png"))); // NOI18N
        mniStudent.setText("Student");
        mniStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStudentActionPerformed(evt);
            }
        });
        mnuThematic.add(mniStudent);
        mnuThematic.add(jSeparator3);

        mniStaff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniStaff.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/Staff.png"))); // NOI18N
        mniStaff.setText("Staff");
        mniStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniStaffActionPerformed(evt);
            }
        });
        mnuThematic.add(mniStaff);

        jMenuBar1.add(mnuThematic);

        mnuStatistical.setText("Statistical");
        mnuStatistical.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        mnuStatistical.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/Transcript.png"))); // NOI18N
        jMenuItem9.setText("Transcript");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        mnuStatistical.add(jMenuItem9);
        mnuStatistical.add(jSeparator4);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/number of learners.png"))); // NOI18N
        jMenuItem10.setText("Number Of Learners");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        mnuStatistical.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/Thematic Point.png"))); // NOI18N
        jMenuItem11.setText("Thematic Point");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        mnuStatistical.add(jMenuItem11);

        jMenuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/turnover.png"))); // NOI18N
        jMenuItem12.setText("Revenue");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        mnuStatistical.add(jMenuItem12);

        jMenuBar1.add(mnuStatistical);

        mnuHelp.setText(" Help");
        mnuHelp.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        mnuHelp.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniProductIntroduction.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniProductIntroduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/product-introduction-48.png"))); // NOI18N
        mniProductIntroduction.setText("Product Introduction");
        mniProductIntroduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniProductIntroductionActionPerformed(evt);
            }
        });
        mnuHelp.add(mniProductIntroduction);
        mnuHelp.add(jSeparator5);

        mniGuide.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mniGuide.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        mniGuide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/image/UserManual.png"))); // NOI18N
        mniGuide.setText(" User Manual");
        mniGuide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuideActionPerformed(evt);
            }
        });
        mnuHelp.add(mniGuide);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBanner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblfooter, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBanner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblfooter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniChangeyourpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChangeyourpasswordActionPerformed
        openChangePassword();
    }//GEN-LAST:event_mniChangeyourpasswordActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        openLogOut();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        openLogOut();
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        exit();
    }//GEN-LAST:event_mniExitActionPerformed

    private void mniGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuideActionPerformed
        openGuide();
    }//GEN-LAST:event_mniGuideActionPerformed

    private void btnGuideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuideActionPerformed
         openGuide();
    }//GEN-LAST:event_btnGuideActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        openStatustical(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        openStatustical(1);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        openStatustical(2);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        openStatustical(3);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void mniThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThematicActionPerformed
        openThematic();
    }//GEN-LAST:event_mniThematicActionPerformed

    private void btnThematicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThematicActionPerformed
        openThematic();
    }//GEN-LAST:event_btnThematicActionPerformed

    private void mniCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCourseActionPerformed
        openCourse();
    }//GEN-LAST:event_mniCourseActionPerformed

    private void btnCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseActionPerformed
        openCourse();
    }//GEN-LAST:event_btnCourseActionPerformed

    private void mniLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLearnerActionPerformed
        openLearner();
    }//GEN-LAST:event_mniLearnerActionPerformed

    private void btnLearnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLearnerActionPerformed
        openLearner();
    }//GEN-LAST:event_btnLearnerActionPerformed

    private void mniStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStudentActionPerformed
        openStudent();
    }//GEN-LAST:event_mniStudentActionPerformed

    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        openStudent();
    }//GEN-LAST:event_btnStudentActionPerformed

    private void mniStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniStaffActionPerformed
        openStaff();
    }//GEN-LAST:event_mniStaffActionPerformed

    private void mniProductIntroductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniProductIntroductionActionPerformed
        if(Auth.isLogin()){
            
            new ProductIntroductionPerformed(this, true).setVisible(true);
            
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    }//GEN-LAST:event_mniProductIntroductionActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourse;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuide;
    private javax.swing.JButton btnLearner;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnThematic;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblfooter;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JMenuItem mniChangeyourpassword;
    private javax.swing.JMenuItem mniCourse;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniGuide;
    private javax.swing.JMenuItem mniLearner;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JMenuItem mniProductIntroduction;
    private javax.swing.JMenuItem mniStaff;
    private javax.swing.JMenuItem mniStudent;
    private javax.swing.JMenuItem mniThematic;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenu mnuStatistical;
    private javax.swing.JMenu mnuSystem;
    private javax.swing.JMenu mnuThematic;
    // End of variables declaration//GEN-END:variables

    private void init() {
       this.setLocationRelativeTo(null);
       this.setIconImage(XImage.getAppIcon());
       new Helloscreen(this, true).setVisible(true);
       new LoginWindow(this, true).setVisible(true);
        new Timer(10,new ActionListener() {//hàm Timer cứ 10ms chạy 1%
            @Override
            public void actionPerformed(ActionEvent e) {
             Date now = new Date();//lấy thời gian hệ thống.
             //định dạng sang chuỗi hh:mm:ss a
                SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
                String text = dateFormat.format(now);
                lblClock.setText(text);
             
            }
        }).start();
    }
    void openChangePassword(){
        if(Auth.isLogin()){
        new ChangePasswordJDialog(this, true).setVisible(true);
        }
        else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    
    };
    void openLogOut(){
        Auth.clear();
        new LoginWindow(this, true).setVisible(true);
    };
    void exit(){
        if(MsgBox.confirm(this, "Do you want to exit the application?")){
            System.exit(0);
            
        }
    };
    void openThematic(){
         if(Auth.isLogin()){
            new ManageThematic(this, true).setVisible(true);
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    };
    void openCourse(){
         if(Auth.isLogin()){
            new ManageCourse(this, true).setVisible(true);
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    };
    void openLearner(){
        if(Auth.isLogin()){
            new ManageLearner(this, true).setVisible(true);
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    };
    void openStudent(){
        if(Auth.isLogin()){
            new ManageStudent(this, true).setVisible(true);
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    };
    void openStaff(){
        if(Auth.isLogin()){
            new ManageStaff(this, true).setVisible(true);
        }else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
        
    };
    void openGuide(){
        try {
            Desktop.getDesktop().browse(new File("logos\\index1004.html").toURI());
        } catch (Exception e) {
            MsgBox.alert(this, "khong tim thay");
        }
    };
    void openIntroduce(){};
    void openStatustical(int index){
        if(Auth.isLogin()){
            if(index == 3 && !Auth.isManager()){
                MsgBox.alert(this, "You do not have permission to view the revenue");
            }else{
               StatisticalSynthesis ss = new StatisticalSynthesis(this, true);
               ss.selectTab(index);
               ss.setVisible(true);
               
            }
        }
        else{
            MsgBox.alert(this,MsgBox.msgLogin);
        }
    };
    
}