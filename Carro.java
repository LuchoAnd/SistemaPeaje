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
public class Carro extends Vehiculo {
    private final int valorPeaje = 2;

    public Carro(String placa) {
        super(placa);
    }

    @Override
    public int getValorPeaje() {
        return valorPeaje;
    }

    @Override
    public void imprimir() {
        System.out.println("Carro - Placa: " + placa + " - Peaje: $" + getValorPeaje());
    }
}