package programacion.Tema1.ActividadesU1Java.ExpresionesRegulares;

public class Ej1ExpreRegu {
    String patron="^\\d+$";
    String cadena="Hola caracola";
    boolean soloNumeros = cadena.matches(patron);
    String cadena2="123456";
    boolean soloNumeros2=cadena2.matches(patron);
}
