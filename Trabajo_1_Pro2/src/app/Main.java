package Trabajo_1_Pro2.src.app;
import Trabajo_1_Pro2.src.Vehiculos.VehiculoPrinter;
import Trabajo_1_Pro2.src.Vehiculos.Vehiculo;
import Trabajo_1_Pro2.src.Vehiculos.Camion;
import Trabajo_1_Pro2.src.Vehiculos.Auto;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("EKZ731", "Ford", 2004, 300));
        vehiculos.add(new Vehiculo("TTD673", "Ford", 2014, 500));
        vehiculos.add(new Vehiculo("AA643DB", "Volkswagen", 2022, 800));
        vehiculos.add(new Camion("STY273", "Mercedez", 2001, 1500, true));
        vehiculos.add(new Auto("JFZ738", "Volkswagen", 2011, 600, 5));

        VehiculoPrinter printer = new VehiculoPrinter();

        for (Vehiculo v : vehiculos) {
            printer.imprimir(v);
            System.out.println("--------------------");
        }

        Vehiculo encontrado = Vehiculo.buscarPorPatente(vehiculos, "AA63DB");

        if (encontrado != null) {
            printer.imprimir(encontrado);
        } else {
            System.out.println("No se encontró ningún vehículo con esa patente.");
        }
    }
}