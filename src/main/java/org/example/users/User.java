package org.example.users;

public class User {
    private String nombre;
    private String apellido;
    public User(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String fullNombre() {
        return nombre + " " + apellido;
    }
}


