package Interfaz;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Visita: https://Yolo-mavster.blogspot.com
 * @author Mavster
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        super.setTitle("Acceso Sistema");
         setLocationRelativeTo(null);
         
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btn_rojo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
        btn_verde = new javax.swing.JLabel();
        btn_amarillo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/elegante-formulario-iniciar-sesion_23-2147721241.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setFont(new java.awt.Font("Calibri Light", 1, 20)); // NOI18N
        txtUser.setForeground(java.awt.Color.gray);
        txtUser.setText("UserName");
        txtUser.setBorder(null);
        txtUser.setOpaque(false);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 270, 50));

        txtPass.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        txtPass.setForeground(java.awt.Color.gray);
        txtPass.setText("123456789");
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassMouseClicked(evt);
            }
        });
        getContentPane().add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 260, 50));

        btnLogin.setBackground(new java.awt.Color(102, 102, 102));
        btnLogin.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 180, 60));

        btn_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/rojo_1.png"))); // NOI18N
        btn_rojo.setToolTipText("");
        btn_rojo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_rojoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_rojoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_rojoMouseExited(evt);
            }
        });
        getContentPane().add(btn_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/jav fac.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 200, 190));

        btn_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/verde.png"))); // NOI18N
        btn_verde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_verdeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_verdeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_verdeMouseExited(evt);
            }
        });
        getContentPane().add(btn_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 40, 40));

        btn_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Amarillo.png"))); // NOI18N
        btn_amarillo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_amarilloMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_amarilloMouseExited(evt);
            }
        });
        getContentPane().add(btn_amarillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 40, 40));

        Fondo.setFont(new java.awt.Font("Calibri Light", 0, 20)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/elegante-formulario-iniciar-sesion_23-2147721241.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
       txtUser.setText("");
    }//GEN-LAST:event_txtUserMouseClicked

    private void txtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMouseClicked
        txtPass.setText("");
    }//GEN-LAST:event_txtPassMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        
        Principal principal=new Principal();
        principal.setExtendedState(MAXIMIZED_BOTH);
       principal.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btn_rojoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rojoMouseClicked
         // TODO add your handling code here:
        System.exit(0);        
    }//GEN-LAST:event_btn_rojoMouseClicked

    private void btn_rojoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rojoMouseEntered
        btn_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/rojoA_1.png")));
    }//GEN-LAST:event_btn_rojoMouseEntered

    private void btn_rojoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_rojoMouseExited
        // TODO add your handling code here:
        btn_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/rojo_1.png")));
    }//GEN-LAST:event_btn_rojoMouseExited

    private void btn_verdeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verdeMouseEntered
        // TODO add your handling code here:
       btn_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/verdeA.png")));
    }//GEN-LAST:event_btn_verdeMouseEntered

    private void btn_verdeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verdeMouseExited
        // TODO add your handling code here:
       btn_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/verde.png")));
    }//GEN-LAST:event_btn_verdeMouseExited

    private void btn_verdeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_verdeMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_verdeMouseClicked

    private void btn_amarilloMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_amarilloMouseEntered
        // TODO add your handling code here:
        btn_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/AmarilloA.png")));
    }//GEN-LAST:event_btn_amarilloMouseEntered

    private void btn_amarilloMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_amarilloMouseExited
        // TODO add your handling code here:
         btn_amarillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/Amarillo.png")));
    }//GEN-LAST:event_btn_amarilloMouseExited

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Login in = new Login();
        in.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btn_amarillo;
    private javax.swing.JLabel btn_rojo;
    private javax.swing.JLabel btn_verde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
