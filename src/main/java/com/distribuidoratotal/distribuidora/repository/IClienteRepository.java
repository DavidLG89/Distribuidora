package com.distribuidoratotal.distribuidora.repository;

import com.distribuidoratotal.distribuidora.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {
    
}
