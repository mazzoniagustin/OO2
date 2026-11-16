package io.github.unlp.oo;

public class Cuero implements Armadura{

    @Override
    public void recibirDaño(Arma unArma) {
        unArma.dañoACuero();
    }


}
