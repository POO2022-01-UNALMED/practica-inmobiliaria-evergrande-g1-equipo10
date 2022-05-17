package baseDatos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserializador{

    public static <E> ArrayList<E> deserializar(String nomClase){
        ArrayList<E> objetos = null;

        // String path = System.getProperty("user.dir") + "\\Evergrande\\src\\baseDatos\\temp\\" + nomClase + ".txt";
        String path = System.getProperty("user.dir") + "\\src\\baseDatos\\temp\\" + nomClase + ".txt";

        try {
            
            // usamos un FileInputStream para poder saber de donde cargar el archivo
			FileInputStream fileIn = new FileInputStream(path);

            // Si el archivo esta vacio se lanza un throw EOFException y se muestra como un
			// mensaje de vacio, pero si no se usa el objeto in para leer el archivo
			ObjectInputStream in = new ObjectInputStream(fileIn);

            objetos = (ArrayList<E>) in.readObject();

            in.close();
			fileIn.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Esta vacio");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

        return objetos;
    }
}
