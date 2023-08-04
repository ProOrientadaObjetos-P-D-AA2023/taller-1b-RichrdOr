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

    public Docente(String nombres, String cedula) {
        this.nombres = nombres;
        this.cedula = cedula;
    }
}
