/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Docente;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class DocenteNombramiento extends Docente {

    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHorasExtra;
    private double sueldo;

    public DocenteNombramiento(String nombres, String cedula) {
        super(nombres, cedula);
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el valor del sueldo: ");
        valorSueldo = entrada.nextDouble();
        System.out.print("Ingrese el valor de la hora extra: ");
        valorHoraExtra = entrada.nextDouble();
        System.out.print("Ingrese el número de horas extra: ");
        numeroHorasExtra = entrada.nextInt();
        sueldo = valorSueldo + (valorHoraExtra * numeroHorasExtra);
    }

    public double getValorSueldo() {
        return valorSueldo;
    }

    public void setValorSueldo(double valorSueldo) {
        this.valorSueldo = valorSueldo;
    }

    public double getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(double valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
