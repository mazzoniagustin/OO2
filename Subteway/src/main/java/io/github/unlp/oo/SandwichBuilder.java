package io.github.unlp.oo;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public abstract void agregarPan();
    public abstract void agregarAderezo();
    public abstract void agregarPrincipal();
    public abstract void agregarAdicional();

    public void reset() {
        sandwich = new Sandwich();
    }

}
