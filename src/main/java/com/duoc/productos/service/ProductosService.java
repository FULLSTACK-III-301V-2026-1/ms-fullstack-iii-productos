package com.duoc.productos.service;

import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductoRepository productosRepository;

    public List<Productos> obtenerTodos() {
        return productosRepository.findAll();
    }

    public Optional<Productos> obtenerPorId(Integer id) {
        return productosRepository.findById(id);
    }

    public Productos guardar(Productos producto) {
        return productosRepository.save(producto);
    }

    public void eliminar(Integer id) {
        productosRepository.deleteById(id);
    }

    public boolean existePorId(Integer id) {
        return productosRepository.existsById(id);
    }
}