package com.distribuidoratotal.distribuidora.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Venta implements Serializable {
    
    @Id
    Long codigo_venta;
    LocalDate fecha_venta;
    Double total;
    @OneToMany
    List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    Cliente unCliente;
}
