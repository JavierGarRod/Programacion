package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio4.Modelo;

public class Leon extends Animal{
    public Leon(String nombre, String habitat, Animal[] come, Animal[] esComido) {
        super(nombre, habitat, come, esComido);
    }

    public Leon() {
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
