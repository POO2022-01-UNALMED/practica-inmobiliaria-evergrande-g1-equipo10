package uiMain;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.*;
import gestorAplicacion.otros.*;

public class prueba {
    public static void main(String[] args) {
        // deserializar cliente (solo un cliente ya que la app debe ser usada por un solo usuario)
        Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));

        short opt = 0;
        do{

        }while(opt != 0);

    }
}
