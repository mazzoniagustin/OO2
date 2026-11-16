package io.github.unlp.oo;

public class Director {

    public PC construir(PCBuilder builder) {
        builder.agregarProcesador();
        builder.agregarMemoria();
        builder.agregarDisco();
        builder.agregarGrafica();
        builder.agregarGabineteYFuente();
        return builder.getPC();
    }

}
