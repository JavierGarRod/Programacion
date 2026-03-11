package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Boletin2;

public class Caballero extends Personaje {

    public Caballero(String nombre) {
        super(nombre,"Espada");
    }

    @Override
    public boolean esAtacado(Personaje atacante) {

        if (atacante instanceof Mago) return true;
        if (atacante instanceof Arquero) return true; // sin distancia = permitido
        return false;
    }

    @Override
    public boolean esAtacado(Personaje atacante, int distancia) {

        if (atacante instanceof Mago) return true;

        if (atacante instanceof Arquero && distancia > 100) {
            return true;
        }

        return false;
    }
}