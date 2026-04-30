package com.duoc.productos.service;

import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosService {

    @Autowired

    private ProductoRepository productoRepository;

    // Obtener todos los productos
    public List<Productos> obtenerTodos() {
        return productoRepository.findAll();
    }

    // Crear nuevo producto
    public Productos crearProducto(Productos producto) {
        return productoRepository.save(producto);
    }

    // Eliminar producto
    public boolean eliminarProducto(Long id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    // Guardar nuevo producto
    public Productos guardar(Productos productos) {
        return productoRepository.save(productos);
    }

}