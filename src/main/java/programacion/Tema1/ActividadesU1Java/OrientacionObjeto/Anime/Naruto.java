package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

public class Naruto extends PersonajeAnime{
    public Naruto(String nombre) {
        super(nombre);
    }

    Elemento elemento;
    Aldea aldea;

    public void entrenar(){
        System.out.println("Entrenando");
    }

    public void crearClones(){
        System.out.println("Creando clones");
    }

    @Override
    public String toString() {
        return "Naruto{" +
                "elemento=" + elemento +
                ", aldea=" + aldea +
                '}';
    }
}
