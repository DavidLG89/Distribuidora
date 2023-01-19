package com.distribuidoratotal.distribuidora.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Producto  {

    @Id
    Long codigo_producto;
    String nombre;
    String marca;
    Double costo;
    Double cantidad_disponible;
}
