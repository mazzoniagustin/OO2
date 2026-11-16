package io.github.unlp.oo;

public abstract class PCBuilder {
    protected PC pc;
    protected Catalogo catalogo;

    public PCBuilder(Catalogo cat) {
        this.pc = new PC();
        this.catalogo = cat;
    }


    public abstract void agregarProcesador();
    public abstract void agregarMemoria();
    public abstract void agregarDisco();
    public abstract void agregarGrafica();
    public abstract void agregarGabineteYFuente();

    public PC getPC() {
        return this.pc;
    }

    /* En caso de querer agregar nuevos componentes, es tan fácil como agregarlos al catálogo. A su vez, en esta implementación
    Se puede moficar en "agregarPeriferico()" eb caso de que asi sea necesario.
    Si se quieren nuevas configuraciones, se debe ir a la clase deseada y modificarlos desde ahí para que sean buscados en el catagolo,
    o por otro lado, si se quiere crear una nueva PC, se debe crear una nueva clase builder.
     */
}
