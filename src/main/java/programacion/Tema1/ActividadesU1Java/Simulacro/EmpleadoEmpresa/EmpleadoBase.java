package programacion.Tema1.ActividadesU1Java.Simulacro.EmpleadoEmpresa;

public class EmpleadoBase extends Empleado{
    TipoEmpleadoBase tipo;

    public EmpleadoBase(String dni, String nombre, int sueldo, TipoEmpleadoBase tipo) {
        super(dni, nombre, sueldo);
        this.tipo = tipo;
    }

    public TipoEmpleadoBase getTipo() {
        return tipo;
    }

    public void setTipo(TipoEmpleadoBase tipo) {
        this.tipo = tipo;
    }

    @Override
    public int setSueldo() {
        if (tipo.equals("ADMINISTRATIVO")){
            return this.sueldo=1150;
        }
        else if(tipo.equals("OPERARIO")){
            return this.sueldo=1100;
        }
        else{
            return this.sueldo=1350;
        }
    }
}
