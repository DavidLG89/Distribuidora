package com.distribuidoratotal.distribuidora.model;

import java.time.LocalDate;
import lombok.Data;

@Data
public class VentaPorDiaDTO {
    private Long cantidadTotal;
    private Double sumaTotal;
    private LocalDate fecha;
}
