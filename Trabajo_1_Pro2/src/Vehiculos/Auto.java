package Trabajo_1_Pro2.src.Vehiculos;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    public Auto(String patente, String marca, int anio, int capacidadCarga, int cantidadPasajeros){
        super(patente, marca, anio, capacidadCarga);
        this.cantidadPasajeros = cantidadPasajeros;

    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() +
                "\nCantidad de pasajeros: " + cantidadPasajeros;
    }
}
