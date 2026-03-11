package programacion.Tema1.ActividadesU1Java.Simulacro.incidencia.Modelo;/*package programacion.Tema1.ActividadesU1Java.Simulacro.Incidencias;

import java.time.LocalDate;

public class Incidente {
    private int idNum;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    Estado estado;
    Criticidad criticidad;
    Equipo equipo;

    public Incidente(int idNum, String nombre, LocalDate fechaInicio, LocalDate fechaFin, Estado estado, Criticidad criticidad, Equipo equipo) {
        this.idNum = idNum;
        this.nombre = nombre;
        setFechaInicio(fechaInicio);
        this.estado = estado;
        this.criticidad = criticidad;
        this.equipo = equipo;
        setFechaFin(fechaFin);
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        if(fechaInicio == null){
            this.fechaInicio=LocalDate.now();
        }
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        if(estado!=null && estado.equals("CERRADA")){
            this.fechaFin=fechaFin;
        }
        else{
            this.fechaFin=null;
        }
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Criticidad getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(Criticidad criticidad) {
        this.criticidad = criticidad;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Incidente{" + getNombre() +
                " - " + getEstado() +
                ": " + getCriticidad() +
                " - " + getFechaInicio()+
                " - " + getEquipo() +
                '}';
    }

    boolean esUrgente(Estado estado){
        if(estado.equals("CRITICA") || (estado.equals("GRAVE") && (fechaInicio-fechaFin>=7))|| estado.equals("MEDIA")){
            return true;
        }
        else{
            return false;
        }
    }
}*/
