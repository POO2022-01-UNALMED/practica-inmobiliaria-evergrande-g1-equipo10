package uiMain;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.Inmueble;
import gestorAplicacion.otros.Cliente;

public class Main {
    public static void main(String[] args) {
        // deserializar cliente (solo un cliente ya que la app debe ser usada por un solo usuario)
        Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));

        System.out.println(cliente.getNombreCompleto());

    }
}
