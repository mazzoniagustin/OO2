package io.github.unlp.oo;

public class PCBuilderBasico extends PCBuilder {

    public PCBuilderBasico(Catalogo catalogo) {

        super(catalogo);
    }

    public void agregarProcesador() {
        pc.agregarComponente(catalogo.getComponente("procesador basico"));
    }

    public void agregarMemoria() {
        pc.agregarComponente(catalogo.getComponente("ram 8gb"));
    }

    public void agregarDisco() {
        pc.agregarComponente(catalogo.getComponente("hdd 500gb"));
    }

    public void agregarGrafica() {
    }

    public void agregarGabineteYFuente() {
        pc.agregarComponente(catalogo.getComponente("gabinete estandar"));

    }
}


