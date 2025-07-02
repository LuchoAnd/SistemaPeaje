/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapeaje;

/**
 *
 * @author Usuario
 * 
 * 
 * package sistemapeaje;
 * 
 * package sistemapeaje;
*/

import java.util.ArrayList;

public class Peaje {
    private String nombre;
    private String canton;
    private int totalPeaje = 0;
    private int totalCarros = 0;
    private int totalMotos = 0;
    private int totalCamiones = 0;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Peaje(String nombre, String canton) {
        this.nombre = nombre;
        this.canton = canton;
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
        int valor = vehiculo.getValorPeaje();
        totalPeaje += valor;

        if (vehiculo instanceof Carro) totalCarros++;
        else if (vehiculo instanceof Moto) totalMotos++;
        else if (vehiculo instanceof Camion) totalCamiones++;
    }

    public void imprimir() {
        System.out.println("\n======= REPORTE PEAJE =======");
        System.out.println(" " + nombre);
        System.out.println("Canton: " + canton);
        System.out.println("\nVehiculos atendidos:");
        for (Vehiculo v : vehiculos) {
            v.imprimir();
        }
        System.out.println("\nTotal recaudado: $" + totalPeaje);
        System.out.println("Total Carros: " + totalCarros);
        System.out.println("Total Motos: " + totalMotos);
        System.out.println("Total Camiones: " + totalCamiones);
        System.out.println("=============================\n");
    }
}