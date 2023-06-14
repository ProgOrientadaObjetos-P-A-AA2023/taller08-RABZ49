/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente{

    private double valors ;
    private double valorHex ;
    private double numeroHextra ;
    private double sueldo ;
    
    public double obtenerValors() {
        return valors;
    }

    public void establecerValors(double x) {
        valors = x;
    }

    public double obtenerValorHex() {
        return valorHex;
    }

    public void establecerValorHex(double x) {
        valorHex = x;
    }

    public double obtenerNumeroHextra() {
        return numeroHextra;
    }

    public void establecerNumeroHextra(double x) {
        numeroHextra = x;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public void calcularSueldo() {
        sueldo = (valorHex*numeroHextra)+valors;
    }

    @Override
    public String toString() {
        String x = String.format("Nombre del docente: %s\n"
                + "Numero de cedula: %s\n"
                + "Valor del sueldo: %.2f\n"
                + "Valor haora extra: %.2f\n"
                + "Numero de horas extra: %.2f\n"
                + "Sueldo %.2f\n",obtenerNombred(),obtenerCedula(),
                obtenerValors(),obtenerValorHex(),
                obtenerNumeroHextra(),obtenerSueldo() );
        return x;
    }
    
}
