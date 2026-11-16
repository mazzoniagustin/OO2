package io.github.unlp.oo;

public class Provisoria extends ExcursionEstado{


    public Provisoria(Excursion excur) {
        super(excur);
    }

    public void inscribirUsuario(Usuario u) {
        this.getExcur().inscribirUsuario(u);
    }

    @Override
    public String infoExtra() {
        return "Cantidad faltantes para el mínimo: " + this.getExcur().cantidadFaltantes();
    }
}
