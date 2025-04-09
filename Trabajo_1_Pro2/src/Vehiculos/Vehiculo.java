package Trabajo_1_Pro2.src.Vehiculos;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo {
    private String patente;
    private String marca;
    private int anio;
    private double capacidadCargaKg;

    public Vehiculo(String patente, String marca, int anio, double capacidadCargaKg) {
        if (patente == null || patente.trim().isEmpty()) {
            throw new IllegalArgumentException("La patente no puede ser nula ni vacía.");
        }

        int anioActual = Year.now().getValue();
        if (anio < 1900 || anio > anioActual) {
            throw new IllegalArgumentException("El año debe estar entre 1900 y " + anioActual + ".");
        }

        if (capacidadCargaKg <= 0) {
            throw new IllegalArgumentException("La capacidad de carga debe ser positiva.");
        }

        this.patente = patente;
        this.marca = marca;
        this.anio = anio;
        this.capacidadCargaKg = capacidadCargaKg;
    }



    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCapacidadCargaKg() {
        return capacidadCargaKg;
    }

    public void setCapacidadCargaKg(double capacidadCargaKg) {
        this.capacidadCargaKg = capacidadCargaKg;
    }

    public String getInformacion() {
        return "Marca: " + marca +
                "\nPatente: " + patente +
                "\nAño: " + anio +
                "\nCantidad de Carga: " + capacidadCargaKg;

    }

    public static Vehiculo buscarPorPatente(ArrayList<Vehiculo> lista) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("---> Ingrese una patente para buscar (o escriba 'salir'): ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("salir")) {
                System.out.println("--> Saliendo del sistema de búsqueda.");
                return null;
            }

            for (Vehiculo v : lista) {
                if (v.getPatente().equalsIgnoreCase(input)) {
                    System.out.println("El vehículo con la patente '" + input + "' es:");
                    return v;
                }
            }

            System.out.println("No se encontró ningún vehículo con esa patente.");
        }
    }
}


