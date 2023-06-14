/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteFactura extends Docente{

    private double valorfac;
    private double valorivades;
    private double valorcan;

    public double obtenerValorfac() {
        return valorfac;
    }

    public void establecerValorfac(double x) {
        valorfac = x;
    }

    public double obtenerValorivades() {
        return valorivades;
    }

    public void establecerValorivades(double x) {
        valorivades = x;
    }

    public double obtenerValorcan() {
        return valorcan;
    }

    public void calcularValorcan() {
        valorcan = (valorfac * 0.12)+valorfac;
    }

    @Override
    public String toString() {
        String x = String.format("Nombre del docente: %s\n"
                + "Numero de cedula: %s\n"
                + "Valor de la factura: %.2f\n"
                + "valor del iva: 12%s \n"
                + "valor a cancelar: %.2f", obtenerNombred(),
                obtenerCedula(),obtenerValorfac(),"%",obtenerValorcan());
        return x;
    }
    
    
}
