package uiMain;

import java.util.Scanner;

import baseDatos.Deserializador;
import gestorAplicacion.herencia.*;
import gestorAplicacion.otros.*;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        // deserializar cliente (solo un cliente ya que la app debe ser usada por un
        // solo usuario)
        Cliente cliente = Deserializador.<Cliente>deserializar("Cliente").get(0);

        // deserializar inmuebles
        Inmueble.setInmuebles(Deserializador.<Inmueble>deserializar("Inmueble"));

        short opt1 = 0;
        do {
            System.out.println("1. Ver mis inmuebles");
            System.out.println("2. Realizar pago");
            System.out.println("3. Finalizar contrato");
            System.out.println("4. salir");

            opt1 = sc.nextShort();

            switch (opt1) {
                case 1: // ver mis inmuebles

                    short opt2 = 0;
                    System.out.println("1. Ver todos mis inmuebles");
                    System.out.println("2. Ver mis apartaestudios");
                    System.out.println("3. Ver mis bodegas");
                    System.out.println("4. Ver mis casas");

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
                case 2:

                    break;
                case 3:

                    break;

                default:
                    break;
            }
        } while (opt1 != 4);

    }
}
