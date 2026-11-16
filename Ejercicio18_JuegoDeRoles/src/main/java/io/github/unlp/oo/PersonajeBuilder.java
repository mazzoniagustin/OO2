package io.github.unlp.oo;

public abstract class PersonajeBuilder {
    private Personaje perso;


    public PersonajeBuilder(String unNombre) {
        this.perso = new Personaje();
        this.perso.setNombre(unNombre);
        this.perso.setVida(100);
    }


    public Personaje getPersonaje() {
        return this.perso;
    }

    public void setNombre(String nombre) {
        this.perso.setNombre(nombre);
    }

    public void setVida() {
        this.perso.setVida(100);
    }

    public abstract void setArmadura();
    public abstract void setArma();
    public abstract void setHabilidades();

}
