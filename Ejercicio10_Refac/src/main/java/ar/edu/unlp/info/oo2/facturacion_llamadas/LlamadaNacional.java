package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada{
    public LlamadaNacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }


    @Override
    public double costoLlamada() {
        double aux = this.getDuracion() * 3;
        return aux + (aux * 0.21);
    }
}
