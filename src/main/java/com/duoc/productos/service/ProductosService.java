package com.duoc.productos.service;

import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {

    private ProductoRepository productoRepository;

    public Productos guardar(Productos productos) {
        return productoRepository.save(productos);
    }
}
