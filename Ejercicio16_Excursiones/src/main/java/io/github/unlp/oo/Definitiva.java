package io.github.unlp.oo;

public class Definitiva extends ExcursionEstado{

    public Definitiva(Excursion excu) {
        super(excu);
    }

    @Override
    public void inscribirUsuario(Usuario unU) {
        this.getExcur().inscribirUsuario(unU);
    }

    @Override
    public String infoExtra() {
        return "Cantidad faltantes para el cupo maximo: " + this.getExcur().cantidadParaMaximo() +
        "\n" + "Mails de los inscriptos: " + this.getExcur().getMailInscriptos();
    }


}
