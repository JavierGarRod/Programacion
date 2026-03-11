package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Herencias.Introduccion;

public class Vehiculo {
    protected String dueño;
    protected int numPuertas;
    protected int numRuedas;
    protected String ciudad;
    protected String tipo;

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Vehiculo(String dueño, String ciudad, String tipo) {
        this.dueño = dueño;
        this.ciudad = ciudad;
        this.tipo = tipo;
    }

    public boolean tieneLicienciaParaCircular(String ciudad, String tipo){
        if((ciudad.equalsIgnoreCase("Madrid")||ciudad.equalsIgnoreCase("Barcelona")) && (tipo.equalsIgnoreCase("B") || tipo.equalsIgnoreCase("C"))){
            return true;
        }
        else if((ciudad.equalsIgnoreCase("Valencia") || ciudad.equalsIgnoreCase("Sevilla")) && tipo.equalsIgnoreCase("C")){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "dueño='" + getDueño() + '\'' +
                ", numPuertas=" + getNumPuertas() +
                ", numRuedas=" + getNumRuedas() +
                ", ciudad='" + getCiudad() + '\'' +
                ", tipo='" + getTipo() + '\'' +
                '}';
    }
}