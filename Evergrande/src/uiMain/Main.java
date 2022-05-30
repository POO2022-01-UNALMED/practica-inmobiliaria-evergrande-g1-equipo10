package uiMain;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.ApartaEstudio;
import gestorAplicacion.herencia.Bodega;
import gestorAplicacion.herencia.Casa;
import gestorAplicacion.herencia.Inmueble;
import gestorAplicacion.otros.Cliente;
import gestorAplicacion.otros.Pago;
import gestorAplicacion.otros.TipoContrato;
import gestorAplicacion.herencia.Apartamento;
import gestorAplicacion.otros.Pago;

import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

abstract class TableGenerator {
	
} 

public class Main {
	public static void printPagosTable(ArrayList<Pago> pagos, String table) {
		String leftAlignFormat;
		System.out.println("\nPAGOS");
		switch (table) {
			case "pagos_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s |%n";
				System.out.format("+-----------+----------------+-------------+-------+------------+-------------+----------------+%n");
				System.out.format("|  ID PAGO  |    VALOR       |     AÑO     |  MES  |    TIPO    |  DIRECCION  | TIPO CONTRATO  |%n");
				System.out.format("+-----------+----------------+-------------+-------+------------+-------------+----------------+%n");
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
				System.out.format("+-----------+----------------+-------------+-------+------------+-------------+----------------+%n");
				break;
			default:
				break;
			
		}

	}
	
