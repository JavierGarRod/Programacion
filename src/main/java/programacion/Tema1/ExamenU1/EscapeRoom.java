package programacion.Tema1.ExamenU1;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class EscapeRoom {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        EscapeRoom referencia=new EscapeRoom();
        String opcion="";
        int[] codigoNumerico=new int[5];
        String[] estadoSala=new String[5];
        do{
            opcion=referencia.pintoMenu(sc);
            if(opcion.equals("G")){
                referencia.generarPartida(codigoNumerico, estadoSala,random);
            }else if(opcion.equals("A")){
                referencia.abrirSala(codigoNumerico, estadoSala, sc, referencia);
            }
            else if(opcion.equals("E")){
                referencia.estadoEscapeRoom(estadoSala);
            }
        }while(!opcion.equals("S"));
        System.out.println("Saliendo...");
    }

    String pintoMenu(Scanner sc) {
        System.out.println("G) Generar partida:");
        System.out.println("A) Intentar abrir una sala:");
        System.out.println("E) Estado del Escape Room:");
        System.out.println("S) Salir:");
        System.out.println("Introduce una opcion: ");
        String opcion = sc.next().toUpperCase();

        return opcion;
    }

    void generarPartida(int[] codigoNumerico, String[] estadoSala,Random random){
        for(int i=0;i<5;i++){
            codigoNumerico[i]=random.nextInt(0,6);
            estadoSala[i]="BLOQUEADO";
        }
    }

    void estadoEscapeRoom(String[] estadoSala){
        int salaAbierta=0;
        int salaCerrada=0;
        int salaInvalidadas=0;

        for(int a=0;a<5;a++){
            if(estadoSala[a].equals("BLOQUEADO")){
                salaCerrada++;
            }
            else if(estadoSala[a].equals("ABIERTO")){
                salaAbierta++;
            }
            else{
                salaInvalidadas++;
            }
        }
        System.out.println("Numero de salas abiertas: "+salaAbierta);
        System.out.println("Numero de salas bloqueadas: "+salaCerrada);
        System.out.println("Numero de salas invalidadas: "+salaInvalidadas);
        for(int i=0;i<5;i++){
            if(estadoSala[i].equals("BLOQUEADA")){
                System.out.println("Sala "+i+": "+estadoSala[i]);
            }
            else if(estadoSala[i].equals("ABIERTA")){
                System.out.println("Sala "+i+": "+estadoSala[i]);
            }
            else{
                System.out.println("Sala "+i+": "+estadoSala[i]);
            }
        }
    }

    void abrirSala(int[] codigoNumerico, String[] estadoSala, Scanner sc, EscapeRoom referencia){
        System.out.println("Introduce una sala (0 al 4): ");
        int opcion = sc.nextInt();

        if(opcion<0 || opcion>=5){
            System.out.println("Introduce un num del 0 al 4");
        }
        else{
            referencia.conceptoJuego(opcion, estadoSala, codigoNumerico, sc);
        }
    }

    void conceptoJuego(int opcion, String[] estadoSala, int[] codigoNumerico, Scanner sc){
        if (estadoSala[opcion].equals("ABIERTO")){
            System.out.println("La sala "+opcion+" ya ha sido abierta");
        }
        else if(estadoSala[opcion].equals("INVALIDADA")){
            System.out.println("La sala "+opcion+" ya ha sido invalidada y ya no puedes completar el juego");
        }
        else{
            System.out.println("Introduce el código numérico de la sala: ");
            int codNum = sc.nextInt();
            int intento=0;
            if (codNum==codigoNumerico[opcion]){
                System.out.println("Código correcto. Sala "+opcion+" desbloqueada");
                estadoSala[opcion]="ABIERTO";
            }
            else{
                System.out.println("Código incorrecto. Intentalo de nuevo");
                intento++;
            }
            if(intento==3){
                estadoSala[opcion]="INVALIDADA";
            }
        }
    }


}
