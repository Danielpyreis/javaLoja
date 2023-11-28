/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tela;

import User.cadastroUser;
import javax.swing.JOptionPane;
import persistencia.controlaUser;

/**
 *
 * @author Daniel
 */
public class Login extends javax.swing.JFrame {

    private controlaUser modelo = new controlaUser();
    private cadastroTela telaCadastro;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        telaCadastro = new cadastroTela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        SenhaTex = new javax.swing.JPasswordField();
        Login = new javax.swing.JLabel();
        LoginEmail = new javax.swing.JTextField();
        Senha = new javax.swing.JLabel();
        SignIn = new javax.swing.JButton();
        SignUp = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SenhaTex.setText("jPasswordField1");

        Login.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Login.setText("Login:");
        Login.setName("Login"); // NOI18N

        LoginEmail.setFont(new java.awt.Font("Lucida Console", 2, 11)); // NOI18N
        LoginEmail.setText("user@gmail.com");
        LoginEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginEmailActionPerformed(evt);
            }
        });

        Senha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Senha.setText("Senha:");

        SignIn.setBackground(new java.awt.Color(0, 0, 0));
        SignIn.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        SignIn.setForeground(new java.awt.Color(102, 255, 255));
        SignIn.setText("Sign in");
        SignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignInActionPerformed(evt);
            }
        });

        SignUp.setBackground(new java.awt.Color(0, 0, 0));
        SignUp.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        SignUp.setForeground(new java.awt.Color(102, 255, 255));
        SignUp.setText("Sign up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaTex, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login)
                            .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(SignIn)
                        .addGap(18, 18, 18)
                        .addComponent(SignUp)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(Login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SenhaTex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignIn)
                    .addComponent(SignUp))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginEmailActionPerformed

    }//GEN-LAST:event_LoginEmailActionPerformed

    private void SignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignInActionPerformed
        String email = LoginEmail.getText();
        String senha = new String(SenhaTex.getPassword());

        if (modelo.verificarLogin(email, senha)) {
            JOptionPane.showMessageDialog(this, "Parabéns! Login bem-sucedido!");
        } else {
            JOptionPane.showMessageDialog(this, "Usuário não cadastrado. Faça o cadastro antes de fazer o login.");
        }
    }//GEN-LAST:event_SignInActionPerformed


    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JTextField LoginEmail;
    private javax.swing.JLabel Senha;
    private javax.swing.JPasswordField SenhaTex;
    private javax.swing.JButton SignIn;
    private javax.swing.JButton SignUp;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables

    private static class IClienteDAO {

        public IClienteDAO() {
        }
    }
}
