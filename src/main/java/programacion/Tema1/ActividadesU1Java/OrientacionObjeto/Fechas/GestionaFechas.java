package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Fechas;

import java.time.LocalDate;
import java.time.Month;


public class GestionaFechas {
    static void main() {
        LocalDate fechaExamen = LocalDate.of(2024, 5, 15);
        // Extraer partes de la fecha
        int anio = fechaExamen.getYear();
        Month mes = fechaExamen.getMonth(); // Devuelve un objeto Enum (MAY)
        int diaMes = fechaExamen.getDayOfMonth();
        // Día de la semana (Lunes, Martes...)
        String diaSemana = fechaExamen.getDayOfWeek().toString();

        System.out.println("Año:"+anio+" Mes:"+mes+" Dia:"+diaMes);
    }
}
