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
    private ProductoRepository productoRepository;

    public List<Productos> listarTodos() {
        return productoRepository.findAll();
    }

    public Optional<Productos> buscarPorId(Integer id) {
        return productoRepository.findById(id);
    }

    public Productos crear(Productos producto) {
        return productoRepository.save(producto);
    }

    public Productos actualizar(Integer id, Productos producto) {
        return productoRepository.findById(id)
                .map(productoExistente -> {
                    producto.setId(id);
                    return productoRepository.save(producto);
                })
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    public void eliminar(Integer id) {
        productoRepository.deleteById(id);
    }
}