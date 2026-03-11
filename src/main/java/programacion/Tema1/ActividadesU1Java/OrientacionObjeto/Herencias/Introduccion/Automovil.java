package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Introduccion;

public class Automovil extends Vehiculo{
    private int calificacionEcológica;

    public void automovil(String dueño, int numPuertas, int numRuedas){
        System.out.println("Entro en automovil");
    }

    public Automovil(String dueño, String ciudad, String tipo, int calificacionEcológica) {
        super(dueño, ciudad, tipo);
        this.calificacionEcológica = calificacionEcológica;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "calificacionEcológica='" + calificacionEcológica + '\'' +
                '}';
    }
}
