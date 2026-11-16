package io.github.unlp.oo;

public class MagoBuilder extends PersonajeBuilder{


    public MagoBuilder(String unNombre) {
        super(unNombre);
    }

    @Override
    public void setArmadura() {
        this.getPersonaje().setArmadura(new Cuero());
    }

    @Override
    public void setArma() {
        this.getPersonaje().setArma(new Baston());
    }

    @Override
    public void setHabilidades() {
        this.getPersonaje().agregarHabilidad("Magia - Curacion");
    }


}
