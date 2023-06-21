/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;   
    private double valorMensualPago;

    public PrestamoAutomovil(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
                              String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
        this.valorMensualPago = valorAutomovil / tiempoPrestamoMeses;
    }

    public String getTipoAutomovil() {
        return tipoAutomovil;
    }

    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public String getMarcaAutomovil() {
        return marcaAutomovil;
    }

    public void setMarcaAutomovil(String marcaAutomovil) {
        this.marcaAutomovil = marcaAutomovil;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public void setGarante1(Persona garante1) {
        this.garante1 = garante1;
    }

    public double getValorAutomovil() {
        return valorAutomovil;
    }

    public void setValorAutomovil(double valorAutomovil) {
        this.valorAutomovil = valorAutomovil;
        this.valorMensualPago = valorAutomovil / getTiempoPrestamoMeses();
    }

    public double getValorMensualPago() {
        return valorMensualPago;
    }

    
    public void setCiudadPrestamo(String ciudadPrestamo) {
        super.setCiudadPrestamo(ciudadPrestamo.toLowerCase());
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Tipo de Automóvil: " + tipoAutomovil + "\n" +
                "Marca de Automóvil: " + marcaAutomovil + "\n" +
                "Garante 1: " + garante1.getNombre() + " " + garante1.getApellido() + "\n" +
                "Valor de Automóvil: $" + valorAutomovil + "\n" +
                "Valor Mensual de Pago del Prestamo de automóvil: $" + valorMensualPago;
    }
}
