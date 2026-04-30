package com.duoc.productos.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductosDTO {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombre;

    @NotNull(message = "El Precio es Obligatorio")
    @Min(value = 1, message = "El precio debe ser mayor a 0")
    private Integer precio;

    @NotNull(message = "La Cantidad es Obligatoria")
    @Min(value = 0, message = "La cantidad no debe ser negativa")
    private Integer cantidad;
}
