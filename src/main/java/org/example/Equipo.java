package org.example;

public class Equipo {
private String  id;
private String Nombre;
private String Descripcion;

public Equipo(String id, String Nombre, String Descripcion) {
    this.Descripcion = Descripcion;
    this.id = id;
    this.Nombre = Nombre;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
}
