package com.company;


import java.util.List;

/*
Ejercicio Trainee Onready
Imaginemos una concesionaria de autos y motos.
Crear un programa en Java o Javascript que, al ejecutarse, se visualice lo siguiente por consola:

Marca: Peugeot // Modelo: 206 // Puertas: 4 // Precio: $200.000,00
Marca: Honda // Modelo: Titan // Cilindrada: 125cc // Precio: $60.000,00
Marca: Peugeot // Modelo: 208 // Puertas: 5 // Precio: $250.000,00
Marca: Yamaha // Modelo: YBR // Cilindrada: 160cc // Precio: $80.500,50
=============================
Vehículo más caro: Peugeot 208
Vehículo más barato: Honda Titan
Vehículo que contiene en el modelo la letra ‘Y’: Yamaha YBR $80.500,50
=============================
Vehículos ordenados por precio de mayor a menor:
Peugeot 208
Peugeot 206
Yamaha YBR
Honda Titan

La solución debe cumplir con los siguientes requisitos:
Estar programada en Java o Javascript según tu lenguaje de preferencia.
Subir la solución a un repositorio Git público para que podamos descargar la solución directamente.
Diseñar una solución orientada a objetos y subir al repositorio un diagrama de clases junto con el código.
La salida es por consola y exactamente como se requiere.
NO usar librerías de terceros.
Cargar la lista de autos en un único método. No hay ingreso por pantalla de ningún tipo.
El algoritmo usado para la impresión no tiene que depender de la cantidad, modelo o tipo de vehículo.

                                    --------------------------------------------------------
                                    |                   CONCESIONARIA                       |
                                    |                                                       |
                                    | List<Vehiculo> vehiculos;                             |
                                    |                                                       |
                                    |-------------------------------------------------------|
                                    | addVehiculos() :void                                  |
                                    | getVehiculoMasCaro() : Vehiculo                       |
                                    | getVehiculoMasBarato() : Vehiculo                     |
                                    | getVehiculoConLetraPorModelo() : Vehiculo             |
                                    | imprimeVehiculosConcesionaria() : void                |
                                    | imprimeVehiculosConcesionaria(List<Vehiculo>) : void  |
                                    | ordenarVehiculos() : List<Vehiculo>                   |
                                    |-------------------------------------------------------

                                    ---------------------------------------------------------
                                    |         (abstract)        VEHICULO                    |
                                    |                                                       |
                                    |  String marca                                         |
                                    |  String modelo                                        |
                 -----------------  |  Double precio                                        | ---------------
                 |                  |                                                       |                |
                 |                  |-------------------------------------------------------|                |
                 |                  | toString() :String                                    |                |
                                    | abstract impresionPersonalizada() : String            |                |
                 |                  |-------------------------------------------------------                 |
                 |                                                                                           |
                \ /                                                                                         \ /
   --------------------------------------------------------                         ----------------------------------------------
   |                      AUTO                            |                         |               MOTO                         |
   |   Integer puertas                                    |                         |  String cilindrada                         |
   |                                                      |                         |                                            |
   |                                                      |                         |                                            |
   |                                                      |                         |                                            |
   |------------------------------------------------------|                         -------------------------------------------- |
   |  toString() :String                                  |                         | toString() :String                         |
   |  impresionPersonalizada() : Srtring                  |                         | abstract impresionPersonalizada() : Srtring|
   |                                                      |                         |                                            |
   |------------------------------------------------------                          ----------------------------------------------

*/
public class Main {

    public static void main(String[] args) {
        Concesionaria miConcecionaria = new Concesionaria();
        miConcecionaria.addVehiculos();
        miConcecionaria.imprimeVehiculosConcesionaria();

        // Busquedas
        Vehiculo vehiculoMasCaro = miConcecionaria.getVehiculoMasCaro(miConcecionaria.getMisVehiculos());
        Vehiculo vehiculoMasBarato = miConcecionaria.getVehiculoMasBarato(miConcecionaria.getMisVehiculos());
        Vehiculo vehiculoConModeloLetraY = miConcecionaria.getVehiculoConLetraPorModelo(miConcecionaria.getMisVehiculos());

        System.out.println("=============================\n");
        System.out.println("Vehiculo mas caro: "  + vehiculoMasCaro.impresionPersonalizada(false));
        System.out.println("Vehiculo mas barato: " + vehiculoMasBarato.impresionPersonalizada(false));
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculoConModeloLetraY.impresionPersonalizada( true));

        // Ordenamientos
        System.out.println("=============================\n");
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        List<Vehiculo> vehiculosOrdenados = miConcecionaria.ordenarVehiculos();
        miConcecionaria.imprimeVehiculosConcesionariaPorOrdenamiento(vehiculosOrdenados);
    }
}
