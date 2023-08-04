/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import paquete1.Docente;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
 
            System.out.println("Ingrese una opción:");
            System.out.println("1. Crear DocenteNombramiento");
            System.out.println("2. Crear DocenteFactura");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese nombres del docente: ");
                entrada.nextLine();
                String nombres = entrada.nextLine();
                System.out.print("Ingrese cédula del docente: ");
                String cedula = entrada.nextLine();

                DocenteNombramiento docenteNombramiento = new DocenteNombramiento(nombres, cedula);

            } else if (opcion == 2) {
                System.out.print("Ingrese nombres del docente: ");
                entrada.nextLine();
                String nombres = entrada.nextLine();
                System.out.print("Ingrese cédula del docente: ");
                String cedula = entrada.nextLine();

                DocenteFactura docenteFactura = new DocenteFactura(nombres, cedula);

            } else {
                System.out.println("Error, opción no válida.");
            }
        }
    }

