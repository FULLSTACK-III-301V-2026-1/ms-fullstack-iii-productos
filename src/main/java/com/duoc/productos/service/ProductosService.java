package com.duoc.productos.service;

import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {

    @Autowired
    private ProductoRepository productosRepository;

    public List<Productos> listarTodos() {
        return productosRepository.findAll();
    }

    public Productos guardar(Productos producto) {
        return productosRepository.save(producto);
    }
}