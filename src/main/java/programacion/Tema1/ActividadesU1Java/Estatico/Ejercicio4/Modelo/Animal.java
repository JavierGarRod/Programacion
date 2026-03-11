package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio4.Modelo;

import java.util.Arrays;

public abstract class Animal {
    private String nombre;
    private String habitat;
    private Animal[] come;
    private Animal[] esComido;

    public Animal(String nombre, String habitat, Animal[] come, Animal[] esComido) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.come = new Animal[10];
        this.esComido = new Animal[10];
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Animal[] getCome() {
        return come;
    }

    public void setCome(Animal[] come) {
        this.come = come;
    }

    public Animal[] getEsComido() {
        return esComido;
    }

    public void setEsComido(Animal[] esComido) {
        this.esComido = esComido;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + getNombre() + '\'' +
                ", habitat='" + getHabitat() + '\'' +
                ", come=" + Arrays.toString(getCome()) +
                ", esComido=" + Arrays.toString(getEsComido()) +
                '}';
    }

    public abstract boolean atacar(Animal a);
    public abstract boolean huir(Animal a);
}
