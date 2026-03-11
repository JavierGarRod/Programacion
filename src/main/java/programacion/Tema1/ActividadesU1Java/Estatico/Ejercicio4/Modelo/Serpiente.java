package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio4.Modelo;

public class Serpiente extends Animal{
    public Serpiente(String nombre, String habitat, Animal[] come, Animal[] esComido) {
        super(nombre, habitat, come, esComido);
        Roedor s=new Roedor();
        Roedor r=new Roedor();
        this.getCome()[0]= s;
        this.getCome()[1]=r;

        Leon l=new Leon();
        this.getEsComido()[0]=l;
    }

    public Serpiente(){
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
