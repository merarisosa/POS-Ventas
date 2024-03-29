/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControlRolUsuario;
import controlador.ControlUsuario;
import java.awt.Dialog.ModalityType;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author merarimaysosa
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Ventana_Login
     */
    public Login() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_grid = new javax.swing.JPanel();
        logo = new javax.swing.JPanel();
        logo_greece = new javax.swing.JLabel();
        data_login = new javax.swing.JPanel();
        leyenda = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        pwd = new javax.swing.JLabel();
        re_user = new javax.swing.JTextField();
        re_pwd = new javax.swing.JPasswordField();
        botones = new javax.swing.JPanel();
        iniciar_sesion = new javax.swing.JButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_grid.setBackground(new java.awt.Color(255, 255, 255));
        panel_grid.setLayout(new java.awt.GridLayout(3, 1));

        logo.setBackground(new java.awt.Color(255, 255, 255));

        logo_greece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_greece.jpg"))); // NOI18N

        javax.swing.GroupLayout logoLayout = new javax.swing.GroupLayout(logo);
        logo.setLayout(logoLayout);
        logoLayout.setHorizontalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(logo_greece, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        logoLayout.setVerticalGroup(
            logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, logoLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(logo_greece, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_grid.add(logo);

        data_login.setBackground(new java.awt.Color(255, 255, 255));

        leyenda.setFont(new java.awt.Font("Cute Cartoon", 1, 48)); // NOI18N
        leyenda.setText("Bienvenido al sistema");

        user.setText("Usuario:");

        pwd.setText("Contraseña:");

        javax.swing.GroupLayout data_loginLayout = new javax.swing.GroupLayout(data_login);
        data_login.setLayout(data_loginLayout);
        data_loginLayout.setHorizontalGroup(
            data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_loginLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(data_loginLayout.createSequentialGroup()
                        .addGroup(data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pwd)
                            .addComponent(user))
                        .addGap(18, 18, 18)
                        .addGroup(data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(re_user)
                            .addComponent(re_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(leyenda))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        data_loginLayout.setVerticalGroup(
            data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_loginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leyenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(user)
                    .addComponent(re_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwd)
                    .addComponent(re_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_grid.add(data_login);

        botones.setBackground(new java.awt.Color(255, 255, 255));

        iniciar_sesion.setText("Iniciar sesión");
        iniciar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_sesionActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(regresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(iniciar_sesion)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        botonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {iniciar_sesion, regresar});

        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regresar)
                    .addComponent(iniciar_sesion))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        panel_grid.add(botones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_grid, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_grid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Inicio wallpaper_inicio = new Inicio();
        this.setVisible(false);
        wallpaper_inicio.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void iniciar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_sesionActionPerformed
        // TODO add your handling code here:
        String nombre = this.re_user.getText();
        String pwdUsu = new String(this.re_pwd.getPassword());
        ControlUsuario controlUsu = new ControlUsuario();
        Usuario usuario = controlUsu.consultar(nombre, pwdUsu);
        if(controlUsu.login(usuario)){
          ControlRolUsuario controlRol = new ControlRolUsuario();
          controlRol.accesoPorRol(usuario, this);
        }else{
          JOptionPane.showMessageDialog(this, "No existe el usuario, verifique sus datos.", "ERROR", 
                  JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_iniciar_sesionActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JPanel data_login;
    private javax.swing.JButton iniciar_sesion;
    private javax.swing.JLabel leyenda;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logo_greece;
    private javax.swing.JPanel panel_grid;
    private javax.swing.JLabel pwd;
    private javax.swing.JPasswordField re_pwd;
    private javax.swing.JTextField re_user;
    private javax.swing.JButton regresar;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
