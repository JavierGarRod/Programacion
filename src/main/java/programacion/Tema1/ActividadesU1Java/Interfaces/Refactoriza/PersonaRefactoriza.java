package programacion.Tema1.ActividadesU1Java.Interfaces.Refactoriza;

public abstract class PersonaRefactoriza {
    String nombre;
    static PersonaRefactoriza[] tabla=new PersonaRefactoriza[10];
    int contador=0;

    public PersonaRefactoriza(String nombre, int contador) {
        this.nombre = nombre;
        this.contador = contador;
    }

    public void identificarse() {
        System.out.println("Soy una persona y me llamo " + nombre);
    }

    public abstract void trabaja(int contador);
}


class Empleado extends PersonaRefactoriza {
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }

    public Empleado(String nombre, int contador) {
        super(nombre, contador);
    }

    @Override
    public void trabaja(int contador) {
        if(contador==0){

        }
    }
}


class Cliente extends PersonaRefactoriza {
    public void comprar() {
        System.out.println(nombre + " está comprando.");
    }

    public Cliente(String nombre, int contador) {
        super(nombre, contador);
    }

    @Override
    public void trabaja(int contador) {

    }
}


// Agregamos más clases para hacer evidente el problema


class Estudiante extends PersonaRefactoriza {
    public void estudiar() {
        System.out.println(nombre + " está estudiando.");
    }

    public Estudiante(String nombre, int contador) {
        super(nombre, contador);
    }

    @Override
    public void trabaja(int contador) {

    }
}


// Un problema surge aquí: ¿qué pasa si un Estudiante también es Empleado?
class EstudianteEmpleado extends Estudiante {
    public void trabajar() {
        System.out.println(nombre + " está estudiando y trabajando.");
    }

    public EstudianteEmpleado(String nombre, int contador) {
        super(nombre, contador);
    }

    @Override
    public void trabaja(int contador) {

    }
}


// Agregamos otra clase con otro comportamiento
class Artista extends PersonaRefactoriza {
    public void pintar() {
        System.out.println(nombre + " está pintando.");
    }

    public Artista(String nombre, int contador) {
        super(nombre, contador);
    }

    @Override
    public void trabaja(int contador) {

    }
}

