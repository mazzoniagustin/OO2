package io.github.unlp.oo;

public class Hierro implements Armadura{


    @Override
    public void recibirDaño(Arma unArma) {
        unArma.dañoAHierro();
    }
}
