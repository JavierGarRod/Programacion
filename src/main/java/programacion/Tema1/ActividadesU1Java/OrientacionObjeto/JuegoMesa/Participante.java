package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.JuegoMesa;

public class Participante {
    // atributos
    String nick;
    String nombre;
    int edad;
    int puntuacion;

    // constructor
    public Participante(String nick, String nombre, int edad, int puntuacion) {
        this.nick = nick;
        this.nombre = nombre;
        this.edad = edad;
        this.puntuacion = puntuacion;
    }

    //métodos


    @Override
    public String toString() {
        return "Participante{" +
                "nick='" + nick + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
