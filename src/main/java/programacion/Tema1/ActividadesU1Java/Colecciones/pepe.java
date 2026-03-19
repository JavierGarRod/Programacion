package programacion.Tema1.ActividadesU1Java.Colecciones;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class pepe {
    static void main() {
        Set<Integer> arbol=new TreeSet<Integer>();
        Random r=new Random();
        while(arbol.size()<11){
            int num=r.nextInt(0,11);
            arbol.add(num);
        }
        System.out.println(arbol);
    }
}
