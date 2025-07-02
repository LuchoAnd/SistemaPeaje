/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapeaje;

/**
 * @Alumno: Luis Andrade
 * @Carrera: CiberSeguridad
 * @Fecha: 29-Jun-2025
 * @Descripción: Sistema que permita el cobro de peaje de los diferentes vehículos
 * 
 * Esta clase es la principal del sistema, en la cual se agregan los vehiculos 
 * de los diferentes tipos.
 * 
 */
import java.util.Scanner;

public class SistemaPeaje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Peaje peaje = new Peaje("Peaje TAMBILLO - SANGOLQUI", "Ruminahui");

        System.out.println("=== SISTEMA DE PEAJE ===");
        String opcion;

        do {
            System.out.print("Ingrese tipo de vehiculo (carro / moto / camion): ");
            String tipo = scanner.nextLine().toLowerCase();

            System.out.print("Ingrese placa: ");
            String placa = scanner.nextLine();

            switch (tipo) {
                case "carro":
                    peaje.agregarVehiculo(new Carro(placa));
                    break;
                case "moto":
                    peaje.agregarVehiculo(new Moto(placa));
                    break;
                case "camion":
                    System.out.print("Ingrese numero de ejes: ");
                    int ejes = Integer.parseInt(scanner.nextLine());
                    peaje.agregarVehiculo(new Camion(placa, ejes));
                    break;
                default:
                    System.out.println("Tipo de vehiculo no valido.");
            }

            System.out.print("Desea ingresar otro vehiculo? (s/n): ");
            opcion = scanner.nextLine().toLowerCase();

        } while (opcion.equals("s"));

        peaje.imprimir();
        scanner.close();
    }
}
