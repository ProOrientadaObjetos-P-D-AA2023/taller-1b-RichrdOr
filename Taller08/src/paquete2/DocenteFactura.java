/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Docente;

/**
 *
 * @author UTPL
 */
public class DocenteFactura extends Docente{
    private double valorFactura;
    private double valorIvaDescuento;
    private double valorCancelar;

    public double getValorFactura() {
        return valorFactura;
    }

    public void setValorFactura(double valorFactura) {
        this.valorFactura = valorFactura;
    }

    public double getValorIvaDescuento() {
        return valorIvaDescuento;
    }

    public void setValorIvaDescuento(double valorIvaDescuento) {
        this.valorIvaDescuento = valorIvaDescuento;
    }

    public double getValorCancelar() {
        return valorCancelar;
    }

    public void setValorCancelar(double valorCancelar) {
        this.valorCancelar = valorCancelar;
    }
    
}
