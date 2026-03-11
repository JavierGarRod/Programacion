package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Ej1Pokemon;

import java.util.Arrays;

public class Pokemons2 {
    String nombre;
    String tipo;
    int nivelVida;
    Pokemons2[] evolucion;

    public Pokemons2(String nombre, String tipo, int nivelVida, Pokemons2[] evolucion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivelVida = nivelVida;
        this.evolucion = evolucion;
    }

    public Pokemons2() {
        this.nombre = "";
        this.tipo = "";
        this.nivelVida = 0;
        this.evolucion = new Pokemons2[10];
    }

    @Override
    public String toString() {
        return "Pokemons2{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", nivelVida=" + nivelVida +
                ", evolucion=" + evolucion +
                '}';
    }

    boolean luchar(){
        return true;
    }

    void evolucionar(){
        System.out.println("Evolucionando");
    }
}
