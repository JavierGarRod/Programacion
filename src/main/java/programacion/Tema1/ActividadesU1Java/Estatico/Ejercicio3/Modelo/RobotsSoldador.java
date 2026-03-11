package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio3.Modelo;

public class RobotsSoldador extends Robots{
    private double temperatura;
    private String seguridad;

    public RobotsSoldador(String modelo, double bateria, Estado estado, double combustible, String descripcion, double temperatura, String seguridad) {
        super(modelo, bateria, estado, combustible, descripcion);
        this.temperatura = temperatura;
        this.seguridad = seguridad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public void ejecutarTarea() {
        System.out.println("Soldaduras precisas");
    }

    @Override
    public boolean recargar() {
        if(estado.equals("APAGADO")){
            System.out.println("Recargando por electricidad");
            return true;
        }
        else{
            System.out.println("Estoy encendido y no puedo recargar");
            return true;
        }
    }

    @Override
    public String toString() {
        return "RobotsSoldador{" +
                "temperatura=" + getTemperatura() +
                ", seguridad='" + getSeguridad() + '\'' +
                ", estado=" + getEstado() +
                ", id=" + getId() +
                ", modelo='" + getModelo() + '\'' +
                ", bateria=" + getBateria() +
                ", estado=" + getEstado() +
                ", combustible=" + getCombustible() +
                ", descripcion='" + getDescripcion() + '\'' +
                '}';
    }
}
