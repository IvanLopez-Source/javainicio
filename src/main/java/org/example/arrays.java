package org.example;// Definir un array de 5 numeros (lleno)
// Un array de 5 nombres de ciudades (llenos)


public class arrays {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] ciudades = {"Valencia", "Madrid", "Barcelona", "Sevilla", "Santander"};
        System.out.println("Números:");
        for (int numero : numeros)
        {
            System.out.println(numero);
        }
        System.out.println("Ciudades:");
        for (String ciudad : ciudades)
        {
            System.out.println(ciudad);
        }
    }
}