/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.controller;

import co.com.poli.Appinventario.business.IProductoBusiness;
import co.com.poli.Appinventario.model.Producto;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author giovanny
 */

@RestController
@RequestMapping(value = "/")
public class ProductoController {
    
    @Autowired
    private IProductoBusiness productoBusiness;
    
    @GetMapping("productos")
    public List<Producto> obtenerProductos(HttpServletResponse hsr){
        return productoBusiness.obtenerProductos();
    }    
}
