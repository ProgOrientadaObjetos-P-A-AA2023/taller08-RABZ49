/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Docente;
import paquete1.DocenteFactura;
import paquete1.DocenteNombramiento;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;

        do {

            System.out.println("docente con nombramiento [1]");
            System.out.println("docente factura          [2]");
            System.out.println("salir                    [0]");
            op = scanner.nextInt();

            switch (op) {
                case 1:

                    DocenteNombramiento dn = new DocenteNombramiento();
                    dn.establecerNombred(docenteN());
                    dn.establecerCedula(docenteC());
                    System.out.println("ingrese el valor del sueldo: ");
                    double valors = scanner.nextDouble();
                    dn.establecerValors(valors);
                    System.out.println("ingrese el valor de las horas extra: ");
                    double valorHex = scanner.nextDouble();
                    dn.establecerValorHex(valorHex);
                    System.out.println("ingrese el numero de horas extra: ");
                    double numHex = scanner.nextDouble();
                    dn.establecerNumeroHextra(numHex);

                    dn.calcularSueldo();
                    System.out.println(dn);
                    break;
                case 2:
                    DocenteFactura df = new DocenteFactura();
                    df.establecerNombred(docenteN());
                    df.establecerCedula(docenteC());
                    System.out.println("ingrese el valor de la factura: ");
                    double valorfac = scanner.nextDouble();
                    df.establecerValorfac(valorfac);
                    df.calcularValorcan();
                    System.out.println(df);
                    break;
                case 0:
                    op = 0;
                    break;
                default:
                    System.out.println("opcion fuera de rango\n");

            }

        } while (op != 0);

    }

    public static String docenteN() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el nombre del docente: ");
        String nombre = scanner.nextLine();

        return nombre;

    }

    public static String docenteC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("intruduce el numero de cedula: ");
        String numeroC = scanner.nextLine();
        return numeroC;
    }

}
