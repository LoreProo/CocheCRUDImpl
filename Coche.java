package com.lorena;

public class Coche {
    
    // Atributos
    String marca;
    String modelo;
    String color;
    boolean electrico;

    // Constructores
    public Coche(){}

    public Coche(String marca, String modelo, String color, boolean electrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.electrico = electrico;
    }
        
    // Métodos

    @Override
    public String toString() {
        return "Coche{" + "nombre=" + marca +
                             ", edad=" + modelo + 
                             ", salario=" + color + 
                             ", alta=" + electrico + 
                             '}';
    }
    
  
} 
