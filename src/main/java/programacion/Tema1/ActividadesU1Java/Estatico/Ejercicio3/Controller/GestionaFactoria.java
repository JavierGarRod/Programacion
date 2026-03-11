package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio3.Controller;

import src.programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio3.Modelo.*;

public class GestionaFactoria {
    static void main() {
        Robots[] inventarioRobots=new Robots[20];
        int contador=0;

        RobotsSoldador ro1=new RobotsSoldador("",40, Estado.APAGADO,20,"",731,"");
        ro1.ejecutarTarea();
        ro1.recargar();
        RobotsSoldador ro2=new RobotsSoldador("",10,Estado.ENCENDIDO,40,"",31,"");
        ro2.ejecutarTarea();
        ro2.recargar();
        RobotsSoldador ro3=new RobotsSoldador("",90,Estado.ENCENDIDO,70,"",71,"");
        ro3.ejecutarTarea();
        ro3.recargar();

        inventarioRobots[contador]=ro1;
        contador++;
        inventarioRobots[contador]=ro2;
        contador++;
        inventarioRobots[contador]=ro3;
        for(Robots m:inventarioRobots){
            System.out.println(m);
        }


    }
}
