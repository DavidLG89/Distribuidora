package com.distribuidoratotal.distribuidora.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "codigo_venta")
public class Venta implements Serializable {
    
    @Id
    Long codigo_venta;
    LocalDate fecha_venta;
    Double total;
    @ManyToMany
    @JoinTable(name = "relacion_venta_producto",
            joinColumns = @JoinColumn(name = "FK_venta"),
            inverseJoinColumns = @JoinColumn(name = "FK_productos"))
    List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    Cliente cliente;
}
