/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

/**
 *
 * @author merarimaysosa
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form wallpaper_inicio
     */
    public Inicio() {
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

        panel = new javax.swing.JPanel();
        botones = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        iniciar_login = new javax.swing.JButton();
        logo = new javax.swing.JPanel();
        logo_greece = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botones.setBackground(new java.awt.Color(255, 255, 255));

        cerrar.setBackground(new java.awt.Color(204, 204, 255));
        cerrar.setText("Salir");
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        botones.add(cerrar);

        iniciar_login.setBackground(new java.awt.Color(204, 204, 255));
        iniciar_login.setText("Entrar");
        iniciar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciar_loginActionPerformed(evt);
            }
        });
        botones.add(iniciar_login);

        panel.add(botones, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 220, -1));

        logo.setBackground(new java.awt.Color(255, 255, 255));
        logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo_greece.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_greece.jpg"))); // NOI18N
        logo_greece.setText("jLabel1");
        logo.add(logo_greece, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 290, 90));

        panel.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 170));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrarActionPerformed

    private void iniciar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciar_loginActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_iniciar_loginActionPerformed

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
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Inicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton iniciar_login;
    private javax.swing.JPanel logo;
    private javax.swing.JLabel logo_greece;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
