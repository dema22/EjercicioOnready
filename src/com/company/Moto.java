package com.company;

public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String marca, String modelo, Double precio, String cilindrada) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() +  " // " + " Modelo: " + super.getModelo()  + " // " +  " Cilindrada: " + cilindrada  +  " //"  + " Precio: "  +  " $" +  String.format("%.2f", super.getPrecio()) + "\n";
    }

    @Override
    public String impresionPersonalizada(Boolean precio) {
        return (precio)  ?  super.toString()  + "  $" + String.format("%.2f", super.getPrecio())  + "\n"   :  " " + super.toString() + "\n" ;
    }
}
