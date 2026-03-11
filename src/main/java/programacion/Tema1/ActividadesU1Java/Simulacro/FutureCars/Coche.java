package programacion.Tema1.ActividadesU1Java.Simulacro.FutureCars;

import java.util.Objects;

public class Coche {

    private String marca;
    private String modelo;
    private String matricula;
    private Conductor duenio;
    private Sensor sensor;
    private Estado estado;

    public Coche(String marca, String modelo, String matricula,
                 Conductor duenio, Sensor sensor) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.duenio = duenio;
        this.sensor = sensor;
        this.estado = Estado.APAGADO;
    }

    public Estado getEstado() {
        return estado;
    }

    public void arrancar(Conductor conductor) {

        if (!conductor.equals(duenio)) {
            System.out.println("Solo el dueño puede arrancar el coche");
            return;
        }

        estado = Estado.ARRANCADO;
        System.out.println("Coche arrancado");
    }

    public void apagar(){
        if (estado==Estado.ARRANCADO){
            estado=Estado.APAGADO;
            System.out.println("El coche se ha apagado");
        }
        else{
            System.out.println("El coche ya se encuentra apagado");
        }
    }

    public void verificarDebeParar() {

        while (estado == Estado.ARRANCADO) {

            if (sensor.obstaculoCercano()) {
                System.out.println("Obstáculo cercano detectado. El coche se detiene.");
                estado = Estado.APAGADO;
            }

            else{
                estado=Estado.ARRANCADO;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coche)) return false;
        Coche coche = (Coche) o;
        return matricula.equals(coche.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}