package org.example.users;

public class Main {
    public static void main(String[] args) {


        User usuario1 = new User("leandra", "garcia");
        User usuario2 = new User("carlos", "sainz");
        User usuario3 = new User("julian", "martinez");

        User [] usuarios = {usuario1, usuario2, usuario3};
        for (User usuario : usuarios)
        {
            System.out.println(usuario.fullNombre());
        }
    }
}

//utilizando algun bucle. imprime los fullname de 3 usuarios diferentes