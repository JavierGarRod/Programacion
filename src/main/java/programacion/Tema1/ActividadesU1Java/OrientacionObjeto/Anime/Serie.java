package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

import java.util.Objects;

public class Serie{
    private String nombre;
    private int numTemporada;
    private int numCap;
    private String autor;

    public Serie(String nombre, String autor) {
        this.nombre = nombre;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nombre='" + nombre + '\'' +
                ", numTemporada=" + numTemporada +
                ", numCap=" + numCap +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nombre, serie.nombre) && Objects.equals(autor, serie.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, autor);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public int getNumCap() {
        return numCap;
    }

    public void setNumCap(int numCap) {
        this.numCap = numCap;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
