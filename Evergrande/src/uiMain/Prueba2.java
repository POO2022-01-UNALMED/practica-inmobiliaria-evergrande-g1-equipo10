package uiMain;
/* Prueba de la parte del menu correspondiente a Explorar Inmuebles
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
            System.out.println("4. Presentar Informe de Unidades Residenciales");
            System.out.println("5. Salir");
            
            System.out.print("Seleccione su opcion: ");
            opt1 = sc.nextShort();

            switch (opt1) {
            	case 1: /*ver inmuebles disponibles, lista todos los inmuebles con sus caracteristicas
            	*los inmuebles disponibles son los que estan en el array de Inmuebles pero no en posesion del cliente
            	*/
            		for (Inmueble inmueble: Inmueble.getInmuebles()) {
            			boolean disponible = true;
            			if(cliente.listarInmuebles().contains(inmueble.getIdInmueble())) {
            				disponible = false;
            			}
            			if(disponible == true) {
            				System.out.print(inmueble);
            			}
            		}
            		break;
            	
            		
                case 2: //comprar inmueble
                	System.out.print("Ingrese el id del inmueble que desea comprar: ");
                	int idInmueble = sc.nextInt();
                	
                	boolean sePuedeComprar = true;
                	//verifica si el inmueble es de tipo venta
                    for (Inmueble inmueblefiltrar : Inmueble.getInmuebles()) {
                        if (inmueblefiltrar.getIdInmueble() == idInmueble) {
                            if(inmueblefiltrar.getTipoContrato() == TipoContrato.ARRIENDO){
                                System.out.println("El inmueble no esta a la venta, solo disponible para arriendo");
                                sePuedeComprar = false;
                                break;
                                }
                            }
                        }
                    
                    //verifica si el inmueble ya esta en posesion del cliente
                    for (Inmueble inmueble: Inmueble.buscarInmueble(cliente.listarInmuebles())) {
                    	if(inmueble.getIdInmueble() == idInmueble) {
                    		System.out.println("El inmueble ya esta en posesion suya");
                    		sePuedeComprar = false;
                            break;
                    	}
                    }
                    
                    if(sePuedeComprar == true) {
	                    cliente.comprarInmueble(idInmueble);
	                    System.out.println("Felicidades ha comprado el inmueble con id " + idInmueble);
                    }
                    break;
                    
                case 3: //Iniciar contrato
                	System.out.print("Ingrese el id del inmueble que desea arrendar: ");
                	int id = sc.nextInt();
                	
                	boolean sePuedeArrendar = true;
                	//verifica si el inmueble es de tipo arriendo
                    for (Inmueble inmueblefiltrar : Inmueble.getInmuebles()) {
                        if (inmueblefiltrar.getIdInmueble() == id) {
                            if(inmueblefiltrar.getTipoContrato() == TipoContrato.VENTA){
                                System.out.println("El inmueble no esta disponible para ser arrendado, solo venta");
                                sePuedeArrendar = false;
                                break;
                                }
                            }
                        }
                    
                    //verifica si el inmueble ya est� en posesi�n del cliente
                    for (Inmueble inmueble: Inmueble.buscarInmueble(cliente.listarInmuebles())) {
                    	if(inmueble.getIdInmueble() == id) {
                    		System.out.println("El inmueble ya esta en posesion suya");
                    		sePuedeArrendar = false;
                            break;
                    	}
                    }
                    
                    if(sePuedeArrendar == true) {
	                    cliente.iniciarContrato(id);
	                    System.out.println("Felicidades ha iniciado un contrato de arrendamiento del inmueble con id " + id);
                    }
                    break;
                
                    
                case 4: //Muestra el informe de las unidades 
                	System.out.println("Unidades de las cuales se puede presentar informe: ");
                	
                	for (UnidadResidencial unidad: UnidadResidencial.getUnidades()) {
                		System.out.println("Nombre: "  + unidad.getNombre() + " con id " + unidad.getIdUnidadResidencial());
                	}
                	
                	System.out.println("Ingrese el id de la unidad de la cual desea tener el informe: ");
                	int idUnidad = sc.nextInt();
                	
                	for(UnidadResidencial unidad: UnidadResidencial.getUnidades()) {
                		if(unidad.getIdUnidadResidencial() == idUnidad) {
                			System.out.println(unidad.presentarInforme());
                			break;
                		}
                	}
                	break;
                    
            }
        } while (opt1 != 5);

        sc.close();
    }
}
