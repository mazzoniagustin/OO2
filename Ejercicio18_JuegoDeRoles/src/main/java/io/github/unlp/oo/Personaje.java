package io.github.unlp.oo;
import java.util.*;


public class Personaje {
    private String nombre;
    private Arma arma;
    private Armadura armadura;
    private List<String> habilidades;
    private int vida;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void agregarHabilidad(String habilidad) {
        this.habilidades.add(habilidad);
    }

    public boolean tieneVida() {
        return this.vida > 0;
    }

    public void atacar(Personaje rival) {
        if (this.tieneVida() && rival.tieneVida()) {
            rival.getArmadura().recibirDaño(this.getArma());
        }
    }
        

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
