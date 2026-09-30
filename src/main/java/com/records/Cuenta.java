package com.records;

public record Cuenta(String nombre, String clave, boolean privilegiado) {

    public Cuenta(String nombre, String clave) {
        this(nombre, clave, false);
    }

    public String identificador() {
        return "@" + nombre;
    }

    public void tienePrivilegios() {
        if (this.privilegiado) {
            System.out.println("Tiene privilegios");
        } else {
            System.out.println("Es regular");
        }
    }

}
