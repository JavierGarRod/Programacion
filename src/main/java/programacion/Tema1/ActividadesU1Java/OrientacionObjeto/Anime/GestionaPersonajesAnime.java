package programacion.Tema1.ActividadesU1Java.OrientacionObjeto.Anime;

public class GestionaPersonajesAnime {
    static void main() {
        Serie onePiece=new Serie("One Piece","Bertín");
        Luffy luffy=new Luffy("Luffy");
        //Tiempo Compilacion Luffy y en tiempo de Ejecucion es tipo Luffy
        //Todo lo del padre y del hijo
        PersonajeAnime luffy1=new Luffy("Luffy");
        //Tiempo Compilacion PersonajeAnime y en tiempo de Ejecucion es tipo Luffy
        //Tiene solo lo de PersonajeAnime
    //  Luffy luffyTemp2=new PersonajeAnime("Luffy2")
        //No copila, tiempo de Compilacion tipo Luffy pero en tiempo de Ejecucion PersonajeAnime
        //Pasar a Luffy supone perder informacion --->Falla
        Luffy luffy2=(Luffy) new PersonajeAnime("Luffy");
        //Casting explicito dsede PersonajeAnime a Luffy

        Goku goku=new Goku("Goku");
        PersonajeAnime anime=goku;
        //Luffy animeLuffy=goku; Falla

        PersonajeAnime goku2=new Goku("Goku");
        Luffy animeLuffy=(Luffy) goku2;//Compila
        //En tiempo de Ejecucion esto da ClassCastExecption

        luffy.setSerie(onePiece);
        System.out.println(luffy);
    }
}