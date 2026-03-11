package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Ej2Planeta;

import java.util.ArrayList;
import java.util.List;

public class Planeta extends Astro {

    private List<Satelite> satelites;

    public Planeta(String nombre, double masa, double diametroMedio) {
        super(nombre, masa, diametroMedio);
        this.satelites = new ArrayList<>();
    }

    public void addSatelite(Satelite s) {
        satelites.add(s);
    }

    @Override
    public void muestra() {
        super.muestra();
        if (satelites.isEmpty()) {
            System.out.println("No tiene satélites.");
        } else {
            System.out.println("Satélites:");
            for (Satelite s : satelites) {
                System.out.println("  - " + s.getNombre());
            }
        }
    }

    @Override
    public String toString() {
        return "Planeta: " + getNombre() +
                " | Masa: " + getMasa() +
                " | Diámetro: " + getDiametroMedio();
    }
}

