package io.github.unlp.oo;

public class Acero implements Armadura{


    @Override
    public void recibirDaño(Arma unArma) {
        unArma.dañoAAcero();
    }
}
