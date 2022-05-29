package uiMain;
/* Prueba de la parte del menú correspondiente a Explorar Inmuebles
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
        
        //deserializar unidades 
        UnidadResidencial.setUnidades(Deserializador.<UnidadResidencial>deserializar("UnidadResidencial"));
        
        //deserializar agentes
        Agente.setAgentes(Deserializador.<Agente>deserializar("Agente"));

        short opt1 = 0;
        do {
        	System.out.println("1. Ver inmuebles disponibles");
            System.out.println("2. Comprar Inmueble");
            System.out.println("3. Iniciar contrato");
            System.out.println("4. Presentar Informe");
            System.out.println("5. Salir");
            
            System.out.print("Seleccione su opcion: ");
            opt1 = sc.nextShort();

            switch (opt1) {
            	case 1: //ver inmuebles disponibles, lista todos los inmuebles con sus caracteristicas
            		for (Inmueble inmueble: Inmueble.getInmuebles()) {
            			System.out.print(inmueble + "\n");
            		}
            	
                case 2: //comprar inmueble
                	System.out.print("Ingrese el id del inmueble que desea comprar: ");
                	int idInmueble = sc.nextInt();
                	
                	//verifica si el inmueble es de tipo venta
                    for (Inmueble inmueblefiltrar : Inmueble.getInmuebles()) {
                        if (inmueblefiltrar.getIdInmueble() == idInmueble) {
                            if(inmueblefiltrar.getTipoContrato() == TipoContrato.ARRIENDO){
                                System.out.println("El inmueble no está a la venta, solo disponible para arriendo");
                                break;
                                }
                            }
                        }
                    
                    //verifica si el inmueble ya está en posesión del cliente
                    for (Inmueble inmueble: Inmueble.buscarInmueble(cliente.listarInmuebles())) {
                    	if(inmueble.getIdInmueble() == idInmueble) {
                    		System.out.println("El inmueble ya lo tiene en posesión suya");
                            break;
                    	}
                    }
                    
                    cliente.comprarInmueble(idInmueble);
                    System.out.println("Felicidades ha comprado el inmueble con id " + idInmueble);
                    break;
                    
            }
        } while (opt1 != 5);

        sc.close();
    }
}
