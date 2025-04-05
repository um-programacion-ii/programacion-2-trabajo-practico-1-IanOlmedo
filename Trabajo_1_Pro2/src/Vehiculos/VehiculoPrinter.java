package Trabajo_1_Pro2.src.Vehiculos;

public class VehiculoPrinter {
    public void imprimir(Vehiculo v) {
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Patente: " + v.getPatente());
        System.out.println("Año: " + v.getAnio());
        System.out.println("Capacidad de Carga: " + v.getCapacidadCargaKg());
        System.out.println();
    }
}
