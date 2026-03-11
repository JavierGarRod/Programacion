package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio1.controller;

import programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio1.modelos.Cliente;
import programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio1.modelos.CuentaBancaria;

import java.time.LocalDate;

public class GestionaCuentas {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Ana", "López", "11111111A");
        Cliente c2 = new Cliente("Luis", "Martín", "22222222B");
        Cliente c3 = new Cliente("Marta", "Gómez", "33333333C");

        CuentaBancaria cuenta1 = new CuentaBancaria(1500, LocalDate.now(), "ES1234567890", c1, c2);

        CuentaBancaria cuenta2 = new CuentaBancaria(2500, LocalDate.now(), "ES0987654321", c2, null);

        CuentaBancaria cuenta3 = new CuentaBancaria(500, LocalDate.now(), "ES5555555555", c3, c1);

        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}

