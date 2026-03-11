package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo;

import java.time.LocalDate;

public abstract class Mascotas {
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;

    //Constructores

    public Mascotas(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento=" + fechaNacimiento + ", "+
                this.getClass().getSimpleName()+
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Mascotas)) return false;
        Mascotas m = (Mascotas) obj;
        return this.nombre.equals(m.nombre) &&
                this.edad == m.edad &&
                this.getClass().equals(m.getClass());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Métodos

    public abstract boolean habla(); // Solo los loros devuelven true
}