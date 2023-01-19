package com.distribuidoratotal.distribuidora.service;

import com.distribuidoratotal.distribuidora.model.Venta;
import java.util.List;
import java.util.Optional;


public interface IVentaService {
    public Venta crearVenta(Venta venta);
    public Optional<Venta> traerVenta(Long codigoVenta);
    public List<Venta> traerVentas();
    public Venta editarVenta(Venta venta);
    public Boolean eliminarVenta(Long codigoVenta);
}
