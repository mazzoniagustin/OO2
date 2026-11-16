package io.github.unlp.oo;

public abstract class Prenda {
    private double liquidez;


    public Prenda(double liquidez) {
        this.liquidez = liquidez;
    }

    protected Prenda() {
    }

    public abstract double calcularValorHelper();

    public double getLiquidez() {
        return this.liquidez;
    }

    public double calcularValor() {
        return this.getLiquidez() * this.calcularValorHelper();
    }

}
