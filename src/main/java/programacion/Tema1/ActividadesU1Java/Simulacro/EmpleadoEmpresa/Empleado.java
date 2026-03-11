package programacion.Tema1.ActividadesU1Java.Simulacro.EmpleadoEmpresa;

public abstract class Empleado {
    private String dni;
    private String nombre;
    protected int sueldo;

    public Empleado(String dni, String nombre, int sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo=setSueldo();
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public abstract int setSueldo();

    @Override
    public String toString() {
        return "Empleado{" +
                "dni='" + getDni() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", sueldo=" + getSueldo() +
                '}';
    }
}