package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.DronesReparto;

public class Dron {
    // atributos
    String identificador;
    EstadoDron estado; //  “Este dron tiene un estado, y ese estado solo puede ser uno de los valores del enum EstadoDron.”
    int bateria;
    double cargaMaxima; // porcentaje
    PaqueteRuta rutaAsignada;


    public Dron(String identificador, double cargaMaxima) {
        this.identificador = identificador;
        this.cargaMaxima = cargaMaxima;
        this.bateria = 100;
        this.estado = EstadoDron.EN_REPOSO;
    }

    public boolean asignarRuta(PaqueteRuta rutaAsignada) {
        if (estado == EstadoDron.EN_REPOSO) {
            this.rutaAsignada = rutaAsignada;
            this.estado = EstadoDron.EN_RUTA;
            rutaAsignada.cambiarEstado(EstadoPaquete.EN_REPARTO);
            return true;
        }
        else{
            System.out.println("No se puede asignar ruta al dron " + identificador + " porque no está en reposo.");
            return false;
        }
    }

    public void cargarBateria() {
        this.bateria = 100;
        this.estado = EstadoDron.CARGANDO;
    }

    @Override public String toString() {
        return "Dron{" +
                "identificador='" +
                identificador + '\'' +
                ", estado=" + estado +
                ", bateria=" + bateria +
                ", cargaMaxima=" +
                cargaMaxima +
                ", rutaAsignada=" +
                rutaAsignada +
                '}';
    }
}