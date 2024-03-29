/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @param <T>
 * @param <K>
 */
public interface DAOGeneral<T,K> {
  public T consultar(K id);
  public boolean eliminar(K id);
  public boolean actualizar(T entidad);
  public boolean insertar(T entidad);
  public List<T> listarTodos();
  public DefaultTableModel getTableModel(List<T> lista);
}
