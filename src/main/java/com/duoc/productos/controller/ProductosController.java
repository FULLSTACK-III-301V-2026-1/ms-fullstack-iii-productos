package com.duoc.productos.controller;

import com.duoc.productos.model.Productos;
import com.duoc.productos.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    @PostMapping("/productos")
    public ResponseEntity<Productos> guardar(@RequestBody Productos productos) {
        return ResponseEntity.ok(productosService.guardar(productos));
    }
}
