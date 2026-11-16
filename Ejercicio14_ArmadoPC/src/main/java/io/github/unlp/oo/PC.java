package io.github.unlp.oo;

import java.util.*;

public class PC {

    private List<Componente> componentes;


    public void agregarComponente(Componente c) {
        this.componentes.add(c);
    }

    public double precioFinal() {
        double aux = componentes.stream().mapToDouble(componentes
                -> componentes.getPrecio()).sum();
        return aux * 1.21;
    }

    public double calcularConsumo() {
        return componentes.stream().mapToDouble(componentes
                -> componentes.getConsumo()).sum();
    }
}
