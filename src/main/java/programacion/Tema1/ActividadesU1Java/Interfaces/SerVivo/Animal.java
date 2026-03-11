package programacion.Tema1.ActividadesU1Java.Interfaces.SerVivo;

public class Animal extends SerVivo {

    private boolean vivo;

    public Animal(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public boolean estaVivo() {
        return vivo;
    }

    @Override
    public boolean seDesplaza() {
        return true;
    }

    public void come() {
        System.out.println("El animal está comiendo.");
    }

    public void respira() {
        System.out.println("El animal está respirando.");
    }
}