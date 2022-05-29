package uiMain;
/*
 * Prueba de la parte del menú correspondiente a Explorar Inmuebles
 * */

import java.util.Scanner;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.*;
import gestorAplicacion.otros.*;

public class Prueba2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // deserializar cliente
        Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar pagos
        Pago.setPagos(Deserializador.<Pago>deserializar("Pago"));

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));

        short opt1 = 0;
        do {
            System.out.println("1. Comprar Inmueble");
            System.out.println("2. Iniciar contrato");
            System.out.println("3. Presentar Informe");
            System.out.println("4. Salir");
            
            System.out.print("Seleccione su opcion: ");
            opt1 = sc.nextShort();

            switch (opt1) {
                case 1: // ver mis inmuebles
                	for (Inmueble inmueble : Inmueble.buscarInmueble(cliente.listarInmuebles())) {
                		
                	}
                    
            }
        } while (opt1 != 5);

        sc.close();
    }
}
