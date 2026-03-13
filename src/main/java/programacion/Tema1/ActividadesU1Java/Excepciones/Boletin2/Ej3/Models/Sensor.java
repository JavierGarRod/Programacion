package programacion.Tema1.ActividadesU1Java.Excepciones.Boletin2.Ej3.Models;

import programacion.Tema1.ActividadesU1Java.Excepciones.Boletin2.Ej3.Exception.SensorException;

import java.time.LocalDate;

public class Sensor {
    private int id;
    Parametros parametros;
    private double max;
    private double min;
    private Lectura[] historial;
    static int contador=0;
    static int contadorLectura=0;

    public Sensor(int id, Parametros parametros, double max, double min, Lectura[] historial) {
        this.id = contador++;
        this.parametros = parametros;
        this.max = max;
        this.min = min;
        this.historial = historial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Parametros getParametros() {
        return parametros;
    }

    public void setParametros(Parametros parametros) {
        this.parametros = parametros;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public Lectura[] getHistorial() {
        return historial;
    }

    public void setHistorial(Lectura[] historial) {
        this.historial = historial;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Sensor.contador = contador;
    }

    public void registrarLectura(LocalDate horaYfecha, double cantidad) throws SensorException {
        if(!validarHoraYFecha(horaYfecha)){
            throw new SensorException("La fecha de la lectura no es válida");
        }

        boolean anomala=false;
        if(cantidad>max || cantidad<min){
            anomala=true;
        }

        historial[contadorLectura]=new Lectura(cantidad, horaYfecha, anomala);
        contadorLectura++;
    }

    private boolean validarHoraYFecha(LocalDate horaYfecha){
        boolean valido=false;
        if(historial[contadorLectura].getHoraYfecha().isAfter(horaYfecha)){
            valido=true;
        }
        return valido;
    }
}
