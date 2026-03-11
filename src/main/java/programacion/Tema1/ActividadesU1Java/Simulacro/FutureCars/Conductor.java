package programacion.Tema1.ActividadesU1Java.Simulacro.FutureCars;

public class Conductor {

    private String nombre;
    private int aniosExperiencia;

    public Conductor(String nombre, int aniosExperiencia) {
        this.nombre = nombre;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void conducir() {
        System.out.println(nombre + " conduciendo");
    }
}