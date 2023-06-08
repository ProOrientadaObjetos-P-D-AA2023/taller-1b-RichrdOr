/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import static java.util.Locale.US;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Docente {

    protected String nombres;
    protected String cedula;
    
    public void leerDatos(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(US);
        
        System.out.println("Ingrese el nombre del docente");
        nombres = entrada.nextLine();
        System.out.println("Ingrese el numero de cedula");
        cedula = entrada.nextLine();
    }
    
    public void presentarDatos0(){
        System.out.println("Nombre: " + nombres);
        System.out.println("Cedula: " + cedula);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

}
