package com.distribuidoratotal.distribuidora.service;

import java.util.List;
import java.util.Optional;
import com.distribuidoratotal.distribuidora.model.Producto;


public interface IProductoService {
    public Producto crearProducto(Producto producto);
    public List<Producto> traerProductos();
    public Optional<Producto> traerProducto(Long id);
    public Producto editarProducto(Producto producto);
    public Boolean eliminarProducto(Long id);
}
