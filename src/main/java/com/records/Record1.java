package com.records;

public class Record1 {

    public static void main(String[] args) {
        Producto p = new Producto("arroz", 300);
        Producto q = p.setPrecio(600);

        System.out.println(p.toString());
        System.out.println(q.toString());
        System.out.println(q.setNombre("pollo").toString());
    }
}
