/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensualPago;

    // Constructor
    public PrestamoEducativo(Persona beneficiario, int tiempoPrestamoMeses, String ciudadPrestamo,
                             String nivelEstudio, InstitucionEducativa centroEducativo, double valorCarrera) {
        super(beneficiario, tiempoPrestamoMeses, ciudadPrestamo);
        this.nivelEstudio = nivelEstudio;
        this.centroEducativo = centroEducativo;
        this.valorCarrera = valorCarrera;
        this.valorMensualPago = (valorCarrera / tiempoPrestamoMeses) - (0.1 * (valorCarrera / tiempoPrestamoMeses));
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public void setCentroEducativo(InstitucionEducativa centroEducativo) {
        this.centroEducativo = centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public void setValorCarrera(double valorCarrera) {
        this.valorCarrera = valorCarrera;
        this.valorMensualPago = (valorCarrera / getTiempoPrestamoMeses()) - (0.1 * (valorCarrera / getTiempoPrestamoMeses()));
    }

    public double getValorMensualPago() {
        return valorMensualPago;
    }

    public void setCiudadPrestamo(String ciudadPrestamo) {
        super.setCiudadPrestamo(ciudadPrestamo.toUpperCase());
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Nivel de Estudio: " + nivelEstudio + "\n" +
                "Centro Educativo: " + centroEducativo.getNombre() + "\n" +
                "Valor de la Carrera: $" + valorCarrera + "\n" +
                "Valor Mensual de Pago del Prestamo de la Carrera: $" + valorMensualPago;
    }
}

