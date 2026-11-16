package io.github.unlp.oo;

public class Main {

    public static void main(String[] args) {
        FeistelAdapter feistelCipher = new FeistelAdapter("123");
        Mensajero mensajero = new Mensajero(feistelCipher);
        String envio = mensajero.enviarMensaje("Hola!");
        System.out.println(envio);
        String retorno = mensajero.recibirMensaje("Hola!");
        System.out.println(retorno);

        RC4Adapter rc4 = new RC4Adapter("Contraseña");
        mensajero.cambiarAlgoritmo(rc4);
        mensajero.enviarMensaje("Hola!");
    }

}