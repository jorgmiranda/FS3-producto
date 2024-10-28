package com.fs3.productos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fs3.productos.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
