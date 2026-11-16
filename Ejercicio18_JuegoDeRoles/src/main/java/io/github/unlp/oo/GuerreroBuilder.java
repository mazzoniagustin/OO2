package io.github.unlp.oo;

public class GuerreroBuilder extends PersonajeBuilder {


    public GuerreroBuilder(String unNombre) {
        super(unNombre);
    }


    public void setArma() {
        this.getPersonaje().setArma(new Espada());
    }

    public void setArmadura() {
        this.getPersonaje().setArmadura(new Acero());
    }

    public void setHabilidades() {
        this.getPersonaje().agregarHabilidad("Cuerpo a Cuerpo.");
    }
}
