
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/room.png"))); // NOI18N
        jButton1.setText("Manage Room");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 249, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new student.png"))); // NOI18N
        jButton2.setText("New Student");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 249, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update & Delete Student.png"))); // NOI18N
        jButton3.setText("Update & Delete Students");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 249, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fees.png"))); // NOI18N
        jButton4.setText("Student Fees");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 249, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all student living.png"))); // NOI18N
        jButton5.setText("All Student Living");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 249, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Leaved students.png"))); // NOI18N
        jButton6.setText("Leaved Students");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 249, -1));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/new student.png"))); // NOI18N
        jButton7.setText("New Employee");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 249, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Update & Delete Student.png"))); // NOI18N
        jButton8.setText("Update & Delete Employee");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Fees.png"))); // NOI18N
        jButton9.setText("Employee Payment");
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 249, -1));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/all student living.png"))); // NOI18N
        jButton10.setText("All Employee Working");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 249, -1));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Leaved students.png"))); // NOI18N
        jButton11.setText("Leaved Employee");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 249, -1));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jButton12.setText("Logout");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Close.png"))); // NOI18N
        jButton15.setText("Exit");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, -1, -1));

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shut Down.png"))); // NOI18N
        jButton16.setText("Shut Down");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Slide2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        jButton1.setForeground(new JButton().getBackground());
        jButton1.setBackground(new JButton().getBackground());
        
         jButton2.setForeground(new JButton().getBackground());
        jButton2.setBackground(new JButton().getBackground());
        
         jButton3.setForeground(new JButton().getBackground());
        jButton3.setBackground(new JButton().getBackground());
        
        jButton4.setForeground(new JButton().getBackground());
        jButton4.setBackground(new JButton().getBackground());
        
        jButton5.setForeground(new JButton().getBackground());
        jButton5.setBackground(new JButton().getBackground());
        
        
        jButton6.setForeground(new JButton().getBackground());
        jButton6.setBackground(new JButton().getBackground());
        
         jButton7.setForeground(new JButton().getBackground());
        jButton7.setBackground(new JButton().getBackground());
        
         jButton8.setForeground(new JButton().getBackground());
        jButton8.setBackground(new JButton().getBackground());
        
         jButton9.setForeground(new JButton().getBackground());
        jButton9.setBackground(new JButton().getBackground());
        
         jButton10.setForeground(new JButton().getBackground());
        jButton10.setBackground(new JButton().getBackground());
        
        jButton11.setForeground(new JButton().getBackground());
        jButton11.setBackground(new JButton().getBackground());
        
        
    }//GEN-LAST:event_formWindowGainedFocus
     
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null," Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null," Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           System.exit(0);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null," Do you really want to Logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
           Runtime runtime=Runtime.getRuntime();
           try{
               Process proc=runtime.exec("shutdown -s -t 0");
           }
           catch(Exception e)
           {
           JOptionPane.showMessageDialog(null, e);
           }
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jButton1.setForeground(Color.red);
        jButton1.setBackground(new Color(255,255,255));
        new MangRoom().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jButton2.setForeground(Color.red);
        jButton2.setBackground(new Color(255,255,255));
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
