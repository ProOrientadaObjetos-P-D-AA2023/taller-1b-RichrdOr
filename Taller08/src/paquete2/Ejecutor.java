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
        Docente d = new Docente();
        int opcion;
        System.out.println("DOCENTES DE LA UTPL");
        System.out.println("Ingrese 1 para crear Docente con Nombramiento");
        System.out.println("Ingrese 2 parea crear Docente Factura");
        opcion = entrada.nextInt();
        
        if (opcion == 1){
            DocenteNombramiento n = new DocenteNombramiento();
            d.leerDatos();
            n.leerDatos2();
            d.presentarDatos0();
            
            
           
        
        }else if(opcion == 2){
            
                
            }else{
                    System.out.println("Error, opción no válida.");
                }
            }
        }

