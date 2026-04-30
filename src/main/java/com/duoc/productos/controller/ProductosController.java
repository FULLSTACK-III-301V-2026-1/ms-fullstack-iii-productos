package com.duoc.productos.controller;

import com.duoc.productos.model.Productos;
import com.duoc.productos.service.ProductosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    @Autowired
    private ProductosService productosService;

    
    @GetMapping
    public ResponseEntity<List<Productos>> listarTodos() {
        return ResponseEntity.ok(productosService.listarTodos());
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Productos> buscarPorId(@PathVariable Integer id) {
        return productosService.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    
    @PostMapping
    public ResponseEntity<Productos> crear(@RequestBody Productos producto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(productosService.crear(producto));
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<Productos> actualizar(@PathVariable Integer id, 
                                                 @RequestBody Productos producto) {
        return ResponseEntity.ok(productosService.actualizar(id, producto));
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        productosService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}