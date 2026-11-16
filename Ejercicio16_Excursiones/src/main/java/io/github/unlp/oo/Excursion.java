package io.github.unlp.oo;
import java.time.LocalDate;
import java.util.*;

public class Excursion {
    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> listaEspera;
    private List<Usuario> inscriptos;
    private ExcursionEstado estado;

    public void cambiarEstado(ExcursionEstado e) {
        this.estado = e;
    }

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo, ExcursionEstado estado) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.estado = estado;
        this.listaEspera = new LinkedList<Usuario>();
        this.inscriptos = new LinkedList<Usuario>();
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }

    public double getCosto() {
        return costo;
    }

    public int getCupoMinimo() {
        return cupoMinimo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void inscribirUsuario(Usuario u) {
        this.inscriptos.add(u);
    }

    public void inscribirLista(Usuario u) {
        this.listaEspera.add(u);
    }

    public int cantidadFaltantes() {
        int aux = this.cupoMinimo - this.inscriptos.size();
        if (aux > 0) {
            return aux;
        }
        else return 0;
    }

    public int cantidadParaMaximo() {
        int aux = this.cupoMaximo - this.inscriptos.size();
        if (aux > 0) {
            return aux;
        }
        else {
            return 0;
        }
    }

    public int getSizeEspera() {
        return this.listaEspera.size();
    }

    public String getMailInscriptos() {
        StringBuilder mails = new StringBuilder();
        this.inscriptos.stream()
                .forEach(usuario -> mails.append(usuario.getMail()).append("\n"));
        return mails.toString();
    }

    @Override
    public String toString() {
        return "Excursion{" +
                "nombre='" + nombre + '\'' +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", puntoEncuentro='" + puntoEncuentro + '\'' +
                ", costo=" + costo +
                ", cupoMinimo=" + cupoMinimo +
                ", cupoMaximo=" + cupoMaximo +
                ", listaEspera=" + listaEspera.size() +
                ", inscriptos=" + inscriptos.size() +
                '}';
    }
}
