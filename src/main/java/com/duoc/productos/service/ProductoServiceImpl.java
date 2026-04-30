package com.duoc.productos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duoc.productos.dto.ProductosDTO;
import com.duoc.productos.model.Productos;
import com.duoc.productos.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public Productos crearProducto(ProductosDTO productoDTO) {
        Productos producto = new Productos();
        producto.setNombre(productoDTO.getNombre());
        producto.setPrecio(productoDTO.getPrecio());
        producto.setCantidad(productoDTO.getCantidad());
        producto.setCodigo(productoDTO.getCodigo());
        return productoRepository.save(producto);
    }
}
