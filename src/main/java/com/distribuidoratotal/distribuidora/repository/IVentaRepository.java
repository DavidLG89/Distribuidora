package com.distribuidoratotal.distribuidora.repository;

import com.distribuidoratotal.distribuidora.model.Venta;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends CrudRepository<Venta, Long>{
  @Query("SELECT v FROM Venta v WHERE v.fecha_venta = :fecha_venta")  
    List<Venta> traerVentaPorDia(LocalDate fecha_venta); 
  }  
    //COUNT(/*) AS cantidad_total, SUM(total) AS suma_total