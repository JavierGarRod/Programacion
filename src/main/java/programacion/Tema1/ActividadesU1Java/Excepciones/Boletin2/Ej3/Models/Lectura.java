package programacion.Tema1.ActividadesU1Java.Excepciones.Boletin2.Ej3.Models;

import java.time.LocalDateTime;

public class Lectura {
    private double cantidad;
    private LocalDateTime horaYfecha;
    private boolean anomala;

    public Lectura(double cantidad, LocalDateTime horaYfecha, boolean anomala) {
        this.cantidad = cantidad;
        this.horaYfecha = horaYfecha;
        this.anomala = anomala;
    }

    public double getCantidad() {
        return cantidad;
    }

    public LocalDateTime getHoraYfecha() {
        return horaYfecha;
    }

    public boolean isAnomala() {
        return anomala;
    }
}
