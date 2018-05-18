/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.business.impl;

import co.com.poli.Appinventario.business.IProductoBusiness;
import co.com.poli.Appinventario.dao.IProductoDao;
import co.com.poli.Appinventario.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author giovanny
 */

@Service
public class ProductoBusinessImpl implements IProductoBusiness{

    @Autowired
    private IProductoDao productoDao;
    
    @Override
    public List<Producto> obtenerProductos() {
        return productoDao.obtenerProductos();
    }
    
}
