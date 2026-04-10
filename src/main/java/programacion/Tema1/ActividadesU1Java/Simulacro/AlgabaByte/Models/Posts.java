package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;

public class Posts extends Mensaje{
    public Posts(String contenido, Usuario autor) throws UserMemoryException {
        super(contenido, autor);
    }

    @Override
    protected void validarContenido(String contenido) throws UserMemoryException {
        if (contenido == null || contenido.trim().isEmpty()) {
            throw new UserMemoryException("El post no puede estar en blanco");
        }
    }
}
