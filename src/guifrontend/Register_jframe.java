/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guifrontend;

import guibackend.Login;
import guibackend.Register;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class Register_jframe extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Register_jframe() {
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2,dim.height/2-this.getSize().height/2);//make jframe center

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEnterUsername = new javax.swing.JTextField();
        passtxtbox = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chkboxPass = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        registerbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        confirmpasstxtbox = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEnterUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtEnterUsername.setText("Enter Username");
        txtEnterUsername.setBorder(null);
        txtEnterUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEnterUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEnterUsernameFocusLost(evt);
            }
        });

        passtxtbox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        passtxtbox.setText("EnterPassword");
        passtxtbox.setBorder(null);
        passtxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passtxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passtxtboxFocusLost(evt);
            }
        });
        passtxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtboxActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Username");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Password");

        chkboxPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chkboxPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxPassActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Show Password");

        registerbtn.setText("Register Account");
        registerbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbtnActionPerformed(evt);
            }
        });

        backbtn.setText("Go Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        confirmpasstxtbox.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confirmpasstxtbox.setText("EnterPassword");
        confirmpasstxtbox.setBorder(null);
        confirmpasstxtbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                confirmpasstxtboxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                confirmpasstxtboxFocusLost(evt);
            }
        });
        confirmpasstxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasstxtboxActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Confirm Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                .addComponent(registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(confirmpasstxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEnterUsername)
                    .addComponent(passtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkboxPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEnterUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmpasstxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkboxPass)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnterUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterUsernameFocusGained
        // TODO add your handling code here:
        if("Enter Username".equals(txtEnterUsername.getText())){
            txtEnterUsername.setText("");
        }
    }//GEN-LAST:event_txtEnterUsernameFocusGained

    private void txtEnterUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEnterUsernameFocusLost
        // TODO add your handling code here:
        if(txtEnterUsername.getText().length()==0){
            txtEnterUsername.setText("Enter Username");
        }
    }//GEN-LAST:event_txtEnterUsernameFocusLost

    private void passtxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtxtboxFocusGained
        // TODO add your handling code here:
        if("EnterPassword".equals(String.valueOf(passtxtbox.getPassword()))){
            passtxtbox.setText("");
        }
    }//GEN-LAST:event_passtxtboxFocusGained

    private void passtxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passtxtboxFocusLost
        // TODO add your handling code here:
        if(passtxtbox.getPassword().length==0){
            passtxtbox.setText("EnterPassword");
        }
    }//GEN-LAST:event_passtxtboxFocusLost

    private void chkboxPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxPassActionPerformed
        // TODO add your handling code here:
        if (chkboxPass.isSelected()) {
            passtxtbox.setEchoChar((char)0);
            confirmpasstxtbox.setEchoChar((char)0);
        } else {
            passtxtbox.setEchoChar('*');
            confirmpasstxtbox.setEchoChar('*');
        }
    }//GEN-LAST:event_chkboxPassActionPerformed

    private void registerbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbtnActionPerformed
        try {
            // TODO add your handling code here:
            String username=txtEnterUsername.getText();
            String password=String.valueOf(passtxtbox.getPassword());
            String confirmpass=String.valueOf(confirmpasstxtbox.getPassword());
            if(!password.equals(confirmpass)){
                JOptionPane.showMessageDialog(null,"Passwords Different, Please re-enter");
            } else if (username.equals("")||password.equals("")||confirmpass.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter all inputs");
            }
            else if(new Register(username, password).registerAccount()){
                this.dispose();
                new Home_jframe(username).setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null,"Wrong Username or Password, Please re-enter");
            }
        } catch (Exception ex) {
            Logger.getLogger(Register_jframe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerbtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backbtnActionPerformed

    private void confirmpasstxtboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpasstxtboxFocusGained
        // TODO add your handling code here:
        if("EnterPassword".equals(String.valueOf(confirmpasstxtbox.getPassword()))){
            confirmpasstxtbox.setText("");
        }          
    }//GEN-LAST:event_confirmpasstxtboxFocusGained

    private void confirmpasstxtboxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_confirmpasstxtboxFocusLost
        // TODO add your handling code here:
        if(passtxtbox.getPassword().length==0){
            passtxtbox.setText("EnterPassword");
        }
    }//GEN-LAST:event_confirmpasstxtboxFocusLost

    private void confirmpasstxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasstxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasstxtboxActionPerformed

    private void passtxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtboxActionPerformed

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
            java.util.logging.Logger.getLogger(Register_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_jframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JCheckBox chkboxPass;
    private javax.swing.JPasswordField confirmpasstxtbox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField passtxtbox;
    private javax.swing.JButton registerbtn;
    private javax.swing.JTextField txtEnterUsername;
    // End of variables declaration//GEN-END:variables
}
