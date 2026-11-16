package io.github.unlp.oo;

public class ClasicoBuilder extends SandwichBuilder{


    @Override
    public void agregarPan() {
        sandwich.agregarComponente(new Componente("Pan brioche",100));
    }

    @Override
    public void agregarAderezo() {
        
    }
}
