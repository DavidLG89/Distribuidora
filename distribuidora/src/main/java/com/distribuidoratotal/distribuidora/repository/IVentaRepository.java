package com.distribuidoratotal.distribuidora.repository;

import com.distribuidoratotal.distribuidora.model.Venta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends CrudRepository<Venta, Long>{
    
}
