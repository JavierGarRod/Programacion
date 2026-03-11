package programacion.Tema1.ActividadesU1Java.Simulacro.FutureCars;

public class Sensor {

    private double distanciaObstaculo;
    private double velocidad;

    public Sensor(double distanciaObstaculo, double velocidad) {
        this.distanciaObstaculo = distanciaObstaculo;
        this.velocidad = velocidad;
    }

    public void setDistanciaObstaculo(double distanciaObstaculo) {
        this.distanciaObstaculo = distanciaObstaculo;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean obstaculoCercano() {
        return distanciaObstaculo < 50;
    }

    public boolean excesoVelocidad() {
        return velocidad > 120;
    }
}