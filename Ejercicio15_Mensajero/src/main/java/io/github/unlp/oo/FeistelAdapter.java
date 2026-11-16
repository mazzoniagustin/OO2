package io.github.unlp.oo;
import ar.info.juego.Encriptador.FeistelCipher;

public class FeistelAdapter implements AlgoritmoCifrado{
    private FeistelCipher encriptador;

    public FeistelAdapter(String key) {
        encriptador = new FeistelCipher(key);
    }

    @Override
    public String encriptar(String mensaje) {
        return encriptador.encode(mensaje);
    }

    public String desencriptar(String mensaje) {
        return encriptador.encode(mensaje);
    }
}
