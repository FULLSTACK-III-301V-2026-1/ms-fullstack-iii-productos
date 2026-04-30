package com.duoc.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.duoc.productos.model.Productos;

@Repository
public interface ProductoRepository extends JpaRepository<Productos, Long>{

}


