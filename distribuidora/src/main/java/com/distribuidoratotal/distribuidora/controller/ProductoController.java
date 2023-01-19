package com.distribuidoratotal.distribuidora.controller;

import java.util.List;
import java.util.Optional;
import com.distribuidoratotal.distribuidora.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.distribuidoratotal.distribuidora.service.IProductoService;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService prodService;
    
    @GetMapping("/productos")
    public List<Producto> listarProductos(){
        return prodService.traerProductos();
    }
    
    @GetMapping("/productos/{codigo_producto}")
    public Optional<Producto> traerProducto(@PathVariable Long codigo_producto) {
        return prodService.traerProducto(codigo_producto);
    }
    
    @PostMapping("/productos/crear")
    public Producto crearProducto(@RequestBody Producto producto) {
        return prodService.crearProducto(producto);
    }
    
    @DeleteMapping("/productos/eliminar/{codigo_producto}")
    public String eliminarProducto(@PathVariable Long codigo_producto) {
        Boolean respuesta = prodService.eliminarProducto(codigo_producto);
        String mensaje = respuesta? "Producto eliminado":"No se elimino ningun producto";
        return mensaje;
    }
    
    @PutMapping("/productos/editar")
    public Producto editarProducto(@RequestBody Producto producto) {
        return prodService.editarProducto(producto);
    }
    
}
