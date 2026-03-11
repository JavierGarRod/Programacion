package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

public class Goku extends PersonajeAnime{
    public Goku(String nombre) {
        super(nombre);
    }

    private boolean estaVivo;

    public void volar(){
        System.out.println("Volando");
    };
    public void obtenerEnergiaVital(){
        System.out.println("Obteniendo energía vital");
    }
    public void teletransportarse(){
        System.out.println("Teletransportándose");
    }
}
