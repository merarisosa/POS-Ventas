/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.DAOProducto;
import database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Producto;
import modelo.Proveedor;


public class ControlProducto implements DAOProducto {

  @Override
  public Producto consultar(String id) {
    try {
      Conexion conexion = new Conexion();
      conexion.conectar();
      Connection con = conexion.getCon();
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM producto WHERE Prod_Clave='" + id + "'");
      if (resultado.next()) {
        return new Producto(
                id,
                resultado.getString("Prod_Nombre"),
                resultado.getString("Prod_MedidaDescripcion"),
                resultado.getDouble("Prod_Precio"),
                resultado.getInt("Prod_Cantidad"),
                resultado.getInt("Prod_LimiteStock"),
                resultado.getShort("Prod_Descontinuado"),
                new Proveedor(resultado.getString("Prov_RFC")),
                new Categoria(resultado.getString("Cat_Folio"))
        );
      }
      con.close();
    } catch (SQLException ex) {
      Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public boolean eliminar(String id) {
    try {
      Conexion conexion = new Conexion();
      conexion.conectar();
      Connection con = conexion.getCon();
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("DELETE FROM producto WHERE Prod_Clave='" + id + "'");
      con.close();
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public boolean actualizar(Producto entidad) {
    try {
      Conexion conexion = new Conexion();
      conexion.conectar();
      Connection con = conexion.getCon();
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("UPDATE producto SET Prod_Nombre = '" + entidad.getNombre() + "', "
              + "Prod_MedidaDescripcion = '" + entidad.getMedidaDesc()+ "', "
              + "Prod_Precio = '" + entidad.getPrecio() + "', "
              + "Prod_Cantidad = '" + entidad.getCantidad() + "', "
              + "Prod_LimiteStock = '" + entidad.getLimiteStock() + "', "
              + "Prod_Descontinuado = '" + entidad.getDescontinuado() + "' "
              + "WHERE Prod_Clave = '" + entidad.getClave() + "'");
      con.close();
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public boolean insertar(Producto entidad) {
    try {
      Conexion conexion = new Conexion();
      conexion.conectar();
      Connection con = conexion.getCon();
      Statement stmt;
      stmt = con.createStatement();
      stmt.executeUpdate("INSERT INTO producto "
              + "VALUES ('" + entidad.getClave() + "', "
              + "'" + entidad.getNombre() + "', "
              + "'" + entidad.getProveedor().getRfc() + "', "
              + "'" + entidad.getCategoria().getFolio() + "',"
              + "'" + entidad.getMedidaDesc() + "', "
              + "'" + entidad.getPrecio() + "', "
              + "'" + entidad.getCantidad() + "', "
              + "'" + entidad.getLimiteStock() + "', "
              + "'" + entidad.getDescontinuado() + "') "
      );
      con.close();
      return true;
    } catch (SQLException ex) {
      Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
  }

  @Override
  public List<Producto> listarTodos() {
    LinkedList<Producto> lista = new LinkedList<>();
    Conexion conexion = new Conexion();
    conexion.conectar();
    Connection con = conexion.getCon();
    try {
      Statement stmt;
      stmt = con.createStatement();
      ResultSet resultado = stmt.executeQuery("SELECT * FROM producto");
      while (resultado.next()) {
        lista.add(new Producto(
                resultado.getString("Prod_Clave"),
                resultado.getString("Prod_Nombre"),
                resultado.getString("Prod_MedidaDescripcion"),
                resultado.getDouble("Prod_Precio"),
                resultado.getInt("Prod_Cantidad"),
                resultado.getInt("Prod_LimiteStock"),
                resultado.getShort("Prod_Descontinuado"),
                new Proveedor(
                        resultado.getString("Prov_RFC")
                ),
                new Categoria(
                        resultado.getString("Cat_folio")
                )
        ));
      }
      con.close();
      return lista;
    } catch (SQLException ex) {
      Logger.getLogger(ControlProducto.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public DefaultTableModel getTableModel(List<Producto> lista) {
    String[] encabezados3 = {"Clave", "Nombre", "Medida", "Precio", "Existencias", "Cantidad mínima", "¿Descontinuado?"};
    DefaultTableModel dftModel3 = new DefaultTableModel(encabezados3, 0) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return column > 0;
      }
    };
    LinkedList<Producto> listaProducto = (LinkedList<Producto>) lista;
    for (Producto prod : listaProducto) {
      dftModel3.addRow(new Object[]{
        prod.getClave(),
        prod.getNombre(),
        prod.getMedidaDesc(),
        prod.getPrecio(),
        prod.getCantidad(),
        prod.getLimiteStock(),
        prod.getDescontinuado()
      });
    }
    return dftModel3;
  }

}
