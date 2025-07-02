/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
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
public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public abstract int getValorPeaje();

    public abstract void imprimir();
}
