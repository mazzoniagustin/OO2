package io.github.unlp.oo;

public class Inmuebles extends Prenda{
    private String direccion;
    private double superficie;
    private double costoM2;

    public Inmuebles(double liquidez, String direccion, double superficie, double costoM2) {
        super(liquidez);
        this.direccion = direccion;
        this.superficie = superficie;
        this.costoM2 = costoM2;
    }


    public String getDireccion() {
        return direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public double getCostoM2() {
        return costoM2;
    }

    @Override
    public double calcularValorHelper() {
        return this.getSuperficie() * this.getCostoM2();
    }
}
