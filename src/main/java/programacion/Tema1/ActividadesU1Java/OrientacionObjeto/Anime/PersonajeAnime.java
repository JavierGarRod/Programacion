package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

import java.util.Objects;

public class PersonajeAnime {
    private String nombre;
    private Serie serie;
    private int edad;
    private Transformacion transformacion;

    public void comer(){
        System.out.println("Está comiendo");
    }
    public void atacar(){
        System.out.println("Está atacando");
    }
    public boolean transformar(PersonajeAnime personajeOrigen, PersonajeAnime personajeDestino){
        boolean transformacion=true;
        this.transformacion=new Transformacion(personajeDestino, personajeOrigen);

        return transformacion;
    }

    @Override
    public String toString() {
        return "PersonajeAnime{" +
                "nombre='" + nombre + '\'' +
                ", serie=" + serie +
                ", edad=" + edad +
                ", transformacion=" + transformacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeAnime that = (PersonajeAnime) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(serie, that.serie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, serie);
    }

    public PersonajeAnime(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Transformacion getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(Transformacion transformacion) {
        this.transformacion = transformacion;
    }
}
