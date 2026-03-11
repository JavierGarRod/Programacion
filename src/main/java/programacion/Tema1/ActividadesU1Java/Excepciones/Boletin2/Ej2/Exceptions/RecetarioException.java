package programacion.Tema1.ActividadesU1Java.Excepciones.Boletin2.Ej2.Exceptions;

public class RecetarioException extends RuntimeException {
    public RecetarioException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "RecetarioException: Esa receta no existe :l";
    }
}
