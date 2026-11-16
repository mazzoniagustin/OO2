package io.github.unlp.oo;

import java.util.List;

public class Sandwich {
    private List<Componente> componentes;


    public double calcularPrecio() {
        return componentes.stream().mapToDouble(comp -> comp.getPrecio()).sum();
    }

    public void agregarComponente(Componente c) {
        componentes.add(c);
    }


}
