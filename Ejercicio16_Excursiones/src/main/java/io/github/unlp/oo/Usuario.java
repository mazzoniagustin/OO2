package io.github.unlp.oo;

public class Usuario {
    private String mail;
    private String nombre;
    private String apellido;

    public Usuario(String mail, String nombre, String apellido) {
        this.mail = mail;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
