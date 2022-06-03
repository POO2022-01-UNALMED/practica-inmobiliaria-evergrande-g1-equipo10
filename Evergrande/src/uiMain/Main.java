package uiMain;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.ApartaEstudio;
import gestorAplicacion.herencia.Bodega;
import gestorAplicacion.herencia.Casa;
import gestorAplicacion.herencia.Inmueble;
import gestorAplicacion.otros.Agente;
import gestorAplicacion.otros.Ciudad;
import gestorAplicacion.otros.Cliente;
import gestorAplicacion.otros.Pago;
import gestorAplicacion.otros.TipoContrato;
import gestorAplicacion.otros.UnidadResidencial;
import gestorAplicacion.herencia.Apartamento;
//import gestorAplicacion.otros.Pago;
import gestorAplicacion.otros.Cita;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

abstract class TableGenerator {
	
} 

public class Main {
	
	public static void printApartaEstudioTable(ArrayList<ApartaEstudio> inmuebles, String table) {
		switch (table) {
			case "apartaestudio_1":
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |    NOMBRE UNIDAD     |  TORRE  |  NÚMERO APARTAMENTO  |  NÚMERO HABITACIONES  |  NÚMERO BAÑOS  |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				for (ApartaEstudio inmueble : inmuebles) {
					System.out.format(inmueble.toString());
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printApartamentoTable(ArrayList<Apartamento> inmuebles, String table) {
		switch (table) {
			case "apartamento_1":
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |    NOMBRE UNIDAD     |  TORRE  |  NÚMERO APARTAMENTO  |  NÚMERO HABITACIONES  |  NÚMERO BAÑOS  | PATIO | BALCÓN |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
				for (Apartamento inmueble : inmuebles) {
					System.out.format(inmueble.toString());
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
				break;
			default:
				break;
		}
	}

	public static void printBodegasTable(ArrayList<Bodega> inmuebles, String table) {
		switch (table) {
			case "bodega_1":
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+-----------+----------+---------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       | CAPACIDAD |  OFICINA |  BAÑO   |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+-----------+----------+---------+%n");
				for (Bodega inmueble : inmuebles) {
					System.out.format(inmueble.toString());
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+------------+---------+---------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printCasasTable(ArrayList<Casa> inmuebles, String table) {
		switch (table) {
			case "casa_1":
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       | NÚMERO HABITACIONES  | NÚMERO BAÑOS |  PATIO   | BALCÓN |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				for (Casa inmueble : inmuebles) {
					System.out.format(inmueble.toString());
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printInmueblesTable(ArrayList<Inmueble> inmuebles, String table) {
		String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-9f | %-11s | %-19s | %-17s | %-20s |%n";
		String leftAlignFormat2 = "| %-4d | %-13s | %-14f | %-15s | %-20s |%n";
		switch (table) {
			case "inmuebles_1":
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
				for (Inmueble inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion()
							);
					//System.out.format(inmueble.toString());
				}
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
				break;
			case "inmuebles_2":
				System.out.format("+------+---------------+----------------+-----------------+----------------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |      DIRECCION       |%n");
				System.out.format("+------+---------------+----------------+-----------------+----------------------+%n");
				for (Inmueble inmueble : inmuebles) {
					System.out.format(leftAlignFormat2, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getDireccion()
							);
				}
				System.out.format("+------+---------------+----------------+-----------------+----------------------+%n");
				break;
			default:
				break;
			
		}
	}

	
	public static void printPagosTable(ArrayList<Pago> pagos, String table) {
		String leftAlignFormat;
		
		switch (table) {
			case "pagos_1":
				leftAlignFormat = "| %-9d | %-14f | %-11d | %-5s | %-10s | %-15s | %-14s |%n";
				System.out.format("+-----------+----------------+-------------+-------+------------+-----------------+----------------+%n");
				System.out.format("|  ID PAGO  |    VALOR       |     AÑO     |  MES  |    TIPO    |    DIRECCION    | TIPO CONTRATO  |%n");
				System.out.format("+-----------+----------------+-------------+-------+------------+-----------------+----------------+%n");
				for (Pago pago : pagos) {
					Inmueble inmueble = Inmueble.buscarInmueble(pago.getidInmueble());
					System.out.format(leftAlignFormat, 
							pago.getIdPago(),
							pago.getvalor(),
							pago.getAno(), 
							pago.getMes(),
							inmueble.getClass().getSimpleName(),
							inmueble.getDireccion(),
							inmueble.getTipoContrato()
							);
				}
				System.out.format("+-----------+----------------+-------------+-------+------------+-----------------+----------------+%n");
				break;
			default:
				break;
			
		}

	}

	public static void printUnidadesResidencialesTable(ArrayList<UnidadResidencial> unidades, String table) {
		String leftAlignFormat;
		switch (table) {
			case "unidades_1":
				leftAlignFormat = "| %-4d | %-17s | %-14s | %-14s |%n";
				System.out.format("+------+-------------------+----------------+----------------+%n");
				System.out.format("|  ID  |      NOMBRE       |     BARRIO     |     CIUDAD     |%n");
				System.out.format("+------+-------------------+----------------+----------------+%n");
				for (UnidadResidencial unidad : unidades) {
					System.out.format(leftAlignFormat, 
							unidad.getIdUnidadResidencial(),
							unidad.getNombre(),
							unidad.getBarrio(),
							Ciudad.NOMBRE
							);
				};
				System.out.format("+------+-------------------+----------------+----------------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printCitasTable(ArrayList<Integer> citasIds, String table) {
		String leftAlignFormat = "| %-11d | %-15s | %-17s |%n";;
		ArrayList<Integer> inmueblesCitas = new ArrayList<Integer>();
		int citasCount = 0;
		for (int idCita : citasIds) {
			if (Cita.getCitaByID(idCita) == null) {
				continue;
			}
			int idInmuebleCita = Cita.getCitaByID(idCita).getIdInmueble();
			if (!(inmueblesCitas.contains(idInmuebleCita)) ) {
				inmueblesCitas.add(idInmuebleCita);
			}
		}
		switch (table) {
			case "citas_1":
				citasCount++;
				for (int idInmuebleCita : inmueblesCitas) {
					System.out.println("\nCita número " + citasCount);
					System.out.format("+-------------+-----------------+-------------------+%n");
					System.out.format("| ID INMUEBLE | NOMBRE INMUEBLE |     DIRECCIÓN     |%n");
					System.out.format("+-------------+-----------------+-------------------+%n");
					Inmueble inmuebleCita = Inmueble.buscarInmueble(idInmuebleCita);
					System.out.format(leftAlignFormat,
							idInmuebleCita,
							inmuebleCita.getClass().getSimpleName(),
							inmuebleCita.getDireccion()
							);
					System.out.format("+-------------+-----------------+-------------------+%n");
					System.out.format("+---------+-----+-----+-----+------+---------------+%n");
					System.out.format("| ID CITA | DIA | MES | AÑO | HORA | NOMBRE AGENTE |%n");
					System.out.format("+---------+-----+-----+-----+------+---------------+%n");
					for (Cita cita : Cita.citas) {
						if (cita.getIdInmueble() == idInmuebleCita) {
							System.out.format(cita.toString());
						}
					}
					System.out.format("+---------+-----+-----+-----+------+---------------+%n");
					
				};
				// System.out.format("+------+-------------------+----------------+----------------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printAgentesTable(ArrayList<Agente> agentes , String table) {
		switch (table){
		case "agentes_1":
			String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-10f | %-11s | %-19s | %-17s | %-20s |%n";
			int agenteCount = 0;
			for (Agente agente: agentes) {
				agenteCount++;
				System.out.println("Agente número " + agenteCount);
				System.out.format("+------------+----------------------+------------------+---------------+----------+----------------+%n");
				System.out.format("|   CEDULA   |        NOMBRE        | TELEFONO CELULAR | TELEFONO FIJO | VEHICULO | PLACA VEHICULO |%n");
				System.out.format("+------------+----------------------+------------------+---------------+----------+----------------+%n");
	    		System.out.format(agente.toString());
	    		System.out.println("\nINMUEBLES ASIGNADOS");
	    		System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
	    		for (int idInmueble : agente.getIdInmuebles()) {
	    			Inmueble inmueble = Inmueble.buscarInmueble(idInmueble);
	    			System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion()
							);
	    		}
	    		System.out.println("\n");
	    	}
			break;
		case "agentes_2":
			for (Agente agente: agentes) {
				System.out.format("+------------+----------------------+------------------+---------------+----------+----------------+%n");
				System.out.format("|   CEDULA   |        NOMBRE        | TELEFONO CELULAR | TELEFONO FIJO | VEHICULO | PLACA VEHICULO |%n");
				System.out.format("+------------+----------------------+------------------+---------------+----------+----------------+%n");
	    		System.out.format(agente.toString());
			}
			break;
		default:
			break;
		}
	}
	
	public static void clearConsole() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
    	
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
        
        //deserializar citas
        Cita.setCitas(Deserializador.<Cita>deserializar("Citas"));
        
        
        Scanner sc =  new Scanner(System.in);
        short opt1 = 0;
        do {
        	//clearConsole();
        	// Almacenar inmuebles de cliente en un arraylist
            ArrayList<Inmueble> inmueblesCliente = Inmueble.buscarInmueble(cliente.listarInmuebles());
        	System.out.println("INMOBILIARIA EVERGRANDE");
            System.out.println("1. Ver mis inmuebles");
            System.out.println("2. Realizar pago");
            System.out.println("3. Ver mis pagos");
            System.out.println("4. Finalizar contrato");
            System.out.println("5. Explorar inmuebles");
            System.out.println("6. Agendar cita");
            System.out.println("7. Ver mis citas");
            System.out.println("8. Cancelar cita");
            System.out.println("9. Salir");
            System.out.print("Seleccione su opcion: ");
            opt1 = sc.nextShort();
            
            switch (opt1) {
                case 1: // ver mis inmuebles
                	//clearConsole();
                	
                    short opt2=0;
                    Inmueble inmuebleBuscado;
                    do {System.out.println("\n VER MIS INMUEBLES");
                    System.out.println("1. Ver todos mis inmuebles");
                    System.out.println("2. Ver mis apartaestudios");
                    System.out.println("3. Ver mis bodegas");
                    System.out.println("4. Ver mis casas");
                    System.out.println("5. Ver mis apartamentos");
                    System.out.println("6. Atrás");
                    System.out.print("Seleccione su opcion: ");
                    opt2 = sc.nextShort();
                    
                        switch (opt2) {                        
                            case 1:
                            	System.out.println("\nINMUEBLES");
                            	printInmueblesTable(inmueblesCliente, "inmuebles_1");
                                break;
                            case 2:
                            	ArrayList<ApartaEstudio> filtroApartaEstudio = new ArrayList<ApartaEstudio>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof ApartaEstudio) filtroApartaEstudio.add(((ApartaEstudio) inmueble));
                            	};
                            	System.out.println("\nAPARTAESTUDIOS");
                            	printApartaEstudioTable(filtroApartaEstudio, "apartaestudio_1");
                                break;
                            case 3:
                            	ArrayList<Bodega> filtroBodega = new ArrayList<Bodega>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Bodega) filtroBodega.add(((Bodega) inmueble));
                            	};
                            	System.out.println("\nBODEGAS");
                                printBodegasTable(filtroBodega, "bodega_1");
                                break;
                            case 4:
                            	ArrayList<Casa> filtroCasas = new ArrayList<Casa>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Casa) filtroCasas.add(((Casa) inmueble));
                            	};
                            	System.out.println("\nCASAS");
                                printCasasTable(filtroCasas, "casa_1");
                                break;
                            case 5:
                            	ArrayList<Apartamento> filtroApartamento = new ArrayList<Apartamento>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Apartamento) filtroApartamento.add(((Apartamento)inmueble));
                            	};
                            	System.out.println("\nAPARTAMENTOS");
                                printApartamentoTable(filtroApartamento, "apartamento_1");
                                break;
                            default:
                            	System.out.println("\n");
                            	break;
                        };
                    }    while (opt2 != 6);
                    break;
                case 2: // realizar pago
                    System.out.println("REALIZAR PAGO");
                    ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
                    for (Inmueble inmueble : Inmueble.buscarInmueble(cliente.listarInmuebles())) {
                    	if (!inmueble.getVendido()) inmuebles.add(inmueble);
                    }
                    System.out.println("\nINMUEBLES");
                    printInmueblesTable(inmuebles, "inmuebles_2");
                    
                    System.out.print("Ingrese el id del inmueble (ingrese el número -1 para volver atrás): "); 
                    int idInmueble = sc.nextInt();
                    if (idInmueble == -1) {
                    	break;
                    }
                    
                    inmuebleBuscado = Inmueble.buscarInmueble(idInmueble);

                    if (inmuebleBuscado == null) {
                    	System.out.println("No tiene un inmueble con esta id!\n");
                    	break;
                    }
                    
                    
                    if (Pago.verPagos(idInmueble).size() != 0) {
                    	System.out.println("El inmueble ya fue pagado, no puede volver a ser pagado!\n");
                    	break;
                    }
                    
                    System.out.print("Ingrese el valor del pago: ");
                    double valor = sc.nextDouble();

                    System.out.print("Ingrese el año del pago: ");
                    int ano = sc.nextInt();

                    System.out.print("Ingrese el mes del pago: ");
                    int mes = sc.nextInt();

                    cliente.realizarPago(valor, ano, mes, idInmueble);
                    System.out.println("Pago realizado con exito !!");
                    
                    break;
                case 3: // ver mis pagos
                	ArrayList<Pago> pagosCliente = new ArrayList<Pago>();
                	for (Inmueble inmueble : inmueblesCliente) {
                		pagosCliente.addAll(Pago.verPagos(inmueble.getIdInmueble()));
                	}
                	System.out.println("\nPAGOS");
                	printPagosTable(pagosCliente,"pagos_1");

                    break;

                case 4: // finalizar contrato
                	ArrayList<Inmueble> arriendosCliente = new ArrayList<Inmueble>();
                	for (Inmueble inmueble : inmueblesCliente) {
                		if (inmueble.getTipoContrato() == TipoContrato.ARRIENDO) {
                			arriendosCliente.add(inmueble);
                		}
                	}
                	System.out.println("\nINMUEBLES");
                	printInmueblesTable(arriendosCliente, "inmuebles_1");
                	
                    System.out.print("Ingresa el id del inmueble (ingresa -1 para volver atrás): ");
                    int idInmueble2 = sc.nextInt();
                    
                    if (idInmueble2 == -1) {break;}
                    
                    inmuebleBuscado = Inmueble.buscarInmueble(idInmueble2);
                    if (inmuebleBuscado == null) {
                    	System.out.println("No tiene un inmueble con esta id!\n");
                    	break;
                    }
                    
                    if (!(arriendosCliente.contains(inmuebleBuscado))) {
                    	System.out.println("Este inmueble no es de tipo arriendo!\n");
                    	break;
                    }
                    
                    cliente.finalizarContrato(inmuebleBuscado.getIdInmueble());
                    System.out.println("Contrato finalizado exitosamente !");
                    break;
                    
                case 5: // Explorar Inmuebles
                	short opt3 = 0;
                	
                    do {
                    	inmueblesCliente = Inmueble.buscarInmueble(cliente.listarInmuebles());
                    	System.out.println("\nEXPLORAR INMUEBLES");
                    	System.out.println("1. Ver inmuebles disponibles");
                        System.out.println("2. Comprar Inmueble");
                        System.out.println("3. Iniciar contrato");
                        System.out.println("4. Ver Informe de Unidades Residenciales");
                        System.out.println("5. Salir");
                        
                        System.out.print("Seleccione su opcion: ");
                        opt3 = sc.nextShort();
                        ArrayList<Inmueble> inmueblesDisponibles;
                        switch (opt3) {
                        	case 1: /*ver inmuebles disponibles, lista todos los inmuebles con sus caracteristicas
                        	*los inmuebles disponibles son los que estan en el array de Inmuebles pero no en posesion del cliente
                        	*/
                        		inmueblesDisponibles = new ArrayList<Inmueble>();
                        		for (Inmueble inmueble: Inmueble.getInmuebles()) {
                        			if (!(inmueble.getVendido()) && !(inmueblesCliente.contains(inmueble))) {
                        				inmueblesDisponibles.add(inmueble);
                        			}
                        		}
                        		System.out.println("INMUEBLES DISPONIBLES");
                        		printInmueblesTable(inmueblesDisponibles, "inmuebles_1");
                        		break;        		
                            case 2: //comprar inmueble
                            	inmueblesDisponibles = new ArrayList<Inmueble>();
                        		for (Inmueble inmueble: Inmueble.getInmuebles()) {
                        			if (!(inmueble.getVendido()) && (inmueble.getTipoContrato() == TipoContrato.VENTA) && !(inmueblesCliente.contains(inmueble))) {
                        				inmueblesDisponibles.add(inmueble);
                        			}
                        		}
                        		
                        		System.out.println("INMUEBLES DISPONIBLES");
                        		printInmueblesTable(inmueblesDisponibles, "inmuebles_1");
                        		
                            	System.out.print("Ingresa el id del inmueble que deseas comprar (ingresa -1 para volver atrás): ");
                            	int idInmueble1 = sc.nextInt();
                            	if (idInmueble1 == -1) {break;}
                            	
                            	Inmueble inmueblefiltrar = Inmueble.buscarInmueble(idInmueble1);
                            	if ((inmueblefiltrar == null ) || (!(inmueblesDisponibles.contains(inmueblefiltrar)))) {
                                	System.out.println("No hay inmuebles disponibles con esta id!\n");
                                	break;
                                }
                              
                            	cliente.comprarInmueble(idInmueble1);
                            	System.out.println("¡Felicidades! Has comprado el inmueble con id " + idInmueble1 + "\n");
                            	break;
                                                                
                                
                            case 3: //Iniciar contrato
                            	inmueblesDisponibles = new ArrayList<Inmueble>();
                        		for (Inmueble inmueble: Inmueble.getInmuebles()) {
                        			if (!(inmueble.getArrendado() && !(inmueblesCliente.contains(inmueble))) && (inmueble.getTipoContrato() == TipoContrato.ARRIENDO)) {
                        				inmueblesDisponibles.add(inmueble);
                        			}
                        		}
                        		System.out.print("Ingresa el id del inmueble que deseas arrendar (ingresa -1 para volver atrás): ");
                        		
                            	idInmueble1 = sc.nextInt();
                            	if (idInmueble1 == -1) {break;}
                            	inmueblefiltrar = Inmueble.buscarInmueble(idInmueble1);
                            	if ((inmueblefiltrar == null ) || (!(inmueblesDisponibles.contains(inmueblefiltrar)))) {
                                	System.out.println("No hay inmuebles disponibles con esta id!\n");
                                	break;
                                }
                              
                            	cliente.iniciarContrato(idInmueble1);
                            	System.out.println("¡Felicidades! Has iniciado contrato con el inmueble con id " + idInmueble1 + "\n");
                            	break;

                            case 4: //Muestra el informe de las unidades 
                            	System.out.println("\nUNIDADES");
                            	printUnidadesResidencialesTable(UnidadResidencial.getUnidades(), "unidades_1");
                            	
                            	System.out.println("Ingresa el id de la unidad (ingresa -1 para volver atrás): ");
                            	int idUnidad = sc.nextInt();
                            	
                            	if (idUnidad == -1) {break;}
                            	
                            	for(UnidadResidencial unidad: UnidadResidencial.getUnidades()) {
                            		if(unidad.getIdUnidadResidencial() == idUnidad) {
                            			System.out.println(unidad.presentarInforme());
                            			break;
                            		}
                            	}
                            	break;
                        }
                    } while (opt3 != 5);
                    break;
                    
                case 6:
                	int diaCita = 0;
                	int mesCita = 0;
                	int anoCita = 0;
                	int idAgenteCita = 0;
                	int idInmuebleCita = 0;
                	String horaCita = null;
                	ArrayList<Integer> citasCliente;
                	
                	System.out.println("\nAGENTES INMOBILIARIOS");
                	printAgentesTable(Agente.getAgentes(), "agentes_1");
                	
                	System.out.print("\nIngrese el dia en el que desea la cita (ingrese -1 para volver atrás): ");
                	diaCita = sc.nextInt();
                	if (diaCita == -1) {break;}
                	
                	System.out.print("Ingrese la hora en el que desea la cita: ");
                	horaCita = sc.next();
                	
                	
                	System.out.print("Ingrese el mes en el que desea la cita: ");
                	mesCita = sc.nextInt();
                	
                	System.out.print("Ingrese el año en el que desea la cita: ");
                	anoCita = sc.nextInt();
                	
                	ArrayList<Inmueble> inmueblesDisponibles = new ArrayList<Inmueble>();
                	ArrayList<Integer> inmueblesDisponiblesIDS = new ArrayList<Integer>();
            		for (Inmueble inmueble: Inmueble.getInmuebles()) {
            			if (!(inmueble.getVendido()) && !(inmueble.getArrendado())) {
            				inmueblesDisponibles.add(inmueble);
            				inmueblesDisponiblesIDS.add(inmueble.getIdInmueble());
            			}
            		}
            		System.out.println("\n");
            		printInmueblesTable(inmueblesDisponibles, "inmuebles_1");
            		System.out.println("\n");
                	System.out.print("Ingrese el id del inmueble que desea visitar: ");
                	idInmuebleCita = sc.nextInt();
                	
                	if (!(inmueblesDisponiblesIDS.contains(idInmuebleCita))) {
                		System.out.println("\nNo hay inmuebles disponibles con el ID ingresado!");
                		break;
                	}
                	
                	ArrayList<Agente> agentesDisponibles = new ArrayList<Agente>();
                	ArrayList<Integer> agentesDisponiblesIDS = new ArrayList<Integer>();
                	for (Agente agente : Agente.getAgentes()) {
                		if (agente.getIdInmuebles().contains(idInmuebleCita)){
                			agentesDisponibles.add(agente);
                			agentesDisponiblesIDS.add(agente.getCedula());
                		}
                	}
                	System.out.println("\n");
                	printAgentesTable(agentesDisponibles, "agentes_2");
                	System.out.println("\n");
                	System.out.print("Ingrese la cedula del agente con quien desea la cita: ");
                	idAgenteCita = sc.nextInt();
                	
                	if (!(agentesDisponiblesIDS.contains(idAgenteCita))) {
                		System.out.println("\nNo hay agentes disponibles con la cédula ingresada!");
                		break;
                	}
                			
                	cliente.pedirCita(anoCita, mesCita, diaCita, horaCita, idAgenteCita, idInmuebleCita);
                	System.out.println("\n");
                	break;
                
                case 7:
                	citasCliente = cliente.getCitas();
                	System.out.println("\nMIS CITAS");
                	printCitasTable(citasCliente, "citas_1");
                	System.out.println("\n");
                	break;
                case 8:
                	citasCliente = cliente.getCitas();
                	System.out.println("MIS CITAS");
                	printCitasTable(citasCliente, "citas_1");
                	System.out.print("\nIngrese el ID de la cita a cancelar (ingrese -1 para volver atrás): ");
                	int idCancelar = sc.nextInt();
                	if (idCancelar == -1) {break;}
                	if (!(citasCliente.contains(idCancelar))) {
                		System.out.println("\nNo hay citas con el ID ingresado!");
                		break;
                	}
                	Cita.cancelar(idCancelar);
                	break;
                default:
                    break;
                
            }
        } while (opt1 != 9);
        System.out.println("\nADIÓS!");
        sc.close();
    }
}
