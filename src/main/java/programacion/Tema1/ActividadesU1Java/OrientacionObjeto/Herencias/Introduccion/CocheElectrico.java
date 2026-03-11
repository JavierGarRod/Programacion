package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Introduccion;

public class CocheElectrico extends Automovil {

    private String tipoBateria; // LFP o NCM

    public CocheElectrico(String dueño, String tipo, String ciudad, int calificacionEcológica) {
        super(dueño, tipo, ciudad, calificacionEcológica);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "tipoBateria='" + tipoBateria + '\'' +
                '}';
    }
}