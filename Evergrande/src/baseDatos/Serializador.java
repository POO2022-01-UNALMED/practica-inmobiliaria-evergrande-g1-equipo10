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
        Inmueble inmuebleCliente = new Inmueble(200000, "kra 45 # 32b", 160, TipoContrato.VENTA,007);
        inmuebleCliente.setVendido(true);
        inmuebles.add(inmuebleCliente);
        
        ApartaEstudio apartaestudioCliente = new ApartaEstudio(200000, "kra 45 # 32b", 160, TipoContrato.VENTA, "unidad", 1, 1, 2, 1,007);
        apartaestudioCliente.setVendido(true);
        inmuebles.add(apartaestudioCliente);
        
        Bodega bodegaCliente = new Bodega(600, "kra 45 # 32b", 160, TipoContrato.ARRIENDO, 15, 1, 1,007);
        bodegaCliente.setArrendado(true);
        inmuebles.add(bodegaCliente);
        
        Casa casaCliente = new Casa(200000, "kra 45 # 32b", 160, TipoContrato.ARRIENDO, 3, 2, 1, 0,007);
        casaCliente.setArrendado(true);
        inmuebles.add(casaCliente);
        
        // Inmuebles que NO son del cliente
        inmuebles.add(new Casa(40000, "calle 2a # 3b", 160, TipoContrato.VENTA, 3, 2, 1, 0,860));
        inmuebles.add(new ApartaEstudio(80000, "calle 2a # 3b", 50, TipoContrato.VENTA, "unidad 2", 1, 2, 3, 2,860));
        inmuebles.add(new Bodega(6000, "kra 45 # 32b", 20, TipoContrato.ARRIENDO, 15, 1, 0,007));
        inmuebles.add(new Apartamento(65000, "kra 45 # 32b", 96, TipoContrato.ARRIENDO, "unidad", 5, 201,4,2,1,0,007));
        inmuebles.add(new Casa(100000, "calle 2a # 3b", 200, TipoContrato.VENTA, 5, 4, 2, 3,860));
        inmuebles.add(new ApartaEstudio(30000, "kra 45 # 32b", 40, TipoContrato.ARRIENDO, "unidad 2", 4, 101, 2, 1,860));
        inmuebles.add(new Bodega(10000, "kra 45 # 32b", 400, TipoContrato.ARRIENDO, 35, 5, 2,007));
        serializar(inmuebles, "Inmueble");

        // pagos
        List<Pago> pagos = new ArrayList<Pago>();
        pagos.add(new Pago(200000, 2020, 5, 1)); // pago inmueble 1
        pagos.add(new Pago(600, 2022, 3, 3)); // pago inmueble 3
        serializar(pagos, "Pago");

        // Clientes
        Cliente cliente = new Cliente(123456, "Sancho Panza", 654321, 30026456, new ArrayList<Integer>(){{add(1);add(2);add(3);add(4);}}, new ArrayList<Integer>() {{add(0); add(1); add(2);}});
        serializar(new ArrayList<Cliente>(){{add(cliente);}}, "Cliente");
        

        //Agentes
        List<Agente> agentes = new ArrayList<Agente>();
        agentes.add(new Agente(123,"Andr�s Orrego", Vehiculo.CARRO, "ABC 555", 777598, 001650236, new ArrayList<Integer>(){{add(5);add(6);}}));
        agentes.add(new Agente(889,"Carla Cordoba", Vehiculo.MOTO, "WHJ 56B", 520469, 132954720, new ArrayList<Integer>(){{add(7);}}));
        serializar(agentes,"Agente");
        
        //Unidades
        List<UnidadResidencial> unidades = new ArrayList<UnidadResidencial>();
        unidades.add(new UnidadCerrada(007, "unidad", "San Germ�n", 6));
        unidades.add(new EdificioDeApartamentos(860, "unidad 2", "Laureles", 16));
        serializar(unidades, "UnidadResidencial");
        
        //Citas
        List<Cita> citas = new ArrayList<Cita>();
        citas.add(new Cita(2022,8,30, "6:30", 123, 6));
        citas.add(new Cita(2022,10,3, "8:00", 889, 7));
        citas.add(new Cita(2022,6,3, "16:00", 123, 8));
        serializar(citas, "Citas");
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
