package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{

    public LlamadaInternacional(String origen, String destino, int duracion) {
        super(origen, destino, duracion);
    }


    @Override
    public double costoLlamada() {
        double aux = costoLlamada() * 150 + 50;
        return aux + (aux * 0.21);
    }
}
