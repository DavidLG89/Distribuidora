package com.distribuidoratotal.distribuidora.controller;


import com.distribuidoratotal.distribuidora.model.Cliente;
import com.distribuidoratotal.distribuidora.service.IClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private IClienteService clienteService;
    
    @GetMapping("/clientes")
    public List<Cliente> listarClientes(){
        return clienteService.traerClientes();
    }
    
    @GetMapping("/clientes/{id}")
    public Optional<Cliente> traerCliente(@PathVariable Long id) {
        return clienteService.traerCliente(id);
    }
    
    @PostMapping("/clientes/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return clienteService.crearCliente(cliente);
    }
    
    @DeleteMapping("/clientes/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id) {
        Boolean respuesta = clienteService.eliminarCliente(id);
        String mensaje = respuesta? "Cliente eliminado":"No se elimino ningun cliente";
        return mensaje;
    }
    
    @PutMapping("/clientes/editar")
    public Cliente editarCliente(@RequestBody Cliente cliente) {
        return clienteService.editarCliente(cliente);
    }
}
