package com.company;

public class Auto extends Vehiculo {
    private Integer puertas;

    public Auto(String marca, String modelo, Double precio, Integer puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // " + " Modelo: " + super.getModelo() + " // " +  " Puertas: " + puertas +  " // " + " Precio: " +  "$" + String.format("%.2f", super.getPrecio()) + "\n";
    }

    @Override
    public String impresionPersonalizada(Boolean precio) {
        return (precio)  ?  super.toString()  + "  $" + String.format("%.2f",super.getPrecio())  + "\n"  : " " + super.toString() + "\n";
    }
}
