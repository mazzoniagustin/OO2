package io.github.unlp.oo;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Automoviles extends Prenda{
    private String modelo;
    private double kms;
    private double costo0km;
    private LocalDate adquisicion;

    public Automoviles(double liquidez, String modelo, double kms, double costo0km, LocalDate adquisicion) {
        super(liquidez);
        this.modelo = modelo;
        this.kms = kms;
        this.costo0km = costo0km;
        this.adquisicion = adquisicion;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCosto0km() {
        return costo0km;
    }

    public double getKms() {
        return kms;
    }

    public LocalDate getAdquisicion() {
        return adquisicion;
    }

    public int getAntiguedad() {
        return (int) ChronoUnit.YEARS.between(this.getAdquisicion(), LocalDate.now());
    }

    @Override
    public double calcularValorHelper() {
        return this.costo0km * (0.1 * this.getAntiguedad());
    }
}
