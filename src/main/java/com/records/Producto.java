package com.records;

public record Producto(String nombre, int precio) {

    public Producto setNombre(String nombre) {
        return new Producto(nombre, this.precio);
    }

    public Producto setPrecio(int precio) {
        return new Producto(this.nombre, precio);
    }
}
