package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio4.Modelo;

public class Roedor extends Animal{
    public Roedor(String nombre, String habitat, Animal[] come, Animal[] esComido) {
        super(nombre, habitat, come, esComido);
    }

    public Roedor() {
    }

    @Override
    public boolean atacar(Animal a) {
        return false;
    }

    @Override
    public boolean huir(Animal a) {
        return false;
    }
}
