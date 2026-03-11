package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public class Perro extends Mascotas {
    private String raza;
    private boolean tienePulgas;

    public Perro(String nombre, int edad, LocalDate fechaNacimiento, String raza, boolean tienePulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.tienePulgas = tienePulgas;
    }

    @Override
    public boolean habla() { return false; }

    @Override
    public String toString() {
        return super.toString() + ", Raza: " + raza + ", Pulgas: " + tienePulgas;
    }
}