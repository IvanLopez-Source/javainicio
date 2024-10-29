package org.example;

public class buclewhile {
    public static void main(String[] args) {
        int contador = 5;

        // Using a while loop to print numbers from 0 to 9
        while (contador <= 10) {
            if (contador %2 != 0) {
                System.out.println("Número: " + contador);}
                contador++;
            }
        }
    }
