package com.distribuidoratotal.distribuidora.repository;

import com.distribuidoratotal.distribuidora.model.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IProductoRepository extends CrudRepository<Producto, Long>{
    @Query("SELECT p FROM Producto p WHERE p.cantidad_disponible < 5")
    List<Producto> findLowStock();
}
