package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;

import java.time.LocalDate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Mensaje {
    private static long nextId = 1;

    protected long id;
    protected String contenido;
    protected LocalDateTime fechaCreacion;
    protected Usuario autor;
    protected List<Valoracion> valoraciones;
    protected int lecturas;

    public Mensaje(String contenido, Usuario autor) throws UserMemoryException {
        this.id = nextId++;
        this.autor = autor;
        this.fechaCreacion = LocalDateTime.now();
        this.valoraciones = new ArrayList<>();
        this.lecturas = 0;
        validarContenido(contenido);
        this.contenido = contenido;
    }

    public Mensaje() {

    }

    protected abstract void validarContenido(String contenido) throws UserMemoryException;

    public long getId() {
        return id;
    }

    public Usuario getAutor() {
        return autor;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public String getContenido() {
        return contenido;
    }

    public int getLecturas() {
        return lecturas;
    }

    public void valorar(Valoracion v) {
        this.valoraciones.add(v);
        this.lecturas++;
    }

    public int getPuntuacion() {
        int base = valoraciones.stream().mapToInt(Valoracion::getPuntos).sum();
        // Por defecto, sin multiplicador; se sobreescribe en Tweet
        return base;
    }

    public String getTipo() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "[" + id + "] (" + getTipo() + ") " + autor + " - " +
                fechaCreacion + " - \"" + contenido + "\" - Puntos: " + getPuntuacion();
    }
}