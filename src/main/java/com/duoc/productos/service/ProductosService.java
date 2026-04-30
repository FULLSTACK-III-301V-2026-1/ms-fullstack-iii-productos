package com.duoc.productos.service;

feature/controlador-productos
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
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.productos.dto.ProductosDTO;
import com.duoc.productos.dto.ProductosDTOResponse;
import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;

@Service
public class ProductosService {
    @Autowired
    private ProductoRepository productoRepository;

    // Obtener todos los productos
    public List<ProductosDTOResponse> obtenerTodos() {
        return productoRepository.findAll().stream().map(this::crearDTO).collect(Collectors.toList());
    }

    // Crear nuevo producto
    public Productos crearProducto(Productos producto) {
        return productoRepository.save(producto);
    }

    // Eliminar producto
    public boolean eliminarProducto(Integer id) {
        if (productoRepository.existsById(id)) {
            productoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    private ProductosDTOResponse crearDTO(Productos producto) {
        ProductosDTOResponse dto = new ProductosDTOResponse();
        dto.setId(producto.getId());
        dto.setNombre(producto.getNombre());
        dto.setPrecio(producto.getPrecio());
        dto.setCantidad(producto.getCantidad());
        return dto;
    }
}
master
