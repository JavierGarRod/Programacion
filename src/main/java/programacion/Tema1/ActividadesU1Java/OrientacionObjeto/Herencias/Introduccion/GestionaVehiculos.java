package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Introduccion;

public class GestionaVehiculos {

    public static void main(String[] args) {

        // Automóviles
        Vehiculo cocheEco = new Automovil("1111AAA", "ECO", "Madrid", 5);
        Vehiculo cocheC = new Automovil("2222BBB", "C", "Sevilla", 3);

        System.out.println(cocheEco);
        System.out.println("Limitación Madrid: " + cocheEco.tieneLicienciaParaCircular(cocheEco.ciudad, cocheEco.tipo));

        System.out.println(cocheC);
        System.out.println("Limitación Sevilla: " + cocheC.tieneLicienciaParaCircular(cocheC.ciudad, cocheC.tipo));

        // Camiones
        Vehiculo camion1 = new Camion("3333CCC", "B", "Madrid", 500, 2);
        Vehiculo camion2 = new Camion("4444DDD", "C", "Valencia", 5000, 7);

        System.out.println(camion1);
        System.out.println(camion2);
    }
}