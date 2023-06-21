/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        List<Prestamo> listaPrestamos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("MENÚ");
            System.out.println("Ingresar prestamo de tipo PrestamoAutomovil [1]");
            System.out.println("Ingresar prestamo de tipo PrestamoEducativo [2]");
            System.out.println("Mostrar  la lista de préstamos              [3]");
            System.out.println("Salir                                       [4]");

            System.out.print("Ingrese una opción: ");
            int opcion = entrada.nextInt();
            entrada.nextLine(); 

            switch (opcion) {
                case 1:
                    PrestamoAutomovil prestamoAuto = crearPrestamoAutomovil(entrada);
                    listaPrestamos.add(prestamoAuto);
                    break;
                case 2:
                    PrestamoEducativo prestamoEducativo = crearPrestamoEducativo(entrada);
                    listaPrestamos.add(prestamoEducativo);
                    break;
                case 3:
                    mostrarListaPrestamos(listaPrestamos);
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static PrestamoAutomovil crearPrestamoAutomovil(Scanner scanner) {
        System.out.println("Ingrese los datos del préstamo de automóvil:");
        System.out.print("Nombre del beneficiario: ");
        String nombreBeneficiario = scanner.nextLine();

        System.out.print("Apellido del beneficiario: ");
        String apellidoBeneficiario = scanner.nextLine();

        System.out.print("Username del beneficiario: ");
        String usernameBeneficiario = scanner.nextLine();

        System.out.print("Tiempo de préstamo en meses: ");
        int tiempoPrestamoMeses = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ciudad del préstamo: ");
        String ciudadPrestamo = scanner.nextLine();

        System.out.print("Tipo de automóvil: ");
        String tipoAutomovil = scanner.nextLine();

        System.out.print("Marca de automóvil: ");
        String marcaAutomovil = scanner.nextLine();

        System.out.print("Nombre del garante: ");
        String nombreGarante = scanner.nextLine();

        System.out.print("Apellido del garante: ");
        String apellidoGarante = scanner.nextLine();

        System.out.print("Username del garante: ");
        String usernameGarante = scanner.nextLine();

        System.out.print("Valor del automóvil: ");
        double valorAutomovil = scanner.nextDouble();
        scanner.nextLine(); 

        Persona beneficiario = new Persona(nombreBeneficiario
                , apellidoBeneficiario, usernameBeneficiario);
        Persona garante = new Persona(nombreGarante, apellidoGarante
                , usernameGarante);
        PrestamoAutomovil prestamoAutomovil = new PrestamoAutomovil(beneficiario
                , tiempoPrestamoMeses, ciudadPrestamo,
                tipoAutomovil, marcaAutomovil, garante, valorAutomovil);

        return prestamoAutomovil;
    }

    private static PrestamoEducativo crearPrestamoEducativo(Scanner scanner) {
        System.out.println("Ingrese los datos del prestamo educativo:");
        System.out.print("Nombre del beneficiario: ");
        String nombreBeneficiario = scanner.nextLine();

        System.out.print("Apellido del beneficiario: ");
        String apellidoBeneficiario = scanner.nextLine();

        System.out.print("Username del beneficiario: ");
        String usernameBeneficiario = scanner.nextLine();

        System.out.print("Tiempo de préstamo en meses: ");
        int tiempoPrestamoMeses = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Ciudad del prestamo: ");
        String ciudadPrestamo = scanner.nextLine();

        System.out.print("Nivel de estudio: ");
        String nivelEstudio = scanner.nextLine();

        System.out.print("Nombre del centro educativo: ");
        String nombreCentroEducativo = scanner.nextLine();

        System.out.print("Siglas del centro educativo: ");
        String siglasCentroEducativo = scanner.nextLine();

        System.out.print("Valor de la carrera: ");
        double valorCarrera = scanner.nextDouble();
        scanner.nextLine();

        Persona beneficiario = new Persona(nombreBeneficiario
                , apellidoBeneficiario, usernameBeneficiario);
        InstitucionEducativa centroEducativo = new InstitucionEducativa(nombreCentroEducativo
                , siglasCentroEducativo);
        PrestamoEducativo prestamoEducativo = new PrestamoEducativo(beneficiario
                , tiempoPrestamoMeses, ciudadPrestamo,
                nivelEstudio, centroEducativo, valorCarrera);

        return prestamoEducativo;
    }
        private static void mostrarListaPrestamos(List<Prestamo> listaPrestamos) {
        if (listaPrestamos.isEmpty()) {
            System.out.println("No se han registrado prestamos...");
        } else {
            System.out.println("Lista de Prestamos");
            for (Prestamo prestamo : listaPrestamos) {
                System.out.println(prestamo.toString());
            }
        }
    }
}
