package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public class Canario extends Ave{
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, LocalDate fechaNacimiento, String pico) {
        super(nombre, edad, fechaNacimiento, pico);
    }

    @Override
    public boolean volar() {
        return false;
    }

    @Override
    public boolean habla() {
        return false;
    }

    public void muestra(){};
}
