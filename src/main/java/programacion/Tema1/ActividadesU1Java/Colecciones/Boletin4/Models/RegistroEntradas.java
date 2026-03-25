package programacion.Tema1.ActividadesU1Java.Colecciones.Boletin4.Models;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RegistroEntradas{
    Map<Influencer, EntradaVip> registro;

    public RegistroEntradas(Map<Influencer, EntradaVip> registro) {
        this.registro = new HashMap<>();
    }

    public void addEntrada(Influencer i, EntradaVip e, EstadoEntradaVip estadoEntradaVip){
        estadoEntradaVip.equals(EstadoEntradaVip.ENVIADA);
        if(i.entradaVip==null){
            registro.put(i,e);
            estadoEntradaVip.equals(EstadoEntradaVip.CONFIRMADA);
        }
        else{
            System.out.println("El influencer ya tiene una entrada Vip");
            estadoEntradaVip.equals(EstadoEntradaVip.CANCELADA);
        }
    }
    /*
    public EntradaVip buscarEntrada(Influencer i){

    }*/
}
