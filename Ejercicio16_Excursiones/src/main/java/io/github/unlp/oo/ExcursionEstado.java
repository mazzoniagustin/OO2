package io.github.unlp.oo;

public abstract class ExcursionEstado {
    private Excursion excur;

    public ExcursionEstado (Excursion excu) {
        this.excur = excu;
    }

    public abstract void inscribirUsuario(Usuario unU);
    public abstract String infoExtra();

    public Excursion getExcur() {
        return excur;
    }

    public String obtenerInformacion() {
        return this.getExcur().toString() + this.infoExtra();
    }
}
