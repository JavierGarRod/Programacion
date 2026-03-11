package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Ej2Planeta;

import java.util.Objects;

public class Astro {

    // Atributos comunes
    private String nombre;
    private double masa;
    private double diametroMedio;
    private double periodoRotacion;     // horas
    private double periodoTraslacion;   // horas
    private double distanciaMedia;      // distancia al cuerpo que orbitan

    // Constructor


    public Astro(String nombre, double masa, double diametroMedio) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametroMedio = diametroMedio;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(double periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public void muestra() {
        System.out.println(this.toString());
        System.out.println("Periodo de rotación: " + periodoRotacion + " h");
        System.out.println("Periodo de traslación: " + periodoTraslacion + " h");
        System.out.println("Distancia media: " + distanciaMedia);
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return "Astro: " + nombre +
                " | Masa: " + masa +
                " | Diámetro: " + diametroMedio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Astro astro = (Astro) o;
        return true;
    }
}