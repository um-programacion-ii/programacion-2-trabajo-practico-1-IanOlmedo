package Trabajo_1_Pro2.src.Vehiculos;

public class Camion extends Vehiculo {
    private boolean tieneAcoplado;

    public Camion(String patente, String marca, int anio,int CapacidadCarga, boolean tieneAcoplado) {
        super(patente, marca, anio, CapacidadCarga);
        this.tieneAcoplado = tieneAcoplado;
    }

    public boolean isTieneAcoplado() {
        return tieneAcoplado;
    }

    public void setTieneAcoplado(boolean tieneAcoplado) {
        this.tieneAcoplado = tieneAcoplado;
    }

    @Override
    public String getInformacion() {
        return super.getInformacion() + "\nTiene acoplado: " + (tieneAcoplado ? "Sí" : "No");
    }


}
