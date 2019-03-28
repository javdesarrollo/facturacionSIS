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
         btn_amari_activo.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btn_rojo = new javax.swing.JLabel();
        btn_rojo_activo = new javax.swing.JLabel();
        btn_verde = new javax.swing.JLabel();
        btn_verde_activo = new javax.swing.JLabel();
        btn_amari = new javax.swing.JLabel();
        btn_amari_activo = new javax.swing.JLabel();
        Logo = new javax.swing.JLabel();
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

        btn_rojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_ext.png"))); // NOI18N
        getContentPane().add(btn_rojo, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        btn_rojo_activo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_ext_activo.png"))); // NOI18N
        btn_rojo_activo.setEnabled(false);
        getContentPane().add(btn_rojo_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        btn_verde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_max.png"))); // NOI18N
        getContentPane().add(btn_verde, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        btn_verde_activo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_max.png"))); // NOI18N
        getContentPane().add(btn_verde_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, -1, -1));

        btn_amari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_mini.png"))); // NOI18N
        getContentPane().add(btn_amari, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

        btn_amari_activo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/btn_mini_activo.png"))); // NOI18N
        btn_amari_activo.setEnabled(false);
        getContentPane().add(btn_amari_activo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Multimedia/jav fac.png"))); // NOI18N
        getContentPane().add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 200, 190));

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

    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        Login in = new Login();
        in.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btn_amari;
    private javax.swing.JLabel btn_amari_activo;
    private javax.swing.JLabel btn_rojo;
    private javax.swing.JLabel btn_rojo_activo;
    private javax.swing.JLabel btn_verde;
    private javax.swing.JLabel btn_verde_activo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
