package io.github.unlp.oo;

public class Definitiva extends EstadoExcursion{

    public Definitiva(Excursion excur) {
        super(excur);
    }

    @Override
    public void inscribirUsuario(Inscriptos u) {
        this.excur.inscribirUsuario(u);
        if (this.excur.getInscriptos() == this.excur.getCupoMaximo()) {
            excur.cambiarEstado(new Completa(excur));
        }
    }

    @Override
    public String infoExtra() {
        return "";
    }


}
