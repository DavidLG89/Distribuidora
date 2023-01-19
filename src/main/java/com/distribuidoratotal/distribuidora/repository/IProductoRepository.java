package com.distribuidoratotal.distribuidora.repository;

import com.distribuidoratotal.distribuidora.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long>{
    
}
