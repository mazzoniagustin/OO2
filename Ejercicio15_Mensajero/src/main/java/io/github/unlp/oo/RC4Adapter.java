package io.github.unlp.oo;
import ar.info.juego.Encriptador.RC4;

public class RC4Adapter implements AlgoritmoCifrado {
    private RC4 encriptador;
    private String key;

    public RC4Adapter (String key) {
        encriptador = new RC4();
        this.key = key;
    }

    public String encriptar(String mensaje) {
        return encriptador.encriptar(mensaje,this.key);
    }

    public String desencriptar(String mensaje) {
        return encriptador.desencriptar(mensaje, this.key);
    }


}
