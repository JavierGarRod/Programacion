package programacion.Tema1.ActividadesU1Java.Excepciones.Introduccion;

public class GestionaExcepciones {
    static void main() {
        try {
            GrupoAlumno grupo=new GrupoAlumno(new String[88], new String[88]);
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurre ClassNotFoundE"+e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Ocurre NullPointerE"+e.getMessage());
            throw e;
        }
        finally {
            System.out.println("Aqui entro siempre SOY UN FINALLY");
        }
        System.out.println("Sigo con mi tarea");
    }
}