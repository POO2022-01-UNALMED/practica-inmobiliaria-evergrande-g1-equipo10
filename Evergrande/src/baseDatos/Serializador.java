package baseDatos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import gestorAplicacion.herencia.*;
import gestorAplicacion.otros.*;

public class Serializador {

    public static void main(String[] args) { // registros iniciales
        // Inmuebles del cliente (hay que crear otros que compre el cliente)
        List<Inmueble> inmuebles = new ArrayList<Inmueble>();
        inmuebles.add(new Inmueble(200000, "kra 45 # 32b", 160, TipoContrato.VENTA));
        inmuebles.add(new ApartaEstudio(200000, "kra 45 # 32b", 160, TipoContrato.VENTA, "unidad", 1, 1, 2, 1));
        inmuebles.add(new Bodega(600, "kra 45 # 32b", 160, TipoContrato.ARRIENDO, 15, 1, 1));
        inmuebles.add(new Casa(200000, "kra 45 # 32b", 160, TipoContrato.ARRIENDO, 3, 2, 1, 0));
        serializar(inmuebles, "Inmueble");

        // pagos
        List<Pago> pagos = new ArrayList<Pago>();
        pagos.add(new Pago(200000, 2020, 5, inmuebles.get(0))); // pago inmueble 1
        pagos.add(new Pago(600, 2022, 3, inmuebles.get(2))); // pago inmueble 3
        serializar(pagos, "Pago");

        // Clientes
        Cliente cliente = new Cliente(123456, "Sancho Panza", 654321, 30026456, (ArrayList<Inmueble>) inmuebles);
        serializar(new ArrayList<Cliente>(){{add(cliente);}}, "Cliente");
    }

    public static <E> void serializar(List<E> objetos, String nomClase){
        // String path = System.getProperty("user.dir") + "\\Evergrande\\src\\baseDatos\\temp\\" + nomClase + ".txt";
        String path = System.getProperty("user.dir") + "\\src\\baseDatos\\temp\\" + nomClase + ".txt";

        try {
            // borrar contenido del archivo
            PrintWriter pw = new PrintWriter(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {

            File archivo = new File(path);
			archivo.createNewFile(); // Crea un nuevo archivo si no existe

            // se crea un fileoutputstream para saber donde serializar los archivos
            FileOutputStream fileOut = new FileOutputStream(path);

            // Se crea un objeto output stream para poder escribir en el archivo
			ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // Guardamos la lista de objetos
			out.writeObject(objetos);
			out.close();
			fileOut.close();

        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
