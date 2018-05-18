/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.dao;

import co.com.poli.Appinventario.model.Producto;
import java.util.List;

/**
 *
 * @author giovanny
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    
}
