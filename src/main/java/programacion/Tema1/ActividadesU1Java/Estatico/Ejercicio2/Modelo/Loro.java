package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public class Loro extends Ave {
    private String origen;

    public Loro(String nombre, int edad, LocalDate fechaNacimiento, String pico, String origen) {
        super(nombre, edad, fechaNacimiento, pico);
        this.origen = origen;
    }

    @Override
    public boolean volar() {
        return true;
    }

    @Override
    public boolean habla() {
        return true;
    }

    @Override
    public String toString() {
        return "Loro{" +
                "origen='" + origen + '\'' +
                ", pico='" + getPico() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", fechaNacimiento=" + getFechaNacimiento() +
                '}';
    }
}
