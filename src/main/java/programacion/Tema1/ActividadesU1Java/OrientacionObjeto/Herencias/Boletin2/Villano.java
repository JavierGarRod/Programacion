package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Boletin2;

public class Villano extends Personaje {

    public Villano(String nombre) {
        super(nombre, "");
    }

    @Override
    public boolean esAtacado(Personaje atacante) {
        return true;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {
        return true;
    }
}