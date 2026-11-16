package io.github.unlp.oo;

public class Componente {
    private String nombre;
    private double precio;

    public Componente(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
