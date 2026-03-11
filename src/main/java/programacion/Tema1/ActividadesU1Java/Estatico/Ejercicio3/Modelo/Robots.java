package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio3.Modelo;

public abstract class Robots {
    private static int id;
    private String modelo;
    private double bateria;
    Estado estado;
    private double combustible;
    private String descripcion;
    private static int contador;

    public Robots(String modelo, double bateria, Estado estado, double combustible, String descripcion) {
        this.id = contador++;
        this.modelo = modelo;
        this.bateria = bateria;
        this.estado = estado;
        this.combustible = combustible;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Robots{" +
                "id: " + getId() +
                ", nombre: "+ this.getClass().getSimpleName()+
                ", estado: " + getEstado()+
                ", bateria: " + getBateria()+
                "}";
    }

    public boolean suficienteBateria(){
        if(bateria>10){
            return true;
        }
        else{
            return false;
        }
    }
    abstract void ejecutarTarea();
    abstract boolean recargar();
}
