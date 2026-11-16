package io.github.unlp.oo;

public class Completa extends EstadoExcursion{


    public Completa(Excursion excur) {
        super(excur);
    }

    @Override
    public void inscribirUsuario(Inscriptos u) {
        this.excur.inscribirEspera(u);
    }

    @Override
    public String infoExtra() {
        return "";
    }
}
