package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.RobotLimpieza;

public class GestionaRobot {
    public static void main(String[] args) {

        // Crear habitaciones
        Habitacion h1 = new Habitacion("Oficina", 30, 50);
        Habitacion h2 = new Habitacion("Sala reuniones", 45, 70);
        Habitacion h3 = new Habitacion("Pasillo", 20, 30);

        // Crear robots
        Robot r1 = new Robot("R-01", ModoFuncionamiento.AUTO, 80);
        Robot r2 = new Robot("R-02", ModoFuncionamiento.MANUAL, 60);

        // Asignar habitaciones
        r1.asignarHabitacion(h1);
        r1.asignarHabitacion(h2); // ya está ocupada por r1

        // Cambiar estados
        r2.setModo(ModoFuncionamiento.ERROR);

        // Intentar asignar habitación a robot que no está en AUTO
        r2.asignarHabitacion(h3);
    }
}
