/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapeaje;

/**
 *
 * @Alumno: Luis Andrade
 * @Carrera: CiberSeguridad
 * @Fecha: 29-Jun-2025
 * @Descripción: Sistema que permita el cobro de peaje de los diferentes vehículos
 * 
 */
public class Camion extends Vehiculo {
    private final int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public int getValorPeaje() {
        return switch (numeroEjes) {
            case 1 -> 3;
            case 2 -> 4;
            default -> 5;
        }; // 3 o más ejes
    }

    @Override
    public void imprimir() {
        System.out.println("Camion - Placa: " + placa + " - Ejes: " + numeroEjes + " - Peaje: $" + getValorPeaje());
    }
}

