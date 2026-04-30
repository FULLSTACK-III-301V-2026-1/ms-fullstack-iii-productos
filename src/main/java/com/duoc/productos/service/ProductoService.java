package com.duoc.productos.service;

import com.duoc.productos.dto.ProductosDTO;
import com.duoc.productos.model.Productos;

public interface ProductoService {
    Productos crearProducto(ProductosDTO productoDTO);
}
