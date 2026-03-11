package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.DronesReparto;

public class PaqueteRuta {
    // atributos
    String origen;
    String destino;
    double peso;
    EstadoPaquete estado;

    // constructor
    public PaqueteRuta(String origen, String destino, double peso) {
        this.origen = origen;
        this.destino = destino;
        this.peso = peso;
        this.estado = EstadoPaquete.EN_PREPARACION; // Cuando se crea una ruta, el paquete siempre empieza en EN_PREPARACION.
    }

    // métodos
    public void cambiarEstado(EstadoPaquete nuevoEstado) {
        this.estado = nuevoEstado;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" +
                origen + '\'' +
                ", destino='" +
                destino + '\'' +
                ", peso=" + peso +
                ", estado=" +
                estado +
                '}';
    }
}