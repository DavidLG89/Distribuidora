package com.distribuidoratotal.distribuidora.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "codigo_producto")
public class Producto  {

    @Id
    Long codigo_producto;
    String nombre;
    String marca;
    Double costo;
    Double cantidad_disponible;
    @ManyToMany (mappedBy = "listaProductos")
    @JsonIgnore
    List<Venta> listaVentas;
}
