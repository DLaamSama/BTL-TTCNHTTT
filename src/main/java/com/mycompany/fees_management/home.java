/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.fees_management;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class home extends javax.swing.JFrame {

	/**
	 * Creates new form home
	 */
	public home() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jComboBox1 = new javax.swing.JComboBox<>();
                jPanel1 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jSeparator1 = new javax.swing.JSeparator();
                jPanel2 = new javax.swing.JPanel();
                btn_add_fess = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                btn_search_record = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                btn_edit_course = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jLabel8 = new javax.swing.JLabel();
                btn_view_record = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                btn_view_course = new javax.swing.JPanel();
                jLabel6 = new javax.swing.JLabel();
                btn_view_report = new javax.swing.JPanel();
                jLabel7 = new javax.swing.JLabel();
                btn_login = new javax.swing.JPanel();
                jLabel12 = new javax.swing.JLabel();
                btn_about = new javax.swing.JPanel();
                jLabel13 = new javax.swing.JLabel();

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(0, 102, 102));

                jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Hanoi Industrial University");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(350, 350, 350)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(292, 292, 292)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(251, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(8, 8, 8)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(41, Short.MAX_VALUE))
                );

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 120));

                jPanel2.setBackground(new java.awt.Color(0, 153, 153));

                btn_add_fess.setBackground(new java.awt.Color(0, 102, 102));
                btn_add_fess.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_add_fess.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_add_fessMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_add_fessMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_add_fessMouseExited(evt);
                        }
                });
                btn_add_fess.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plus.png"))); // NOI18N
                jLabel2.setText("     Add Fess");
                btn_add_fess.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                btn_search_record.setBackground(new java.awt.Color(0, 102, 102));
                btn_search_record.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_search_record.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_search_recordMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_search_recordMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_search_recordMouseExited(evt);
                        }
                });
                btn_search_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-document.png"))); // NOI18N
                jLabel3.setText("Search Record");
                btn_search_record.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 250, 150));

                btn_edit_course.setBackground(new java.awt.Color(0, 102, 102));
                btn_edit_course.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_edit_course.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_edit_courseMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_edit_courseMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_edit_courseMouseExited(evt);
                        }
                });
                btn_edit_course.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
                jLabel4.setText("Edit Course");
                btn_edit_course.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit.png"))); // NOI18N
                jLabel8.setText("Edit Course");
                btn_edit_course.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                btn_view_record.setBackground(new java.awt.Color(0, 102, 102));
                btn_view_record.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_view_record.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_view_recordMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_view_recordMouseExited(evt);
                        }
                });
                btn_view_record.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text-book-opened-from-top-view.png"))); // NOI18N
                jLabel5.setText("View Record");
                btn_view_record.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                btn_view_course.setBackground(new java.awt.Color(0, 102, 102));
                btn_view_course.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_view_course.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_view_courseMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_view_courseMouseExited(evt);
                        }
                });
                btn_view_course.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/text-book-opened-from-top-view.png"))); // NOI18N
                jLabel6.setText("View Course");
                btn_view_course.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                btn_view_report.setBackground(new java.awt.Color(0, 102, 102));
                btn_view_report.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_view_report.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_view_reportMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_view_reportMouseExited(evt);
                        }
                });
                btn_view_report.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view report.png"))); // NOI18N
                jLabel7.setText("View Report");
                btn_view_report.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 240, 150));

                btn_login.setBackground(new java.awt.Color(0, 102, 102));
                btn_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                btn_loginMouseClicked(evt);
                        }
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_loginMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_loginMouseExited(evt);
                        }
                });
                btn_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(255, 255, 255));
                jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.png"))); // NOI18N
                jLabel12.setText("Login");
                btn_login.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 70));

                btn_about.setBackground(new java.awt.Color(0, 102, 102));
                btn_about.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
                btn_about.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseEntered(java.awt.event.MouseEvent evt) {
                                btn_aboutMouseEntered(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                btn_aboutMouseExited(evt);
                        }
                });
                btn_about.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(255, 255, 255));
                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/about.png"))); // NOI18N
                jLabel13.setText("About");
                btn_about.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 120, 60));

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn_add_fess, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_search_record, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btn_edit_course, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_view_course, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_view_record, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_view_report, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 714, Short.MAX_VALUE)
                                .addComponent(btn_about, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn_search_record, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_add_fess, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_view_record, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_edit_course, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_view_course, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_view_report, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btn_login, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                        .addComponent(btn_about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(57, 57, 57))
                );

                getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1090, 640));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void btn_add_fessMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_fessMouseExited
	    Color clr = new Color(0, 102, 102);
	    btn_add_fess.setBackground(clr);
    }//GEN-LAST:event_btn_add_fessMouseExited

    private void btn_add_fessMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_fessMouseEntered
	    // TODO add your handling code here:
	    Color clr = new Color(0, 52, 52);
	    btn_add_fess.setBackground(clr);
    }//GEN-LAST:event_btn_add_fessMouseEntered

        private void btn_search_recordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_recordMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_search_record.setBackground(clr);
        }//GEN-LAST:event_btn_search_recordMouseEntered

        private void btn_search_recordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_recordMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_search_record.setBackground(clr);
        }//GEN-LAST:event_btn_search_recordMouseExited

        private void btn_edit_courseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_courseMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_edit_course.setBackground(clr);
        }//GEN-LAST:event_btn_edit_courseMouseEntered

        private void btn_edit_courseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_courseMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_edit_course.setBackground(clr);
        }//GEN-LAST:event_btn_edit_courseMouseExited

        private void btn_view_recordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_recordMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_view_record.setBackground(clr);
        }//GEN-LAST:event_btn_view_recordMouseEntered

        private void btn_view_recordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_recordMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_view_record.setBackground(clr);
        }//GEN-LAST:event_btn_view_recordMouseExited

        private void btn_view_courseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_courseMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_view_course.setBackground(clr);
        }//GEN-LAST:event_btn_view_courseMouseEntered

        private void btn_view_courseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_courseMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_view_course.setBackground(clr);
        }//GEN-LAST:event_btn_view_courseMouseExited

        private void btn_view_reportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_reportMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_view_report.setBackground(clr);
        }//GEN-LAST:event_btn_view_reportMouseEntered

        private void btn_view_reportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_view_reportMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_view_report.setBackground(clr);
        }//GEN-LAST:event_btn_view_reportMouseExited

        private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_login.setBackground(clr);
        }//GEN-LAST:event_btn_loginMouseEntered

        private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_login.setBackground(clr);
        }//GEN-LAST:event_btn_loginMouseExited

        private void btn_aboutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutMouseEntered
		// TODO add your handling code here:
		Color clr = new Color(0, 52, 52);
		btn_about.setBackground(clr);
        }//GEN-LAST:event_btn_aboutMouseEntered

        private void btn_aboutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_aboutMouseExited
		// TODO add your handling code here:
		Color clr = new Color(0, 102, 102);
		btn_about.setBackground(clr);
        }//GEN-LAST:event_btn_aboutMouseExited

        private void btn_add_fessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_add_fessMouseClicked
		Add_Fess add = null;
		try {
			add = new Add_Fess();
		} catch (Exception ex) {
			Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
		}
		add.setVisible(true);
		this.dispose();


        }//GEN-LAST:event_btn_add_fessMouseClicked

        private void btn_search_recordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_search_recordMouseClicked
		search_record search = new search_record();
		search.show();
		this.dispose();
        }//GEN-LAST:event_btn_search_recordMouseClicked

        private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
                // TODO add your handling code here:
		Login_page login =new Login_page();
		login.show();
		this.dispose();
        }//GEN-LAST:event_btn_loginMouseClicked

        private void btn_edit_courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_edit_courseMouseClicked
                // TODO add your handling code here:
		edit_sourse edit = new edit_sourse();
		edit.show();
		this.dispose();
        }//GEN-LAST:event_btn_edit_courseMouseClicked

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
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new home().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JPanel btn_about;
        private javax.swing.JPanel btn_add_fess;
        private javax.swing.JPanel btn_edit_course;
        private javax.swing.JPanel btn_login;
        private javax.swing.JPanel btn_search_record;
        private javax.swing.JPanel btn_view_course;
        private javax.swing.JPanel btn_view_record;
        private javax.swing.JPanel btn_view_report;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JSeparator jSeparator1;
        // End of variables declaration//GEN-END:variables
}
