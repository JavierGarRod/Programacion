package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public abstract class Ave  extends Mascotas {
    private String pico;

    public Ave(String nombre, int edad, LocalDate fechaNacimiento, String pico) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
    }

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "pico='" + getPico() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", edad=" + getEdad() +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", "+ this.getClass().getSimpleName()+
                '}';
    }

    public abstract boolean volar();
}
