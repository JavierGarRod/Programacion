package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Boletin2;

public class GestionaJuego {

    public static void main(String[] args) {

        Personaje villano = new Villano("Orco");
        Personaje caballero = new Caballero("Sir Arthur");
        Personaje arquero = new Arquero("Legolas");
        Personaje mago = new Mago("Gandalf");

        System.out.println("ARMAS:");
        System.out.println(villano.getNombre() + ": " + villano.getArma());
        System.out.println(caballero.getNombre() + ": " + caballero.getArma());
        System.out.println(arquero.getNombre() + ": " + arquero.getArma());
        System.out.println(mago.getNombre() + ": " + mago.getArma());

        System.out.println("ATAQUES SIN DISTANCIA:");
        System.out.println("Caballero ataca a Arquero: " + arquero.esAtacado(caballero));
        System.out.println("Mago ataca a Caballero: " + caballero.esAtacado(mago));
        System.out.println("Arquero ataca a Caballero: " + caballero.esAtacado(arquero));
        System.out.println("Todos atacan al Villano: " + villano.esAtacado(caballero));

        System.out.println("ATAQUES CON DISTANCIA:");
        System.out.println("Caballero a Arquero (30m): " + arquero.esAtacado(caballero, 30));
        System.out.println("Caballero a Arquero (80m): " + arquero.esAtacado(caballero, 80));
        System.out.println("Arquero a Caballero (150m): " + caballero.esAtacado(arquero, 150));
        System.out.println("Arquero a Caballero (50m): " + caballero.esAtacado(arquero, 50));
    }
}