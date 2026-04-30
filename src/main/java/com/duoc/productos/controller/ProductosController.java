package com.duoc.productos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import com.duoc.productos.dto.ProductosDTO;
import com.duoc.productos.model.Productos;
import com.duoc.productos.service.ProductoService;

@RestController
@RequestMapping("/api/v1/productos")
@Validated
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<Productos> crearProducto(@Valid @RequestBody ProductosDTO productoDTO) {
        Productos productoGuardado = productoService.crearProducto(productoDTO);
        return new ResponseEntity<>(productoGuardado, HttpStatus.CREATED);
    }
}
