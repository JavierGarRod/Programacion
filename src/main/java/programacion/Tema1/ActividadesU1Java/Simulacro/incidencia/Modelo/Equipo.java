package programacion.Tema1.ActividadesU1Java.Simulacro.incidencia.Modelo;

public class Equipo {
    private String nombre;
    private String direccionMAC;
    private String sistemaOperativo;
    private int numIncidente;

    public Equipo(String nombre, String direccionMAC, String sistemaOperativo, int numIncidente) {
        this.nombre = nombre;
        this.direccionMAC = direccionMAC;
        this.sistemaOperativo = sistemaOperativo;
        this.numIncidente = numIncidente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getNumIncidente() {
        return numIncidente;
    }

    public void setNumIncidente(int numIncidente) {
        this.numIncidente = numIncidente;
    }

    @Override
    public String toString() {
        return "Equipo{"+ getNombre() +
                " - " + getDireccionMAC() +
                ":" + getNumIncidente() +
                '}';
    }
}
