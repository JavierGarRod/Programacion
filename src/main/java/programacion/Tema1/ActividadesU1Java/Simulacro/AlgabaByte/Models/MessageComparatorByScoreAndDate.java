package programacion.Tema1.ActividadesU1Java.Simulacro.AlgabaByte.Models;

import java.util.Comparator;

public class MessageComparatorByScoreAndDate implements Comparator<Mensaje> {
    @Override
    public int compare(Mensaje m1, Mensaje m2) {
        int cmp = Integer.compare(m2.getPuntuacion(), m1.getPuntuacion()); // mayor puntuación primero
        if (cmp != 0) return cmp;
        // más recientes antes
        return m2.getFechaCreacion().compareTo(m1.getFechaCreacion());
    }
}

