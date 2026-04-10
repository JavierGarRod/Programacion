package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

public enum Valoracion {
    SUPERBUENA(3),
    MUYBUENA(2),
    BUENA(1),
    NORMAL(0),
    REGULAR(-1),
    MUYMALA(-2);

    private final int puntos;

    Valoracion(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}