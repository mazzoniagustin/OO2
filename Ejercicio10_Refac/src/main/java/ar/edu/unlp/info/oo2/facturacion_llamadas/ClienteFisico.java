package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.List;

public class ClienteFisico extends Cliente{
    private String dni;

    public ClienteFisico(List<Llamada> llamadas, String nombre, String numeroTelefono, String dni) {
        super(nombre, numeroTelefono);
        this.dni = dni;
    }


    @Override
    public double descuento() {
        return 0;
    }
}
