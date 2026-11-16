package io.github.unlp.oo;

import java.time.LocalDate;

public class Presupuesto {
    private LocalDate fechaRealizacion;
    private String nombreUsuario;
    private PC pc;


    public Presupuesto(String nombreUsuario, PC pc) {
        this.fechaRealizacion = LocalDate.now();
        this.nombreUsuario = nombreUsuario;
        this.pc = pc;
    }

    public double precioPresupuesto() {
        return this.pc.precioFinal();
    }

    public double consumoPresupuesto() {
        return this.pc.calcularConsumo();
    }


}
