/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.dao.impl;

import co.com.poli.Appinventario.dao.IProductoDao;
import co.com.poli.Appinventario.data.ProductoData;
import co.com.poli.Appinventario.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author giovanny
 */
@Repository
public class ProductoDaoImpl implements IProductoDao{
    
    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }
    
}
