/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.ControlDetalleVenta;
import java.awt.Color;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.DetalleVenta;
import modelo.Producto;
import utils.Util;

/**
 *
 * @author merarimaysosa
 */
public class Vendedor_Ventas extends javax.swing.JFrame {

  /**
   * Creates new form Vendedor_Ventas
   */
  public Vendedor_Ventas() {
    initComponents();
    ControlDetalleVenta venta = new ControlDetalleVenta();
    int siguiente = venta.listarTodos().size() + 1;
    String folioVenta = Util.generarFolio("VEN", String.valueOf(siguiente));
    this.campoFolio.setText(folioVenta);
    this.campoFolio.setEnabled(false);

    LocalDate fechaActual = LocalDate.now();
    this.campoFecha.setText(fechaActual.toString());
    this.campoFecha.setEnabled(false);

    tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][]{},
            new String[]{
              "Clave", "Producto", "Precio unitario", "Cantidad", "Descuento", "Importe"
            }
    ) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return column == 3 || column == 4;
      }
    });
    tablaVenta.getTableHeader().setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 16));
    tablaVenta.getTableHeader().setOpaque(false);
    tablaVenta.getTableHeader().setBackground(Color.WHITE);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jPanel2 = new javax.swing.JPanel();
    jPanel3 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    campoEfectivo = new javax.swing.JTextField();
    campoCambio = new javax.swing.JTextField();
    btnCambio = new javax.swing.JButton();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    ventaTotal = new javax.swing.JLabel();
    btnActualizar = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();
    jPanel5 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tablaVenta = new javax.swing.JTable();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    campoFolio = new javax.swing.JTextField();
    campoFecha = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBackground(new java.awt.Color(204, 204, 255));
    jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255), 3));

    jPanel3.setBackground(new java.awt.Color(204, 204, 255));
    jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true));

    jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    jLabel3.setText("Ticket");

    jPanel4.setBackground(new java.awt.Color(204, 204, 255));
    jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 255), 3, true));

    jLabel6.setText("Efectivo:");

    jLabel5.setText("Cambio:");

    campoCambio.setEnabled(false);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoCambio, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
          .addGroup(jPanel4Layout.createSequentialGroup()
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(campoEfectivo)))
        .addContainerGap(16, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addGap(16, 16, 16)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(campoEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(19, Short.MAX_VALUE))
    );

    btnCambio.setText("Calcular");
    btnCambio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCambioActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(21, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(btnCambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(16, Short.MAX_VALUE))
    );

    jButton1.setText("Finalizar compra");
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jButton1MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        jButton1MouseExited(evt);
      }
    });
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("Seleccionar producto");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setText("Eliminar producto");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
      }
    });

    jLabel1.setFont(new java.awt.Font("Cute Cartoon", 1, 36)); // NOI18N
    jLabel1.setText("Total MXN $:");

    ventaTotal.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
    ventaTotal.setText("0.00");

    btnActualizar.setText("Actualizar registro");
    btnActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnActualizarActionPerformed(evt);
      }
    });

    jButton4.setText("Cerrar sesión");
    jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseEntered(java.awt.event.MouseEvent evt) {
        jButton4MouseEntered(evt);
      }
      public void mouseExited(java.awt.event.MouseEvent evt) {
        jButton4MouseExited(evt);
      }
    });
    jButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton4ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(17, 17, 17)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(17, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(ventaTotal)))
            .addGap(25, 25, 25))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(78, 78, 78))))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addComponent(jButton2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnActualizar)
        .addGap(47, 47, 47)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel1)
          .addComponent(ventaTotal))
        .addGap(42, 42, 42)
        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(28, 28, 28)
        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
    jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));

    tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
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
    jScrollPane1.setViewportView(tablaVenta);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel7.setFont(new java.awt.Font("Cute Cartoon", 1, 48)); // NOI18N
    jLabel7.setText("Venta de Productos");

    jLabel8.setText("Folio de Venta:");

    jLabel9.setText("Fecha de Registro:");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoFecha)))
            .addGap(0, 53, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel7)
            .addGap(154, 154, 154))))
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(jLabel7)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jLabel9)
          .addComponent(campoFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(15, 15, 15))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
      // TODO add your handling code here:
      this.jButton1.setBackground(new Color(204, 204, 255));

    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      // TODO add your handling code here:
      this.jButton1.setBackground(Color.white);
    }//GEN-LAST:event_jButton1MouseExited

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    // TODO add your handling code here:
    Vendedor_Ventas_Agregar agregar = new Vendedor_Ventas_Agregar(this.tablaVenta, this.ventaTotal);
    agregar.setLocationRelativeTo(this);
    agregar.setVisible(true);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    // TODO add your handling code here:
    int filaSeleccionada = this.tablaVenta.getSelectedRow();
    if (filaSeleccionada == -1) {
      JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operación",
              "Upsi!", JOptionPane.WARNING_MESSAGE);
    } else {
      DefaultTableModel dftable = (DefaultTableModel) this.tablaVenta.getModel();
      double importeRestado = Double.parseDouble(this.tablaVenta.getValueAt(filaSeleccionada, 5).toString());
      double nuevoTotal = Double.parseDouble(this.ventaTotal.getText()) - importeRestado;
      this.ventaTotal.setText(String.valueOf(nuevoTotal));
      dftable.removeRow(filaSeleccionada);
      JOptionPane.showMessageDialog(this, "Producto eliminado con éxito de la venta",
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_jButton3ActionPerformed

  private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
    // TODO add your handling code here:
    int filaSeleccionada = this.tablaVenta.getSelectedRow();
    if (filaSeleccionada == -1) {
      JOptionPane.showMessageDialog(this, "Seleccione una fila para realizar esta operación",
              "Upsi!", JOptionPane.WARNING_MESSAGE);
    } else {
      int filas = this.tablaVenta.getModel().getRowCount();
      double nuevoTotal = 0.0;
      for (int fila = 0; fila < filas; fila++) {
        double precioUnitario = Double.parseDouble(this.tablaVenta.getValueAt(fila, 2).toString());
        int cantidad = Integer.parseInt(this.tablaVenta.getValueAt(fila, 3).toString());
        double descuento = Double.parseDouble(this.tablaVenta.getValueAt(fila, 4).toString());
        double totalRegistro = (cantidad * precioUnitario) - descuento;
        nuevoTotal += totalRegistro;
        this.tablaVenta.setValueAt(totalRegistro, fila, 5);
      }
      this.ventaTotal.setText(String.valueOf(nuevoTotal));
      this.campoCambio.setText("");
      JOptionPane.showMessageDialog(this, "Actualización de venta realizada con éxito",
              "Eureka!", JOptionPane.INFORMATION_MESSAGE);
    }
  }//GEN-LAST:event_btnActualizarActionPerformed

  private void btnCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambioActionPerformed
    // TODO add your handling code here:
    String efectivo = this.campoEfectivo.getText();
    if (efectivo.isBlank()) {
      JOptionPane.showMessageDialog(this, "Rellene el campo de efectivo.",
              "Alerta", JOptionPane.WARNING_MESSAGE);
    } else {
      try {
        double cantidadEfectivo = Double.parseDouble(efectivo);
        double cambio = cantidadEfectivo - Double.parseDouble(this.ventaTotal.getText());
        if (cambio < 0.0) {
          JOptionPane.showMessageDialog(this, "Efectivo insuficiente!",
                  "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
          this.campoCambio.setText(String.valueOf(cambio));
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El campo debe de ser un valor numérico!",
                "Algo salió mal...", JOptionPane.ERROR_MESSAGE);
      }
    }
  }//GEN-LAST:event_btnCambioActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
    int filas = this.tablaVenta.getModel().getRowCount();
    if (filas > 0) {
      for (int fila = 0; fila < filas; fila++) {
        String prodClave = this.tablaVenta.getValueAt(fila, 0).toString();
        int cantidad = Integer.parseInt(this.tablaVenta.getValueAt(fila, 3).toString());
        double descuento = Double.parseDouble(this.tablaVenta.getValueAt(fila, 4).toString());
        try {
          DetalleVenta ven = new DetalleVenta(
                  this.campoFolio.getText(),
                  new Producto(prodClave),
                  cantidad,
                  descuento,
                  new SimpleDateFormat("YYY-MM-dd").parse(this.campoFecha.getText())
          );
          ControlDetalleVenta venta = new ControlDetalleVenta();
          if (!venta.hacerCompra(ven)) {
            JOptionPane.showMessageDialog(this, "Algo salió mal, intente más tarde",
                    "Oh no!", JOptionPane.ERROR_MESSAGE);
          }
        } catch (ParseException ex) {
          Logger.getLogger(Vendedor_Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
      JOptionPane.showMessageDialog(this, "Venta registrada con éxito",
                    "Eureka!", JOptionPane.INFORMATION_MESSAGE);
    } else {
      JOptionPane.showMessageDialog(this, "Necesita al menos un registro para finalizar la compra",
              "Alerta", JOptionPane.WARNING_MESSAGE);
    }
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton4MouseEntered

  private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
    // TODO add your handling code here:
  }//GEN-LAST:event_jButton4MouseExited

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    // TODO add your handling code here:
    this.dispose();
    new Login().setVisible(true);
  }//GEN-LAST:event_jButton4ActionPerformed

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
//            java.util.logging.Logger.getLogger(Vendedor_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Vendedor_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Vendedor_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Vendedor_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Vendedor_Ventas().setVisible(true);
//            }
//        });
//    }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnActualizar;
  private javax.swing.JButton btnCambio;
  private javax.swing.JTextField campoCambio;
  private javax.swing.JTextField campoEfectivo;
  private javax.swing.JTextField campoFecha;
  private javax.swing.JTextField campoFolio;
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JPanel jPanel4;
  private javax.swing.JPanel jPanel5;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tablaVenta;
  private javax.swing.JLabel ventaTotal;
  // End of variables declaration//GEN-END:variables
}
