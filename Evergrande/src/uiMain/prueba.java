package uiMain;

import java.util.Scanner;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.*;
import gestorAplicacion.otros.*;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // deserializar cliente (solo un cliente ya que la app debe ser usada por un solo usuario)
        Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar pagos
        Pago.setPagos(Deserializador.<Pago>deserializar("Pago"));

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));

        short opt1 = 0;
        do {
            System.out.println("1. Ver mis inmuebles");
            System.out.println("2. Realizar pago");
            System.out.println("3. Ver mis pagos");
            System.out.println("4. Finalizar contrato");
            System.out.println("5. salir");
            
            System.out.print("Seleccione su opcion: ");
            opt1 = sc.nextShort();

            switch (opt1) {
                case 1: // ver mis inmuebles

                    short opt2 = 0;
                    System.out.println("1. Ver todos mis inmuebles");
                    System.out.println("2. Ver mis apartaestudios");
                    System.out.println("3. Ver mis bodegas");
                    System.out.println("4. Ver mis casas");

                    System.out.print("Seleccione su opcion: ");
                    opt2 = sc.nextShort();
                    for (Inmueble inmueble : cliente.listarInmuebles()) {
                        switch (opt2) {
                            case 1:
                                System.out.println(inmueble.getIdInmueble());
                                break;
                            case 2:
                                if (inmueble instanceof ApartaEstudio) {
                                    System.out.println(inmueble.getIdInmueble());
                                }
                                break;
                            case 3:
                                if (inmueble instanceof Bodega) {
                                    System.out.println(inmueble.getIdInmueble());
                                }
                                break;
                            case 4:
                                if (inmueble instanceof Casa) {
                                    System.out.println(inmueble.getIdInmueble());
                                }
                                break;
                            default:
                                break;
                        }
                    }

                    break;
                case 2: // realizar pago
                    Boolean puedePagarse = true;    

                    System.out.print("Ingrese el id del inmueble: ");
                    int idInmueble = sc.nextInt();
                    Inmueble inmueble = null;
                    for (Inmueble inmueblefiltrar : cliente.listarInmuebles()) {
                        if (inmueblefiltrar.getIdInmueble() == idInmueble) {
                            inmueble = inmueblefiltrar;

                            // verificar si el inmueble es de venta y ya tiene un pago
                            if(inmueblefiltrar.getTipoContrato() == TipoContrato.VENTA){
                                if (Pago.verPagos(inmueblefiltrar).size() != 0) {
                                    puedePagarse = false;
                                    System.out.println("El inmueble ya fue pagado, ¡no puede volver a ser pagado!");
                                }
                            }
                            break;
                        }
                    }

                    if (puedePagarse) {  
                        System.out.print("Ingrese el valor del pago: ");
                        double valor = sc.nextDouble();

                        System.out.print("Ingrese el año del pago: ");
                        int ano = sc.nextInt();

                        System.out.print("Ingrese el mes del pago: ");
                        int mes = sc.nextInt();

                        cliente.realizarPago(valor, ano, mes, inmueble);

                        System.out.println("Pago realizado con exito !!");
                    }

                    break;
                case 3: // ver mis pagos

                    for (Pago pago : Pago.verPagos()) {
                        System.out.println(pago.getIdPago());
                    }

                    break;

                case 4: // finalizar contrato

                    System.out.print("Ingrese el id del inmueble: ");
                    int idInmueble2 = sc.nextInt();

                    for (Inmueble inmuebleFiltar : Inmueble.getInmuebles()) {
                        if (inmuebleFiltar.getIdInmueble() == idInmueble2) {
                            if (inmuebleFiltar.getTipoContrato() == TipoContrato.ARRIENDO) {
                                
                                cliente.finalizarContrato(inmuebleFiltar);
                                System.out.println("Contrato finalizado exitosamente !");

                            }else{
                                System.out.println("No se puede cancelar el contrato del inmueble porque este no es arrendado");
                            }

                            break;
                        }
                    }

                    break;

                default:
                    break;
            }
        } while (opt1 != 5);

        sc.close();
    }
}
