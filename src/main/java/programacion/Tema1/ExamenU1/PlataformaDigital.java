package programacion.Tema1.ExamenU1;

import java.util.Arrays;
import java.util.Scanner;

public class PlataformaDigital {
    static void main() {
        Scanner sc = new Scanner(System.in);
        PlataformaDigital referencia=new PlataformaDigital();
        String[]usuario={"alex","bea","carlos","dani","elena","fran","laura","pablo","sofia","admin"};
        String[]contrasena={"netflix23","hbo_pass","prime99","disneyPlus1","movistar22","sky_77","atresPlayer","filmin88","stream2024","root"};
        String datos="alex@netflix23@;bea@hbo_pass@;carlos@prime99@;dani@disneyPlus1@;elena@movistar22@;fran@sky_77@;laura@atresPlayer@;pablo@filmin88@;sofia@stream2024@;admin@root@;";
        //String[] usuCon= referencia.GestionaPlataforma(datos);
        System.out.println("Introduce un nombre: ");
        String nombre = sc.next().toLowerCase();
        referencia.verificaion(sc,"Carlos", "clave");
        referencia.verificaion(sc,"Carla", "clave");
        referencia.verificaion(sc,"Carlos", "prime99");
    }
    //APARTADO1
    String[] GestionaPlataforma(String datos){
        String[] datosSeparados=new String[10];
        datosSeparados=datos.split(";");
        String[] datosSeparados2=new String[10];
        for(int i=0;i< datosSeparados.length;i++){
            datosSeparados2[i]= Arrays.toString(datosSeparados[i].split("@"));
        }
        return datosSeparados2;
    }

    //APARTADO2
    int encontrarNombre(String[] usuario, Scanner sc, boolean encontrado){
        System.out.println("Introduce un nombre: ");
        String nombre = sc.next().toLowerCase();
        int b=0;
        while (b < usuario.length && !encontrado) {
            if (nombre.equals(usuario[b])){
                System.out.println(b);
                encontrado = true;
            } else {
                b++;
            }
        }
        if(!encontrado){
            System.out.println("-1");
        }
        return b;
    }

    //APARTADO3
    void verificaion(Scanner sc, String nombre, String contrasena){
        boolean encontrado=true;
        if(encontrado){
            System.out.println("Introduce la contraseña: ");
            String contraseña = sc.next().toLowerCase();
            int b=0;
            /*while (b < contrasena.length && !encontrado) {
                if (contrasena.equals(contrasena[b])){
                    System.out.println(b);
                    encontrado = true;
                    System.out.println(encontrado);
                } else {
                    b++;
                }
            }
            if(!encontrado){
                System.out.println(encontrado);
            }*/
        }

    }


}
