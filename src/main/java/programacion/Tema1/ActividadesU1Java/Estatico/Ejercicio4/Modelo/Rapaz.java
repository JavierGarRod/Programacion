package programacion.Tema1.ActividadesU1Java.Estatico.Ejercicio4.Modelo;

public class Rapaz extends Animal{
    public Rapaz(String nombre, String habitat, Animal[] come, Animal[] esComido) {
        super(nombre, habitat, come, esComido);
        Serpiente s=new Serpiente();
        Roedor r=new Roedor();
        this.getCome()[0]= s;
        this.getCome()[1]=r;

        Leon l=new Leon();
        this.getEsComido()[0]=l;
    }

    public Rapaz() {
        super();
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
