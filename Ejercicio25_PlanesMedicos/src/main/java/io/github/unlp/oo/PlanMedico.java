package io.github.unlp.oo;

import java.time.LocalDate;

public abstract class PlanMedico {
    private LocalDate fechaContratacion;
    private double montoFijo;


    public PlanMedico (LocalDate unaFecha, double unMonto) {
        this.fechaContratacion = unaFecha;
        this.montoFijo = unMonto;
    }

    public LocalDate getFechaContratacion() {
        return this.fechaContratacion;
    }
}
