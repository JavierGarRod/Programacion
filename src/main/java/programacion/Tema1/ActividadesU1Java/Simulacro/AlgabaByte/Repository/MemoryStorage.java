package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Repository;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Exceptions.UserMemoryException;
import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models.*;

import java.awt.*;
import java.util.List;
import java.util.Map;

import java.util.*;

public class MemoryStorage {

    private SortedSet<Usuario> usuarios;          // ordenados por nombre
    private Map<String, Usuario> usuariosPorNombre;
    private List<Mensaje> mensajes;

    public MemoryStorage() {
        this.usuarios = new TreeSet<>();
        this.usuariosPorNombre = new HashMap<>();
        this.mensajes = new ArrayList<>();
    }

    public void addUser(String nombre, String password) {
        try {
            Usuario u = new Usuario(nombre, password);
            if (!usuariosPorNombre.containsKey(nombre.toLowerCase())) {
                usuarios.add(u);
                usuariosPorNombre.put(nombre.toLowerCase(), u);
            }
        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public Usuario getUser(String nombre) {
        return usuariosPorNombre.get(nombre.toLowerCase());
    }

    public Mensaje crearTweet(String contenido, String nombreUsuario) {
        return crearMensaje(contenido, nombreUsuario, "tweet");
    }

    public Mensaje crearPost(String contenido, String nombreUsuario) {
        return crearMensaje(contenido, nombreUsuario, "post");
    }

    public Mensaje crearRecomendacion(String contenido, String nombreUsuario) {
        return crearMensaje(contenido, nombreUsuario, "recomendacion");
    }

    private Mensaje crearMensaje(String contenido, String nombreUsuario, String tipo) {
        Usuario u = getUser(nombreUsuario);
        if (u == null) {
            try {
                throw new UserMemoryException("Usuario no existe en el sistema");
            } catch (UserMemoryException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
        try {
            Mensaje m = null;
            switch (tipo.toLowerCase()) {
                case "tweet":
                    m = new Tweets(contenido, u);
                    break;
                case "post":
                    m = new Posts(contenido, u);
                    break;
                case "recomendacion":
                    m = new Recomendaciones(contenido, u);
                    break;
            }
            if (m != null) {
                mensajes.add(m);
            }
            return m;
        } catch (UserMemoryException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void valorarMensaje(long idMensaje, Valoracion v) {
        for (Mensaje m : mensajes) {
            if (m.getId() == idMensaje) {
                m.valorar(v);
                return;
            }
        }
        System.out.println("Mensaje con id " + idMensaje + " no encontrado");
    }

    // Mostrar todos los mensajes de un usuario
    public void mostrarMensajesUsuario(String nombreUsuario) {
        Usuario u = getUser(nombreUsuario);
        if (u == null) {
            System.out.println("Usuario no existe");
            return;
        }
        for (Mensaje m : mensajes) {
            if (m.getAutor().equals(u)) {
                System.out.println(m);
            }
        }
    }

    // Sobrecarga: mensajes de un usuario por tipo
    public void mostrarMensajesUsuario(String nombreUsuario, Class<? extends Mensaje> tipo) {
        Usuario u = getUser(nombreUsuario);
        if (u == null) {
            System.out.println("Usuario no existe");
            return;
        }
        for (Mensaje m : mensajes) {
            if (m.getAutor().equals(u) && tipo.isInstance(m)) {
                System.out.println(m);
            }
        }
    }

    // Mostrar todos los mensajes ordenados por valoración y fecha
    public void mostrarTodosOrdenadosPorValoracionYFecha() {
        List<Mensaje> copia = new ArrayList<>(mensajes);
        copia.sort(new MessageComparatorByScoreAndDate());
        for (Mensaje m : copia) {
            System.out.println(m);
        }
    }
}

