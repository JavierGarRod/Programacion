package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Introduccion;

public class Camion extends Vehiculo {

    private int tonelajeKilos;        // Masa Máxima Autorizada
    private int numPasajeros;

    public Camion(String dueño, String tipo, String ciudad, int tonelajeKilos, int numPasajeros) {
        super(dueño, tipo, ciudad);
        this.tonelajeKilos = tonelajeKilos;
        this.numPasajeros = numPasajeros;
    }

    private String getLicencias() {
        if (tonelajeKilos > 3500 && tonelajeKilos <= 7500) {
            return "C1";
        } else if (tonelajeKilos > 7500) {
            return "C";
        } else {
            return "B"; // Vehículos ligeros
        }
    }

    @Override
    public String toString() {
        return "Camion{" +
                "tonelajeKilos=" + tonelajeKilos +
                ", numPasajeros=" + numPasajeros +
                '}';
    }
}