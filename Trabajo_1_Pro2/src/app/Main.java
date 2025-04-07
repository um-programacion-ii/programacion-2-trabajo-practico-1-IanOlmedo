package Trabajo_1_Pro2.src.app;
import Trabajo_1_Pro2.src.Vehiculos.VehiculoPrinter;
import Trabajo_1_Pro2.src.Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {

        Vehiculo fordKa = new Vehiculo("EKZ731", "Ford", 2004, 300);
        Vehiculo fiesta = new Vehiculo("TTD673", "Ford", 2014, 500);
        Vehiculo tcross = new Vehiculo("AA643DB", "Volkswagen", 2022, 800);


        VehiculoPrinter printer = new VehiculoPrinter();
        printer.imprimir(fordKa);
        printer.imprimir(fiesta);
        printer.imprimir(tcross);
    }
}