package programacion.Tema1.ActividadesU1Java.Simulacro.EmpleadoEmpresa;

public class JefeDepartamento extends Empleado{
    private int antiguedad;

    public JefeDepartamento(String dni, String nombre, int sueldo, int antiguedad) {
        super(dni, nombre, sueldo);
        this.antiguedad = antiguedad;
    }

    @Override
    public int setSueldo() {
        return 0;
    }
}