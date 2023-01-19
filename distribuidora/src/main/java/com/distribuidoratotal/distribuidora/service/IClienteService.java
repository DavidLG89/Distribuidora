package com.distribuidoratotal.distribuidora.service;

import com.distribuidoratotal.distribuidora.model.Cliente;
import java.util.List;
import java.util.Optional;


public interface IClienteService {
    public Cliente crearCliente(Cliente nuevoCliente);
    public Optional<Cliente> traerCliente(Long id);
    public List<Cliente> traerClientes();
    public Cliente editarCliente(Cliente cliente);
    public Boolean eliminarCliente(Long id);
    
}
