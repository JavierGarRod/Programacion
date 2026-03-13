package programacion.Tema1.ActividadesU1Java.Excepciones.Boletin2.Ej3.Models;

import java.time.LocalDate;

public class Lectura {
    private double cantidad;
    private LocalDate horaYfecha;
    private boolean anomala;

    public Lectura(double cantidad, LocalDate horaYfecha, boolean anomala) {
        this.cantidad = cantidad;
        this.horaYfecha = horaYfecha;
        this.anomala = anomala;
    }

    public double getCantidad() {
        return cantidad;
    }

    public LocalDate getHoraYfecha() {
        return horaYfecha;
    }

    public boolean isAnomala() {
        return anomala;
    }
}
