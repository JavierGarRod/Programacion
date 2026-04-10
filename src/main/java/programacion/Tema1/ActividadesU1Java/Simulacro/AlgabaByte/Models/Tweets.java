package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;

public class Tweets extends Mensaje{
    public Tweets(String contenido, Usuario autor) throws UserMemoryException {
        super(contenido, autor);
    }

    @Override
    protected void validarContenido(String contenido) throws UserMemoryException {
        if (contenido == null || contenido.length() == 0 || contenido.length() > 50) {
            throw new UserMemoryException("El tweet debe tener entre 1 y 50 caracteres");
        }
    }

    @Override
    public int getPuntuacion() {
        int base = super.valoraciones.stream().mapToInt(Valoracion::getPuntos).sum();
        return base * 2; // se valora el doble
    }
}
