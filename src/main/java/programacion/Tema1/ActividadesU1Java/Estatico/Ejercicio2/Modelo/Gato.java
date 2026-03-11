package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public class Gato extends Mascotas {
    public Gato(String nombre, int edad, LocalDate fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
    }

    @Override
    public boolean habla() { return false; }
}

