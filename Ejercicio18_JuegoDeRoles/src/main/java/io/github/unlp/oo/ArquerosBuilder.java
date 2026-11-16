package io.github.unlp.oo;

public class ArquerosBuilder extends PersonajeBuilder{

    public ArquerosBuilder(String unNombre) {
        super(unNombre);
    }

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new Cuero());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Arco());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().agregarHabilidad("Distancia.");
    }


}
