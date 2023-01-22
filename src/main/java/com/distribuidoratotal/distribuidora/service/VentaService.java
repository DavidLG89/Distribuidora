package com.distribuidoratotal.distribuidora.service;

import com.distribuidoratotal.distribuidora.model.Venta;
import com.distribuidoratotal.distribuidora.model.VentaPorDiaDTO;
import com.distribuidoratotal.distribuidora.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService{
    
    @Autowired
    IVentaRepository repoVenta;
    
       @Override
    public Venta crearVenta(Venta venta) {
        return repoVenta.save(venta);
    }

    @Override
    public Optional<Venta> traerVenta(Long codigoVenta) {
        return repoVenta.findById(codigoVenta);
    }

    @Override
    public List<Venta> traerVentas() {
       return (List<Venta>) repoVenta.findAll();
        
    }

    @Override
    public Venta editarVenta(Venta venta) {
        return repoVenta.save(venta);
    }

    @Override
    public Boolean eliminarVenta(Long codigoVenta) {
        if (repoVenta.existsById(codigoVenta)) {
        	repoVenta.deleteById(codigoVenta);
            return true;
        }
            return false;
    }

    @Override
    public VentaPorDiaDTO traerVentasPorDia(LocalDate fecha_venta) {
        List<Venta> ventasPorDia = repoVenta.traerVentaPorDia(fecha_venta);
        
        Long cantidad = ventasPorDia.stream().count();
        Optional<Double> sumaTotal = ventasPorDia.stream()
                                    .map(Venta::getTotal)
                                    .reduce(Double::sum);
        
        VentaPorDiaDTO ventaPorDia = new VentaPorDiaDTO();
        ventaPorDia.setCantidadTotal(cantidad);
        ventaPorDia.setSumaTotal(sumaTotal.get());
        ventaPorDia.setFecha(fecha_venta);
        
        return ventaPorDia;
    }
    
}
