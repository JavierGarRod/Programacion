package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio1.modelos;

import java.time.LocalDate;

public class CuentaBancaria {

    public static int contadorIds;
    private int id;
    private double saldo;
    private LocalDate fechaApertura;
    private String iban;
    private Cliente titular;
    private Cliente autorizado;

    public CuentaBancaria(double saldo, LocalDate fechaApertura, String iban,
                          Cliente titular, Cliente autorizado) {

        this.id = contadorIds++;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
        this.iban = iban;
        this.titular = titular;
        this.autorizado = autorizado;
    }

    public static int getContadorIds() {
        return contadorIds;
    }

    public static void setContadorIds(int contadorIds) {
        CuentaBancaria.contadorIds = contadorIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Cliente autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                ", iban='" + iban + '\'' +
                ", titular=" + titular +
                ", autorizado=" + (autorizado != null ? autorizado : "Ninguno") +
                '}';
    }
}

