package io.github.unlp.oo;

import java.util.List;

public class Excursion {
    private String nombre, puntoEncuentro;
    private int cupoMinimo, cupoMaximo;
    private double costo;
    private EstadoExcursion estado;
    private List<Inscriptos> listaInscriptos;
    private List<Inscriptos> listaEspera;



    public void inscribirUsuario(Inscriptos u) {
        listaInscriptos.add(u);
    }

    public void inscribirEspera(Inscriptos u) {
        listaEspera.add(u);
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public double getCosto() {
        return costo;
    }

    public EstadoExcursion getEstado() {
        return estado;
    }

    public int cantidadParaMinimo() {
        return this.cupoMinimo - this.listaInscriptos.size();
    }

    public int cantidadParaMaximo() {
        return this.cupoMaximo - this.listaInscriptos.size();
    }

    public int getInscriptos() {
        return this.listaInscriptos.size();
    }

    @Override
    public String mostrarInformacion() {
        return "Excursion{" +
                "nombre='" + nombre + '\'' +
                ", puntoEncuentro='" + puntoEncuentro + '\'' +
                ", cupoMinimo=" + cupoMinimo +
                ", cupoMaximo=" + cupoMaximo +
                ", costo=" + costo +
                ", estado=" + estado +
                '}';
    }

    public void cambiarEstado (EstadoExcursion estado) {
        this.estado = estado;
    }
}
