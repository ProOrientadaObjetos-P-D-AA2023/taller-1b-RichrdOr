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
public class DocenteNombramiento extends Docente{
    private int valorSueldo;
    private int valorHoraExtra;
    private int numHorasExtras;
    private double sueldo;
    
    public void leerDatos2(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del sueldo: ");
        valorSueldo = entrada.nextInt();
        System.out.println("Ingrese el valor de las horas extras: ");
        valorHoraExtra = entrada.nextInt();
        System.out.println("Ingrese el numero de horas extras: ");
        numHorasExtras = entrada.nextInt();
       
    }
    public void calcularSueldo(){
        sueldo = valorSueldo + (valorHoraExtra * numHorasExtras);
        System.out.println("EL sueldo del docente Nombramiento es: " + sueldo);
    }
    

    public int getValorSueldo() {
        return valorSueldo;
    }

    public void setValorSueldo(int valorSueldo) {
        this.valorSueldo = valorSueldo;
    }

    public int getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(int valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getNumHorasExtras() {
        return numHorasExtras;
    }

    public void setNumHorasExtras(int numHorasExtras) {
        this.numHorasExtras = numHorasExtras;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}
