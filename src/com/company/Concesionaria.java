package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class Concesionaria {
    private List<Vehiculo> misVehiculos;

    public Concesionaria() {
        this.misVehiculos = new ArrayList<>();
    }

    public List<Vehiculo> getMisVehiculos() {
        return misVehiculos;
    }

    public void setMisVehiculos(List<Vehiculo> misVehiculos) {
        this.misVehiculos = misVehiculos;
    }

    // Metodos

    public void addVehiculos() {
        Vehiculo vehiculoUno = new Auto("Peugeot", "206", 200000.00,4);
        Vehiculo vehiculoDos = new Moto("Honda","Titan", 60000.00,"125cc");
        Vehiculo vehiculoTres = new Auto("Peugeot", "208", 250000.00,5);
        Vehiculo vehiculoCuatro = new Moto("Yamaha","YBR", 80500.50,"160cc");
        this.misVehiculos.add(vehiculoUno);
        this.misVehiculos.add(vehiculoDos);
        this.misVehiculos.add(vehiculoTres);
        this.misVehiculos.add(vehiculoCuatro);
    }

    public Vehiculo getVehiculoMasCaro(List<Vehiculo> misVehiculos){
        return misVehiculos.stream().max(comparing(Vehiculo::getPrecio)).get();
    }

    public Vehiculo getVehiculoMasBarato(List<Vehiculo> misVehiculos){
        return misVehiculos.stream().min(comparing(Vehiculo::getPrecio)).get();
    }

    public Vehiculo getVehiculoConLetraPorModelo(List<Vehiculo> misVehiculos) {
        return misVehiculos.stream().filter(v -> v.getModelo().contains("Y")).findFirst().get();
    }

    public void imprimeVehiculosConcesionaria() {
        misVehiculos.forEach(System.out::println);
    }

    public void imprimeVehiculosConcesionariaPorOrdenamiento(List<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo: vehiculos) {
            System.out.println(vehiculo.impresionPersonalizada(false));
        }
    }


    public List<Vehiculo> ordenarVehiculos() {
        List<Vehiculo> vehiculosOrdenados = this.misVehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .collect(Collectors.toList());
        return vehiculosOrdenados;
    }
}
