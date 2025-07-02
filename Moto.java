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
 */

public class Moto extends Vehiculo {
    private final int valorPeaje = 1;

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Moto - Placa: " + placa + " - Peaje: $" + getValorPeaje());
    }
}