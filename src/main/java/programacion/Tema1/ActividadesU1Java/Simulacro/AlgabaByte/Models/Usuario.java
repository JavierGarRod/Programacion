package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.util.Objects;
import java.util.Optional;
public class Usuario implements Comparable<Usuario> {
    private String nombre;
    private String password;

    public Usuario(String nombre, String password) throws UserMemoryException {
        validarNombre(nombre);
        validarPassword(password);
        this.nombre = nombre;
        this.password = password;
    }

    private void validarNombre(String nombre) throws UserMemoryException {
        if (nombre == null || nombre.length() < 6) {
            throw new UserMemoryException("Usuario no es correcto");
        }
    }

    private void validarPassword(String password) throws UserMemoryException {
        if (password == null || password.length() < 8 ||
                !password.matches(".*[A-Z].*") ||
                !password.matches(".*[a-z].*") ||
                !password.matches(".*\\d.*")) {
            throw new UserMemoryException(
                    "La clave no cumple alguno de estos requisitos: contiene mayúsuculas, minúsculas y números y tiene 8 o más caracteres"
            );
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario other = (Usuario) o;
        return this.nombre.equalsIgnoreCase(other.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombre;
    }
}

