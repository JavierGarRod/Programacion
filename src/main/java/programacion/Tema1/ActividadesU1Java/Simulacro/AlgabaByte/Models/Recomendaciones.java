package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;

public class Recomendaciones extends Mensaje{
    public Recomendaciones(String contenido, Usuario autor) throws UserMemoryException {
        super(contenido, autor);
    }

    @Override
    protected void validarContenido(String contenido) throws UserMemoryException {
        if (contenido == null || contenido.length() < 100 || contenido.length() > 200) {
            throw new UserMemoryException("La recomendación debe tener entre 100 y 200 caracteres");
        }
    }
}
