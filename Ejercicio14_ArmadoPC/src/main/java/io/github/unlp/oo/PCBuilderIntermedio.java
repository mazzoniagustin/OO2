package io.github.unlp.oo;

public class PCBuilderIntermedio extends PCBuilder {

    public PCBuilderIntermedio(Catalogo catalogo) {
        super(catalogo);
    }

    public void agregarProcesador() {
        pc.agregarComponente(catalogo.getComponente("procesador intermedio"));
    }

    public void agregarMemoria() {
        pc.agregarComponente(catalogo.getComponente("ram 16gb"));
    }

    public void agregarDisco() {
        pc.agregarComponente(catalogo.getComponente("ssd 500gb"));
    }

    public void agregarGrafica() {
        pc.agregarComponente(catalogo.getComponente("gtx 1650"));
    }

    public void agregarGabineteYFuente() {
        pc.agregarComponente(catalogo.getComponente("gabinete intermedio"));
        pc.agregarComponente(catalogo.getComponente("fuente 800w"));
    }
}
