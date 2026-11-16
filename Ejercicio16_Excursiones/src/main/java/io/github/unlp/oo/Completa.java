package io.github.unlp.oo;

public class Completa extends ExcursionEstado{

    public Completa(Excursion excu) {
        super(excu);
    }

    @Override
    public void inscribirUsuario(Usuario unU) {
        this.getExcur().inscribirLista(unU);
    }

    @Override
    public String infoExtra() {
        return "Cantidad de usuarios en lista de espera: " + this.getExcur().getSizeEspera();
    }


}
