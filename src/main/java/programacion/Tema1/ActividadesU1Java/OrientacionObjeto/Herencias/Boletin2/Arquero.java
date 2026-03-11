package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Boletin2;

public class Arquero extends Personaje {

    public Arquero(String nombre) {
        super(nombre, "Arco");
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        if (atacante instanceof Mago) return true;
        if (atacante instanceof Caballero) return false; // sin distancia no puede
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        if (atacante instanceof Mago) return true;

        if (atacante instanceof Caballero && distancia < 50) {
            return true;
        }

        return false;
    }
}