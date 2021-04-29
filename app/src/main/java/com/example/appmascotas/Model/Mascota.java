package com.example.appmascotas.Model;

public class Mascota {
    private int imagen;
    private String nombre;
    private String genero;
    private String description;

    public Mascota(int imagen, String nombre, String genero, String description) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.genero = genero;
        this.description = description;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
