package io.github.unlp.oo;

import java.util.*;

public class Combinadas extends Prenda{
    private List<Prenda> prendas;

    public Combinadas() {
        this.prendas = new LinkedList<Prenda>();
    }

    @Override
    public double getLiquidez() {
        return 0.5;
    }

    public void agregarPrendas(Prenda p) {
        this.prendas.add(p);
    }

    @Override
    public double calcularValorHelper() {
        return prendas.stream().mapToDouble(prendas -> prendas.calcularValor()).sum();
    }
}
