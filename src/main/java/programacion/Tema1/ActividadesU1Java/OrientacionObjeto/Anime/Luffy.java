package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

public class Luffy extends PersonajeAnime{
    public Luffy(String nombre) {
        super(nombre);
    }

    private String fruta;
    private boolean estaAgua;

    void reir(){
        System.out.println("Reir");
    }

    @Override
    public String toString() {
        return "Luffy{" +
                "fruta='" + fruta + '\'' +
                ", estaAgua=" + estaAgua +
                ", nombre='" + getNombre() + '\'' +
                ", serie=" + getSerie() +
                ", edad=" + getEdad() +
                ", transformacion=" + getTransformacion() +
                '}';
    }
}
