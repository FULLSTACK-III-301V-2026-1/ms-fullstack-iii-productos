package com.duoc.productos.controller;

import com.duoc.productos.model.Productos;
import com.duoc.productos.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @GetMapping
    public List<Productos> listar() {
        return productosService.listarTodos();
    }

    @PostMapping
    public Productos guardar(@RequestBody Productos producto) {
        return productosService.guardar(producto);
    }
}