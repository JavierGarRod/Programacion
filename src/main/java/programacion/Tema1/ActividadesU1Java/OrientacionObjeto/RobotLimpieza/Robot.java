package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.RobotLimpieza;

public class Robot {
    private String identificador;
    private int nivelSuciedadDeposito;
    private ModoFuncionamiento modo;
    private int bateria;
    private Habitacion habitacionAsignada;

    public Robot(String identificador, ModoFuncionamiento modo, int bateria) {
        this.identificador = identificador;
        this.modo = modo;
        this.bateria = bateria;
        this.nivelSuciedadDeposito = 0;
    }

    public void asignarHabitacion(Habitacion h) {
        if (modo != ModoFuncionamiento.AUTO) {
            System.out.println("Robot " + identificador + " no está en modo AUTO");
            return;
        }

        if (h.getEstado() != EstadoHabitacion.LIBRE) {
            System.out.println("La habitación " + h.getNombre() + " no está libre");
            return;
        }

        this.habitacionAsignada = h;
        h.setEstado(EstadoHabitacion.LIMPIANDO);
        System.out.println("Robot " + identificador + " limpiando " + h.getNombre());
    }

    public void vaciarDeposito() {
        nivelSuciedadDeposito = 0;
    }

    public void recargar() {
        bateria = 100;
    }

    public void setModo(ModoFuncionamiento modo) {
        this.modo = modo;
    }
}
