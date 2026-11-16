package io.github.unlp.oo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquileres extends Prenda{
    private LocalDate inicioContrato;
    private LocalDate finContrato;
    private double costoMensual;


    public Alquileres(double liquidez, LocalDate inicioContrato, LocalDate finContrato, double costoMensual) {
        super(liquidez);
        this.inicioContrato = inicioContrato;
        this.finContrato = finContrato;
        this.costoMensual = costoMensual;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public LocalDate getFinContrato() {
        return finContrato;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public int mesesRestantes() {
        return (int) ChronoUnit.MONTHS.between(this.inicioContrato,this.finContrato);
    }

    public double calcularValorHelper() {
        return this.mesesRestantes() * this.costoMensual;
    }
}
