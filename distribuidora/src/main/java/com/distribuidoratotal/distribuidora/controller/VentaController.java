package com.distribuidoratotal.distribuidora.controller;

import com.distribuidoratotal.distribuidora.model.Venta;
import com.distribuidoratotal.distribuidora.service.IVentaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {
     @Autowired
    private IVentaService ventaService;
    
    @GetMapping("/ventas")
    public List<Venta> listarVentas(){
        return ventaService.traerVentas();
    }
    
    @GetMapping("/ventas/{codigo_venta}")
    public Optional<Venta> traerVenta(@PathVariable Long codigo_venta) {
        return ventaService.traerVenta(codigo_venta);
    }
    
    @PostMapping("/ventas/crear")
    public Venta crearVenta(@RequestBody Venta venta) {
        return ventaService.crearVenta(venta);
    }
    
    @DeleteMapping("/ventas/eliminar/{codigo_venta}")
    public String eliminarVenta(@PathVariable Long codigo_venta) {
        Boolean respuesta = ventaService.eliminarVenta(codigo_venta);
        String mensaje = respuesta? "Venta eliminada":"No se elimino ninguna venta";
        return mensaje;
    }
    
    @PutMapping("/ventas/editar")
    public Venta editarVenta(@RequestBody Venta venta) {
        return ventaService.editarVenta(venta);
    }
}
