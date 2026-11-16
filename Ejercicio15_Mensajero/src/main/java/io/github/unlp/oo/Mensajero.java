package io.github.unlp.oo;

public class Mensajero {
    private AlgoritmoCifrado algoritmoCifrado;

    public Mensajero(AlgoritmoCifrado algoritmoCifrado) {
        this.algoritmoCifrado = algoritmoCifrado;
    }


    public void cambiarAlgoritmo(AlgoritmoCifrado unAlgo) {
        this.algoritmoCifrado = unAlgo;
    }

    public String enviarMensaje(String mensaje) {
        return this.algoritmoCifrado.encriptar(mensaje);
    }

    public String recibirMensaje(String mensaje) {
        return this.algoritmoCifrado.desencriptar(mensaje);
    }
}
