package login;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class loginFram extends javax.swing.JFrame {

    public loginFram() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        loginText = new javax.swing.JLabel();
        usernameText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        jpassword = new javax.swing.JPasswordField();
        blogin = new javax.swing.JButton();
        jCshowPass = new javax.swing.JCheckBox();

        jLabel1.setText("jLabel1");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginText.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        loginText.setText("LOGIN APPLICATION");

        usernameText.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        usernameText.setText("USERNAME");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setText("PASSWORD");

        blogin.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });

        jCshowPass.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jCshowPass.setText("Show Password");
        jCshowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCshowPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(blogin)
                    .addComponent(jCshowPass)
                    .addComponent(loginText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(jpassword))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginText)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameText)
                    .addComponent(jtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCshowPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(blogin)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
          // TODO add your handling code here:
    	String user = jtuser.getText();
    	String pass = new String(jpassword.getPassword());
          if (user.equals("") && pass.equals("")){
              JOptionPane.showMessageDialog(null, "Please fill username and password");
          }else if(user.equals("")){
              JOptionPane.showMessageDialog(null, "Please fill username ");
          }else if(pass.equals("")){
              JOptionPane.showMessageDialog(null, "Please fill password");
          }else if(user.contains("admin") && pass.equals("1234")){
              JOptionPane.showMessageDialog(null, "Login Successful");
              fillPage FP = new fillPage();
              FP.setVisible(true);
              dispose();//close login page when fillpage show
          }else{
              JOptionPane.showMessageDialog(null, "Username or Password WSrong!!!","Message",JOptionPane.ERROR_MESSAGE);
          }
    }//GEN-LAST:event_bloginActionPerformed

    private void jCshowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCshowPassActionPerformed
        // TODO add your handling code here:
        if(jCshowPass.isSelected()){
            jpassword.setEchoChar((char)0);
        }else{
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jCshowPassActionPerformed

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
            java.util.logging.Logger.getLogger(loginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blogin;
    private javax.swing.JCheckBox jCshowPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel usernameText;
    // End of variables declaration//GEN-END:variables
}