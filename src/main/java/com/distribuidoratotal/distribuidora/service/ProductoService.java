package com.distribuidoratotal.distribuidora.service;

import java.util.List;
import java.util.Optional;
import com.distribuidoratotal.distribuidora.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuidoratotal.distribuidora.repository.IProductoRepository;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public Producto crearProducto(Producto producto) {
        return repoProducto.save(producto);
    }

    @Override
    public List<Producto> traerProductos() {
        return (List<Producto>) repoProducto.findAll();
    }

    @Override
    public Optional<Producto> traerProducto(Long id) {
        return repoProducto.findById(id);
    }

    @Override
    public Producto editarProducto(Producto producto) {
        return repoProducto.save(producto);
    }

    @Override
    public Boolean eliminarProducto(Long id) {
        if (repoProducto.existsById(id)) {
        	repoProducto.deleteById(id);
            return true;
        }
            return false;
    }
    
}
