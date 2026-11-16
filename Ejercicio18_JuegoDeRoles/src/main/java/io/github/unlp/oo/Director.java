package io.github.unlp.oo;

public class Director {
    private PersonajeBuilder builder;

    public Director(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje build(String nombre) {
        builder.setNombre(nombre);
        builder.setVida();
        builder.setArma();
        builder.setArmadura();
        builder.setHabilidades();
        return builder.getPersonaje();
    }

}
