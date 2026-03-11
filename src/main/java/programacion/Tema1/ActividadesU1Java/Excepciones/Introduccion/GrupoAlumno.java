package programacion.Tema1.ActividadesU1Java.Excepciones.Introduccion;

public class GrupoAlumno {
    private String[] nombre;
    private String[] apellidos;

    public GrupoAlumno(String[] nombre, String[] apellidos) throws NullPointerException, ClassNotFoundException {
        this.setNombre(nombre);
        this.setApellidos(apellidos);
    }

    public GrupoAlumno() {
        nombre=new String[20];
        apellidos=new String[20];
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) throws ClassCastException {
        if(nombre.length>20){
            throw new ClassCastException("Llegan más de 20 nombres");
        }
        System.out.println("Llego a asignacion de nombre");
        this.nombre = nombre;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) throws ClassNotFoundException {
        if(apellidos.length>20){
            throw new ClassNotFoundException("Llegan más de 20 apellidos");
        }
        this.apellidos = apellidos;
    }
}
