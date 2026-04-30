package com.duoc.productos.dto;

import lombok.Data;

@Data
public class ProductosDTOResponse {
    private Integer id;

    private String nombre;

    private Integer precio;

    private Integer cantidad;
}

