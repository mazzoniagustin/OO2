package io.github.unlp.oo;

public abstract class EstadoExcursion {
    protected Excursion excur;

    public EstadoExcursion(Excursion excur) {
        this.excur = excur;
    }

    public abstract void inscribirUsuario(Inscriptos u);

    public abstract String infoExtra();

}
