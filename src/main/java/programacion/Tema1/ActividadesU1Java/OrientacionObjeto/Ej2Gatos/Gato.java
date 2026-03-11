package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Ej2Gatos;

public class Gato {
    String color;
    String raza;
    String sexo;
    int edad;
    float peso;

    public Gato(String color, String raza, String sexo, int edad, float peso) {
        this.color = color;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }

    public Gato() {
        this.color = "";
        this.raza = "";
        this.sexo = "";
        this.edad = 0;
        this.peso = 0;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    boolean maulla(){
        return false;
    }
    boolean ronea(){
        return false;
    }
    boolean come(String comida){
        return false;
    }
    boolean pelear(Gato contrincante){
        return false;
    }
}
