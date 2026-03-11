package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Boletin2;

public abstract class Personaje {

    private String nombre;
    private String arma;

    public Personaje(String nombre, String arma) {
        this.nombre = nombre;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    // Sobrecarga
    public abstract boolean esAtacado(Personaje atacante);

    public abstract boolean esAtacado(Personaje atacante, int distancia);

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + getNombre() + '\'' +
                ", arma='" + getArma() + '\'' +
                '}';
    }
}