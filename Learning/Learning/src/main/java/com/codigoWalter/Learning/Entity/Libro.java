package com.codigoWalter.Learning.Entity;

public class Libro {


    private String nombre;
    private String autor;
    private String  codigo;
    private int cantidadDeLibros;


    public Libro() {
    }

    public Libro(String autor, String nombre, String codigo, int cantidadDeLibros) {
        this.autor = autor;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadDeLibros = cantidadDeLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDeLibros() {
        return cantidadDeLibros;
    }

    public void setCantidadDeLibros(int cantidadDeLibros) {
        this.cantidadDeLibros = cantidadDeLibros;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo='" + codigo + '\'' +
                ", cantidadDeLibros=" + cantidadDeLibros +
                '}';
    }
}
