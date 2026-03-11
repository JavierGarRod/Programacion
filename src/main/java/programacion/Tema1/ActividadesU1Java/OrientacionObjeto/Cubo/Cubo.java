package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Cubo;

public class Cubo {
    double lado;            // en decímetros
    double litrosActuales;  // litros dentro del cubo

    public Cubo(double lado) {
        this.lado = lado;
        this.litrosActuales = 0;
    }

    // Área total del cubo
    public double areaTotal() {

        return 6 * lado * lado; // 6 lados
    }

    // Volumen en litros (1 dm^3 = 1 litro)
    public double volumen() {

        return lado * lado * lado;
    }

    // Rellenar el cubo
    public boolean rellenar(double litros) {
        if (litrosActuales + litros <= volumen()) {
            litrosActuales += litros;
            return true;
        }
        return false;
    }

    // Vaciar el cubo
    public boolean vaciar(double litros) {
        if (litrosActuales >= litros) {
            litrosActuales -= litros;
            return true;
        }
        return false;
    }
}
