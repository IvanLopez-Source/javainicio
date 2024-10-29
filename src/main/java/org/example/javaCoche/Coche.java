package org.example.javaCoche;

public class Coche {
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;

    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public void kilometraje (double km){
        this.kilometraje = 0;
    }

    public String mostrarInformación() {
        System.out.println("marca" + marca);
        System.out.println("modelo" + modelo);
        
    }
}
