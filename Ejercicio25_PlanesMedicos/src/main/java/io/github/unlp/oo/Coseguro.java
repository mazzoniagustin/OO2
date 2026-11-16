package io.github.unlp.oo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Coseguro {
    private double descuento;
    private LocalDate fechaIngreso;
    private double montoCoberturaViaje;

    public Coseguro(double descuento, LocalDate fechaIngreso, double montoCoberturaViaje) {
        this.descuento = descuento;
        this.fechaIngreso = fechaIngreso;
        this.montoCoberturaViaje = montoCoberturaViaje;
    }

    public double getDescuento() {
        return descuento;
    }


    public int getAntiguedad() {
        return ChronoUnit.YEARS(this.fechaIngreso, LocalDate.now());
    }
}
