package io.github.unlp.oo;

public class Provisoria extends EstadoExcursion{

    public Provisoria(Excursion excur) {
        super(excur);
    }

    @Override
    public void inscribirUsuario(Inscriptos u) {
        this.excur.inscribirUsuario(u);
        if (this.excur.getInscriptos() == this.excur.getCupoMinimo()) {
            this.excur.cambiarEstado(new Definitiva(excur));
        }
    }

    @Override
    public String infoExtra() {
        return "";
    }


}
