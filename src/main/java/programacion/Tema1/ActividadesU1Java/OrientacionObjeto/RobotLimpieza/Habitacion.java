package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.RobotLimpieza;

public class Habitacion {
    private String nombre;
    private double tamanio;
    private int nivelSuciedad;
    private EstadoHabitacion estado;

    public Habitacion(String nombre, double tamanio, int nivelSuciedad) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.nivelSuciedad = nivelSuciedad;
        this.estado = EstadoHabitacion.LIBRE;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + estado + ")";
    }
}