	public static void printInmueblesTable(ArrayList<Inmueble> inmuebles, String table) {
		String leftAlignFormat;
		System.out.println("\nINMUEBLES");
		switch (table) {
			case "inmuebles_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s |%n";
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
				}
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+%n");
				break;
			case "inmuebles_2":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-20s |%n";
				System.out.format("+------+---------------+----------------+-----------------+----------------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |      DIRECCION       |%n");
				System.out.format("+------+---------------+----------------+-----------------+----------------------+%n");
				for (Inmueble inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
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
	
	public static void printApartaEstudioTable(ArrayList<ApartaEstudio> inmuebles, String table) {
		String leftAlignFormat;
		System.out.println("\nAPARTAESTUDIOS");
		switch (table) {
			case "apartaestudio_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20s | %-7s | %-20s | %-21d | %-14d |%n";
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |    NOMBRE UNIDAD     |  TORRE  |  NÚMERO APARTAMENTO  |  NÚMERO HABITACIONES  |  NÚMERO BAÑOS  |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				for (ApartaEstudio inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion(),
							inmueble.getNombreUnidad(),
							inmueble.getTorre(),
							inmueble.getNumeroApto(),
							inmueble.getNumHabitaciones(),
							inmueble.getNumBanos()
							);
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printBodegasTable(ArrayList<Bodega> inmuebles, String table) {
		String leftAlignFormat;
		System.out.println("\nBODEGAS");
		switch (table) {
			case "bodega_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-9d | %-8d | %-7d |%n";
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+-----------+----------+---------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       | CAPACIDAD |  OFICINA |  BAÑO   |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+-----------+----------+---------+%n");
				for (Bodega inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion(),
							inmueble.getCapacidad(),
							inmueble.getOficina(),
							inmueble.getbano()
							);
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+------------+---------+---------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printCasasTable(ArrayList<Casa> inmuebles, String table) {
		String leftAlignFormat;
		System.out.println("\nCASAS");
		switch (table) {
			case "casa_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20d | %-12d | %-8d | %-6d |%n";
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       | NÚMERO HABITACIONES  | NÚMERO BAÑOS |  PATIO   | BALCÓN |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				for (Casa inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion(),
							inmueble.getNumHabitaciones(),
							inmueble.getNumBanos(),
							inmueble.getPatio(),
							inmueble.getBalcon()
							);
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+--------------+----------+--------+%n");
				break;
			default:
				break;
		}
	}
	
	public static void printApartamentoTable(ArrayList<Apartamento> inmuebles, String table) {
		String leftAlignFormat;
		System.out.println("\nAPARTAMENTOS");
		switch (table) {
			case "apartamento_1":
				leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20s | %-7s | %-20s | %-21d | %-14d | %-6s | %-6s |%n";
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
				System.out.format("|  ID  |    TIPO       |     PRECIO     |  TIPO CONTRATO  |    AREA    |  AMUEBLADO  | PARQUEADERO CARROS  | PARQUEADERO MOTOS |      DIRECCION       |    NOMBRE UNIDAD     |  TORRE  |  NÚMERO APARTAMENTO  |  NÚMERO HABITACIONES  |  NÚMERO BAÑOS  | PATIO | BALCÓN |%n");
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
				for (Apartamento inmueble : inmuebles) {
					System.out.format(leftAlignFormat, 
							inmueble.getIdInmueble(),
							inmueble.getClass().getSimpleName(),
							inmueble.getPrecio(), 
							inmueble.getTipoContrato().name(),
							inmueble.getArea(),
							inmueble.getAmueblado(),
							inmueble.getParqueaderoCarros(),
							inmueble.getParqueaderoMotos(),
							inmueble.getDireccion(),
							inmueble.getNombreUnidad(),
							inmueble.getTorre(),
							inmueble.getNumeroApto(),
							inmueble.getNumHabitaciones(),
							inmueble.getNumBanos(),
							inmueble.getPatio(),
							inmueble.getBalcon()
							);
				};
				System.out.format("+------+---------------+----------------+-----------------+------------+-------------+---------------------+-------------------+----------------------+----------------------+---------+----------------------+-----------------------+----------------+-------+--------+%n");
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
    	// OS    	
        // deserializar cliente (solo un cliente ya que la app debe ser usada por un solo usuario)
    	Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));
        
        
        
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
            System.out.println("6. Salir");
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
                    ArrayList<Inmueble> filtroInmuebles = new ArrayList<Inmueble>();
                    
                        switch (opt2) {
                        
                            case 1:
                                //System.out.println(inmueble + "\n");
                            	printInmueblesTable(inmueblesCliente, "inmuebles_1");
                                break;
                            case 2:
                            	ArrayList<ApartaEstudio> filtroApartaEstudio = new ArrayList<ApartaEstudio>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof ApartaEstudio) filtroApartaEstudio.add(((ApartaEstudio) inmueble));
                            	};
                            	printApartaEstudioTable(filtroApartaEstudio, "apartaestudio_1");
                                break;
                            case 3:
                            	ArrayList<Bodega> filtroBodega = new ArrayList<Bodega>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Bodega) filtroBodega.add(((Bodega) inmueble));
                            	};
                                printBodegasTable(filtroBodega, "bodega_1");
                                break;
                            case 4:
                            	ArrayList<Casa> filtroCasas = new ArrayList<Casa>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Casa) filtroCasas.add(((Casa) inmueble));
                            	};
                                printCasasTable(filtroCasas, "casa_1");
                                break;
                            case 5:
                            	ArrayList<Apartamento> filtroApartamento = new ArrayList<Apartamento>();
                            	for(Inmueble inmueble : inmueblesCliente) {
                            		if (inmueble instanceof Apartamento) filtroApartamento.add(((Apartamento)inmueble));
                            	};
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
                    
                    printInmueblesTable(inmuebles, "inmuebles_2");
                    
                    System.out.print("Ingrese el id del inmueble: "); 
                    int idInmueble = sc.nextInt();
                    
                    inmuebleBuscado = Inmueble.buscarInmueble(idInmueble);

                    if (inmuebleBuscado == null) {
                    	System.out.println("No tiene un inmueble con esta id!\n");
                    	break;
                    }
                    
                    
                    if (Pago.verPagos(idInmueble).size() != 0) {
                    	System.out.println("El inmueble ya fue pagado, Año no puede volver a ser pagado!\n");
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
                	printPagosTable(pagosCliente,"pagos_1");

                    break;

                case 4: // finalizar contrato
                	ArrayList<Inmueble> arriendosCliente = new ArrayList<Inmueble>();
                	for (Inmueble inmueble : inmueblesCliente) {
                		if (inmueble.getTipoContrato() == TipoContrato.ARRIENDO) {
                			arriendosCliente.add(inmueble);
                		}
                	}
                	
                	printInmueblesTable(arriendosCliente, "inmuebles_1");
                	
                    System.out.print("Ingrese el id del inmueble: ");
                    int idInmueble2 = sc.nextInt();
                    
                    inmuebleBuscado = Inmueble.buscarInmueble(idInmueble2);
                    if (inmuebleBuscado == null) {
                    	System.out.println("No tiene un inmueble con esta id!\n");
                    	break;
                    }
                    
                    if (!(arriendosCliente.contains(inmuebleBuscado))) {
                    	System.out.println("Este inmueble no es arrendado!\n");
                    	break;
                    }
                    
                    cliente.finalizarContrato(inmuebleBuscado.getIdInmueble());
                    System.out.println("Contrato finalizado exitosamente !");
                    break;
                    
                case 5:
                	
                
                default:
                	System.out.println("\nADIÓS!");
                    break;
            }
        } while (opt1 != 6);
    }
}
