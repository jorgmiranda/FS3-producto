package com.fs3.productos.service;

import java.util.List;
import java.util.Optional;

import com.fs3.productos.model.Producto;

public interface ProductoService {
    List<Producto> getAllProductos();
    Optional<Producto> getProductoByID(Long id);
    Producto crearProducto(Producto producto);
    Producto actualizarProducto(Long id, Producto producto);
    void eliminarProducto(Long id);
}
