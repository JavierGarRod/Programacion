package programacion.Tema1.ActividadesU1Java.Interfaces.Refactoriza;

public class Gestiona {
    static void main() {
        PersonaRefactoriza[] tabla=new PersonaRefactoriza[10];
        PersonaRefactoriza p= new PersonaRefactoriza("Maria") {
            @Override
            public void trabaja(int contador) {

            }
        };
        Estudiante e=new Estudiante("Estudio");
        EstudianteEmpleado eempl=new EstudianteEmpleado("Estudiante y empleado");
        Artista a=new Artista("artista");
        Cliente c=new Cliente("Cliente");
        Empleado empl=new Empleado("Cliente");

        tabla[0]=p;
        tabla[1]=e;
        tabla[2]=eempl;
        tabla[3]=a;
        tabla[4]=c;
        tabla[5]=empl;

        for(int i=0;i< tabla.length;i++){
            if(tabla[i]!=null){
                tabla[i].identificarse();
                if(tabla[i] instanceof Artista){
                    Artista artista=(Artista) tabla[i];
                    artista.pintar();
                }
            }
        }
    }
}