/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControlCategoria;
import controlador.ControlProducto;
import controlador.ControlProveedor;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Producto;
import modelo.Proveedor;
import utils.Util;

/**
 *
 * @author merarimaysosa
 */
public class Admin_Inventario extends javax.swing.JFrame {
  
  private List<Categoria> categorias;
  private List<Proveedor> proveedores;
  private List<Producto> productos;
  private JFrame anterior;

    /**
     * Creates new form Admin_Usuarios
   * @param anterior
     */
    public Admin_Inventario(JFrame anterior) {
        initComponents();
        this.anterior = anterior;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Categoria
        ControlCategoria categoria = new ControlCategoria();
        categorias = categoria.listarTodos();
        this.jTable1.setModel(categoria.getTableModel(categorias));
        
        //Proveedor
        ControlProveedor proveedor = new ControlProveedor();
        proveedores = proveedor.listarTodos();
        this.jTable2.setModel(proveedor.getTableModel(proveedores));
        
        //Producto
        ControlProducto producto = new ControlProducto();
        productos = producto.listarTodos();
        this.jTable3.setModel(producto.getTableModel(productos));
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
    jButton1 = new javax.swing.JButton();
    actualizar = new javax.swing.JButton();
    agregar = new javax.swing.JButton();
    eliminar = new javax.swing.JButton();
    regresar = new javax.swing.JButton();
    busq = new javax.swing.JTextField();
    title = new javax.swing.JLabel();
    panel_table = new javax.swing.JPanel();
    pestañas_grupo = new javax.swing.JTabbedPane();
    panel_categ = new javax.swing.JPanel();
    tabla_categ = new javax.swing.JScrollPane();
    jTable1 = new javax.swing.JTable();
    panel_prov = new javax.swing.JPanel();
    tabla_prov = new javax.swing.JScrollPane();
    jTable2 = new javax.swing.JTable();
    panel_prod = new javax.swing.JPanel();
    tabla_prod = new javax.swing.JScrollPane();
    jTable3 = new javax.swing.JTable();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    panel.setBackground(new java.awt.Color(255, 255, 255));

    botones.setBackground(new java.awt.Color(204, 204, 255));
    botones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    actualizar.setText("Actualizar");
    actualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        actualizarActionPerformed(evt);
      }
    });

    agregar.setText("Agregar");
    agregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        agregarActionPerformed(evt);
      }
    });

    eliminar.setText("Eliminar");
    eliminar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        eliminarActionPerformed(evt);
      }
    });

    regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/return.png"))); // NOI18N
    regresar.setBorder(null);
    regresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        regresarActionPerformed(evt);
      }
    });

    busq.setText("Buscar");
    busq.setToolTipText("");

    title.setFont(new java.awt.Font("Cute Cartoon", 1, 48)); // NOI18N
    title.setText("Administración de Inventarios");

    javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
    botones.setLayout(botonesLayout);
    botonesLayout.setHorizontalGroup(
      botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(botonesLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
            .addComponent(title)
            .addGap(58, 58, 58)
            .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
            .addComponent(busq, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(actualizar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(agregar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(eliminar)
            .addGap(32, 32, 32))))
    );

    botonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {actualizar, agregar, eliminar});

    botonesLayout.setVerticalGroup(
      botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonesLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(title)
          .addGroup(botonesLayout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addComponent(regresar)))
        .addGap(18, 18, 18)
        .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(actualizar)
            .addComponent(agregar)
            .addComponent(eliminar)
            .addComponent(busq, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(15, 15, 15))
    );

    busq.getAccessibleContext().setAccessibleDescription("Buscar");

    panel_table.setBackground(new java.awt.Color(255, 255, 255));

    jTable1.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tabla_categ.setViewportView(jTable1);

    javax.swing.GroupLayout panel_categLayout = new javax.swing.GroupLayout(panel_categ);
    panel_categ.setLayout(panel_categLayout);
    panel_categLayout.setHorizontalGroup(
      panel_categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 669, Short.MAX_VALUE)
      .addGroup(panel_categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_categLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_categ, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
          .addContainerGap()))
    );
    panel_categLayout.setVerticalGroup(
      panel_categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 322, Short.MAX_VALUE)
      .addGroup(panel_categLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_categLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_categ, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
          .addContainerGap()))
    );

    pestañas_grupo.addTab("Categoria", panel_categ);

    jTable2.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tabla_prov.setViewportView(jTable2);

    javax.swing.GroupLayout panel_provLayout = new javax.swing.GroupLayout(panel_prov);
    panel_prov.setLayout(panel_provLayout);
    panel_provLayout.setHorizontalGroup(
      panel_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 669, Short.MAX_VALUE)
      .addGroup(panel_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_provLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_prov, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
          .addContainerGap()))
    );
    panel_provLayout.setVerticalGroup(
      panel_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 322, Short.MAX_VALUE)
      .addGroup(panel_provLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_provLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_prov, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
          .addContainerGap()))
    );

    pestañas_grupo.addTab("Proveedor", panel_prov);

    jTable3.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    tabla_prod.setViewportView(jTable3);

    javax.swing.GroupLayout panel_prodLayout = new javax.swing.GroupLayout(panel_prod);
    panel_prod.setLayout(panel_prodLayout);
    panel_prodLayout.setHorizontalGroup(
      panel_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 669, Short.MAX_VALUE)
      .addGroup(panel_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_prodLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
          .addContainerGap()))
    );
    panel_prodLayout.setVerticalGroup(
      panel_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 322, Short.MAX_VALUE)
      .addGroup(panel_prodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panel_prodLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tabla_prod, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
          .addContainerGap()))
    );

    pestañas_grupo.addTab("Producto", panel_prod);

    javax.swing.GroupLayout panel_tableLayout = new javax.swing.GroupLayout(panel_table);
    panel_table.setLayout(panel_tableLayout);
    panel_tableLayout.setHorizontalGroup(
      panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_tableLayout.createSequentialGroup()
        .addGap(27, 27, 27)
        .addComponent(pestañas_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(28, Short.MAX_VALUE))
    );
    panel_tableLayout.setVerticalGroup(
      panel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panel_tableLayout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(pestañas_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(36, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
    panel.setLayout(panelLayout);
    panelLayout.setHorizontalGroup(
      panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addComponent(panel_table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    panelLayout.setVerticalGroup(
      panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelLayout.createSequentialGroup()
        .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(panel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(145, 145, 145))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int indexTab = this.pestañas_grupo.getSelectedIndex();
        switch(indexTab){
        case 0:
          String match1 = this.busq.getText().trim();
          List<Categoria> busqueda1 = new LinkedList<>(this.categorias.stream()
                  .filter(cat -> cat.getNombre().contains(match1))
                  .toList());
          ControlCategoria categoria = new ControlCategoria();
          Util.renderizarTabla(jTable1, this, busq, categorias, busqueda1, match1, categoria);
          break;
        case 1:
          String match2 = this.busq.getText().trim();
          List<Proveedor> busqueda2 = new LinkedList<>(this.proveedores.stream()
                  .filter(prov -> prov.getNombre().contains(match2))
                  .toList());
          ControlProveedor proveedor = new ControlProveedor();
          Util.renderizarTabla(jTable2, this, busq, proveedores, busqueda2, match2, proveedor);
          break;
        case 2:
          String match3 = this.busq.getText().trim();
          List<Producto> busqueda3 = new LinkedList<>(this.productos.stream()
                  .filter(prod -> prod.getNombre().contains(match3))
                  .toList());
          ControlProducto producto = new ControlProducto();
          Util.renderizarTabla(jTable3, this, busq, productos, busqueda3, match3, producto);
          break;
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        anterior.setVisible(true);
    }//GEN-LAST:event_regresarActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        int indexTab = this.pestañas_grupo.getSelectedIndex();
        switch(indexTab){
          case 0:
            Inventario_Agregar_Categoria categoria = new Inventario_Agregar_Categoria(this);
            this.setVisible(false);
            categoria.setVisible(true);
            break;
          case 1:
            Inventario_Agregar_Proveedor proveedor = new Inventario_Agregar_Proveedor(this);
            this.setVisible(false);
            proveedor.setVisible(true);
            break;
          case 2:
            Inventario_Agregar_Producto producto = new Inventario_Agregar_Producto(this);
            this.setVisible(false);
            producto.setVisible(true);
            break;
        }
    }//GEN-LAST:event_agregarActionPerformed

  private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
    // TODO add your handling code here:
    int indexTab = this.pestañas_grupo.getSelectedIndex();
    switch(indexTab){
      case 0:
        Util.eliminarRegistro(this.jTable1, new ControlCategoria(), this);
        break;
      case 1:
        Util.eliminarRegistro(this.jTable2, new ControlProveedor(), this);
        break;
      case 2:
        Util.eliminarRegistro(this.jTable3, new ControlProducto(), this);
        break;
    }
  }//GEN-LAST:event_eliminarActionPerformed

  private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
    // TODO add your handling code here:}
    int indexTab = this.pestañas_grupo.getSelectedIndex();
    switch(indexTab){
      case 0:
        int filaSeleccionada1 = this.jTable1.getSelectedRow();
        if (filaSeleccionada1 == -1) {
          JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operación",
            "Upsi!", JOptionPane.WARNING_MESSAGE);
        } else {
          String folioCat = this.jTable1.getValueAt(filaSeleccionada1, 0).toString();
          String nombreCat = this.jTable1.getValueAt(filaSeleccionada1, 1).toString();
          String descrip = this.jTable1.getValueAt(filaSeleccionada1, 2).toString();

          Categoria cat = new Categoria(folioCat, nombreCat, descrip);
          ControlCategoria categoria = new ControlCategoria();
          if (categoria.actualizar(cat)) {
            JOptionPane.showMessageDialog(this, "Categoria actualizada con éxito",
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
          } else {
            JOptionPane.showMessageDialog(this, "Algo salió mal, intente más tarde",
              "Oh no!", JOptionPane.ERROR_MESSAGE);
          }
        }
        break;
      case 1:
        int filaSeleccionada2 = this.jTable2.getSelectedRow();
        if (filaSeleccionada2 == -1) {
          JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operación",
            "Upsi!", JOptionPane.WARNING_MESSAGE);
        } else {
          String rfc = this.jTable2.getValueAt(filaSeleccionada2, 0).toString();
          String nombreProv = this.jTable2.getValueAt(filaSeleccionada2, 1).toString();
          String contactoNombre = this.jTable2.getValueAt(filaSeleccionada2, 2).toString();
          String contactoDesc = this.jTable2.getValueAt(filaSeleccionada2, 3).toString();
          String telefono = this.jTable2.getValueAt(filaSeleccionada2, 4).toString();
          String correo = this.jTable2.getValueAt(filaSeleccionada2, 5).toString();
          Proveedor prov = new Proveedor(rfc,nombreProv,contactoNombre,contactoDesc,correo,telefono);
          ControlProveedor proveedor = new ControlProveedor();
          if (proveedor.actualizar(prov)) {
            JOptionPane.showMessageDialog(this, "Proveedor actualizado con éxito",
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
          } else {
            JOptionPane.showMessageDialog(this, "Algo salió mal, intente más tarde",
              "Oh no!", JOptionPane.ERROR_MESSAGE);
          }
        }
        break;
      case 2:
        int filaSeleccionada3 = this.jTable3.getSelectedRow();
        if (filaSeleccionada3 == -1) {
          JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operación",
            "Upsi!", JOptionPane.WARNING_MESSAGE);
        } else {
          String clavePrd = this.jTable3.getValueAt(filaSeleccionada3, 0).toString();
          String nombre = this.jTable3.getValueAt(filaSeleccionada3, 1).toString();
          String medida = this.jTable3.getValueAt(filaSeleccionada3, 2).toString();
          String precio = this.jTable3.getValueAt(filaSeleccionada3, 3).toString();
          String cantidad = this.jTable3.getValueAt(filaSeleccionada3, 4).toString();
          String limiteStock = this.jTable3.getValueAt(filaSeleccionada3, 5).toString();
          String descontinuado = this.jTable3.getValueAt(filaSeleccionada3, 5).toString();
          Producto prod = new Producto(clavePrd, nombre, medida, 
                  Double.parseDouble(precio), 
                  Integer.parseInt(cantidad),
                  Integer.parseInt(limiteStock),
                  Short.parseShort(descontinuado)
          );
          ControlProducto producto = new ControlProducto();
          if (producto.actualizar(prod)) {
            JOptionPane.showMessageDialog(this, "Producto actualizado con éxito",
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
          } else {
            JOptionPane.showMessageDialog(this, "Algo salió mal, intente más tarde",
              "Oh no!", JOptionPane.ERROR_MESSAGE);
          }
        }
        break;
    }
  }//GEN-LAST:event_actualizarActionPerformed

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
//            java.util.logging.Logger.getLogger(Admin_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Admin_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Admin_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Admin_Inventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Admin_Inventario().setVisible(true);
//            }
//        });
//    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton actualizar;
  private javax.swing.JButton agregar;
  private javax.swing.JPanel botones;
  private javax.swing.JTextField busq;
  private javax.swing.JButton eliminar;
  private javax.swing.JButton jButton1;
  private javax.swing.JTable jTable1;
  private javax.swing.JTable jTable2;
  private javax.swing.JTable jTable3;
  private javax.swing.JPanel panel;
  private javax.swing.JPanel panel_categ;
  private javax.swing.JPanel panel_prod;
  private javax.swing.JPanel panel_prov;
  private javax.swing.JPanel panel_table;
  private javax.swing.JTabbedPane pestañas_grupo;
  private javax.swing.JButton regresar;
  private javax.swing.JScrollPane tabla_categ;
  private javax.swing.JScrollPane tabla_prod;
  private javax.swing.JScrollPane tabla_prov;
  private javax.swing.JLabel title;
  // End of variables declaration//GEN-END:variables
}