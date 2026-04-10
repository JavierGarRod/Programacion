package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Controller;

import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models.Mensaje;
import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models.Tweets;
import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models.Valoracion;
import programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Repository.MemoryStorage;

public class MemoryStageManagement {

    public static void main(String[] args) {
        MemoryStorage storage = new MemoryStorage();

        // Pruebas de creación de usuarios
        storage.addUser("pepe", "Abc12345");          // nombre < 6 → excepción
        storage.addUser("pepito", "abc12345");        // sin mayúsculas → excepción
        storage.addUser("pepito", "Abc12345");        // correcto
        storage.addUser("mariaaa", "Clave123");       // correcto

        // Crear mensajes
        Mensaje t1 = storage.crearTweet("Hola mundo desde un tweet", "pepito");
        Mensaje p1 = storage.crearPost("Este es mi primer post en la red interna", "pepito");
        Mensaje r1 = storage.crearRecomendacion(
                "Esta es una recomendación muy larga que debe tener al menos 100 caracteres. " +
                        "Sirve para probar el sistema de recomendaciones interno.",
                "mariaaa"
        );

        // Intento con usuario inexistente
        storage.crearTweet("No debería crearse", "usuarioInexistente");

        // Valorar mensajes
        if (t1 != null) {
            storage.valorarMensaje(t1.getId(), Valoracion.SUPERBUENA);
            storage.valorarMensaje(t1.getId(), Valoracion.REGULAR);
        }
        if (p1 != null) {
            storage.valorarMensaje(p1.getId(), Valoracion.MUYBUENA);
        }
        if (r1 != null) {
            storage.valorarMensaje(r1.getId(), Valoracion.BUENA);
            storage.valorarMensaje(r1.getId(), Valoracion.MUYMALA);
        }

        System.out.println("\n--- Mensajes de pepito ---");
        storage.mostrarMensajesUsuario("pepito");

        System.out.println("\n--- Tweets de pepito ---");
        storage.mostrarMensajesUsuario("pepito", Tweets.class);

        System.out.println("\n--- Todos los mensajes ordenados por puntuación y fecha ---");
        storage.mostrarTodosOrdenadosPorValoracionYFecha();
    }
}