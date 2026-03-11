package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Ej1Libro;

public class Libro {
    String isbn;
    String titulo;
    String autor;
    int pag;

    public Libro(int pag, String autor, String titulo, String isbn) {
        this.pag = pag;
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", pag=" + pag +
                '}';
    }
}
