package io.github.unlp.oo;

public class Componente {
    private String nombre;
    private String desc;
    private double precio;
    private double consumo;

    public Componente(String nombre, String desc, double precio, double consumo) {
        this.nombre = nombre;
        this.desc = desc;
        this.precio = precio;
        this.consumo = consumo;
    }


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
