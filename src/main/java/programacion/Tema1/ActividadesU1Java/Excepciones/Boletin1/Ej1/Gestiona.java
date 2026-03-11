package programacion.Tema1.ActividadesU1Java.Excepciones.Boletin1.Ej1;

public class Gestiona {
    public static void main(String[] args) {

        try {
            Integer[] misNumeros = {-5, -2, 0, -10, 3};
            Clase c = new Clase();
            c.comprobarLista(misNumeros);
            System.out.println("Estoy en try");
        }
        catch(ArithmeticException e){
            System.out.println("Capturando lo excepción");
        }
        System.out.println("Programa finalizado.");
    }
}