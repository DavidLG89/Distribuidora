package com.distribuidoratotal.distribuidora.service;

import com.distribuidoratotal.distribuidora.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.distribuidoratotal.distribuidora.repository.IClienteRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IClienteRepository repoCliente;

    @Override
    public Cliente crearCliente(Cliente nuevoCliente) {
        return repoCliente.save(nuevoCliente);
    }

    @Override
    public Optional<Cliente> traerCliente(Long id) {
        return repoCliente.findById(id);
    }

    @Override
    public List<Cliente> traerClientes() {
        return (List)repoCliente.findAll();
    }

    @Override
    public Cliente editarCliente(Cliente cliente) {
        return repoCliente.save(cliente);
    }

    @Override
    public Boolean eliminarCliente(Long id) {
        if (repoCliente.existsById(id)) {
        	repoCliente.deleteById(id);
            return true;
        }
            return false;
    }
    
    
}
