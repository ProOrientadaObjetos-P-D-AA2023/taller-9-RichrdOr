/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete5.Persona;

/**
 
 * @author reroes
 */
public class Prestamo {
    private Persona beneficiario;
    private int tiempoPrestamoMeses;
    private String ciudadPrestamo;

    public Prestamo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
        this.ciudadPrestamo = ciudadPrestamo;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Persona beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getTiempoPrestamoMeses() {
        return tiempoPrestamoMeses;
    }

    public void setTiempoPrestamoMeses(int tiempoPrestamoMeses) {
        this.tiempoPrestamoMeses = tiempoPrestamoMeses;
    }

    public String getCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        this.ciudadPrestamo = ciudadPrestamo;
    }
}