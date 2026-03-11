package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Introduccion;

import java.util.Objects;

public class Persona {

    //Atributos
    int edad;
    String nombre;
    String lugarNacimiento;
    String deporteFav;
    String peliFav;
    String dni;


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

    //Constructor
    //Constructor por parámetros
    public Persona(int edad, String nombre, String lugarNacimiento, String deporteFav, String peliFav) {
        this.edad = edad;
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.deporteFav = deporteFav;
        this.peliFav = peliFav;
    }

    //Constructor por defecto
    public Persona() {
        this.edad=0;
        this.nombre="";
        this.lugarNacimiento ="";
        this.deporteFav ="";
        this.peliFav ="";

    }

    //Metodos
    void hablar(){
        System.out.println("Hablando: "+nombre);
    }
    boolean aRobado(){
        return false;
    }
    void comer(){
        System.out.println("Comiendo: "+nombre);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", lugarNacimiento='" + lugarNacimiento + '\'' +
                ", deporteFav='" + deporteFav + '\'' +
                ", peliFav='" + peliFav + '\'' +
                '}';
    }
}