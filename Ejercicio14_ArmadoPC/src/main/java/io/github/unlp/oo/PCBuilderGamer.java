package io.github.unlp.oo;

public class PCBuilderGamer extends PCBuilder {

    public PCBuilderGamer(Catalogo catalogo) {
        super(catalogo);
    }

    public void agregarProcesador() {
        pc.agregarComponente(catalogo.getComponente("procesador gamer"));
        pc.agregarComponente(catalogo.getComponente("pad termico"));
        pc.agregarComponente(catalogo.getComponente("cooler"));
    }

    public void agregarMemoria() {
        pc.agregarComponente(catalogo.getComponente("ram 32gb"));
        pc.agregarComponente(catalogo.getComponente("ram 32gb"));
    }

    public void agregarDisco() {
        pc.agregarComponente(catalogo.getComponente("ssd 500gb"));
        pc.agregarComponente(catalogo.getComponente("ssd 1tb"));
    }

    public void agregarGrafica() {
        pc.agregarComponente(catalogo.getComponente("rtx 4090"));
    }

    public void agregarGabineteYFuente() {
        pc.agregarComponente(catalogo.getComponente("gabinete gamer"));

        double consumo = pc.calcularConsumo();
        int fuente = (int) (consumo * 1.5);

        pc.agregarComponente(
                catalogo.getComponente("fuente " + fuente + " w")
        );
    }
}
