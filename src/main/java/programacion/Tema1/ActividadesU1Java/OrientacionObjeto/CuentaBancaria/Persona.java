package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.CuentaBancaria;

public class Persona {
    private String dni;
    private String nombre;
    private String apellidos;
    private int fechaNacimiento;

    int añoActual=2026;
    boolean esMayorEdad(int fechaNacimiento, int añoActual){
        if(añoActual-fechaNacimiento>=18){
            return true;
        }
        else{
            return false;
        }
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
