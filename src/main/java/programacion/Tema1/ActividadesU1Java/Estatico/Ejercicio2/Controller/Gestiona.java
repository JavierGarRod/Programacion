package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Controller;

import programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo.Loro;
import programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo.Mascotas;
import programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio2.Modelo.Perro;

import java.time.LocalDate;

public class Gestiona {
    public static void main(String[] args) {
        Mascotas[] tienda=new Mascotas[50];
        int numMascotas=0;

        Perro p=new Perro("Bobby", 3, LocalDate.of(2026,02,01) , "España", true);
        Loro l=new Loro("Paco", 2, LocalDate.of(2026,01,01),"", "Marruecos");
        tienda[numMascotas]=p;
        numMascotas++;
        tienda[numMascotas]=l;
        for(Mascotas m:tienda){
            System.out.println(m);
        }
    }
}