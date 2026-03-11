package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Introduccion;

import java.util.Scanner;

public class GestionaPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona paula=new Persona(21, "Paula", "Cuenca", "Gimnasia Rítmica", "Avatar");
        System.out.println(paula.toString());
        paula.hablar();

        Persona pepe=new Persona();
        pepe.nombre="Pepe";
        System.out.println(pepe.toString());
        pepe.comer();


        NombreAsignatura n=NombreAsignatura.Programacion;
        String cadena=n.toString();
    }
}
