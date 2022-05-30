package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.herencia.Inmueble;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase se podria decir que es la principal, ya que representa al cliente, quien es, el sujeto al cual esta dirigida
 * 
 * @Estructuras_relevantes
 * inmuebles corresponde a la lista de los inmuebles que el cliente ya tiene en posesion suya 
 * 
 */

public class Cliente extends Persona implements Serializable{
    private ArrayList<Integer> inmuebles = new ArrayList<Integer>();
	private static final long serialVersionUID = 1L;

    public Cliente(){
        super();
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular){
        super(cedula, nombreCompleto, telefonofijo, telefonocelular);
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular, ArrayList<Integer> inmuebles){
        this(cedula, nombreCompleto, telefonofijo, telefonocelular);

        this.inmuebles = inmuebles;
    }

    public void comprarInmueble(int idInmueble){
        if(Inmueble.buscarInmueble(idInmueble).getTipoContrato() == TipoContrato.VENTA){
            this.inmuebles.add(idInmueble);   
        }
    }

    public ArrayList<Integer> listarInmuebles(){
        return this.inmuebles;
    }

    public Cita pedirCita(int ano, int mes, int dia, String hora, int idAgente, int idInmueble){
       return new Cita(ano, mes, dia, hora, idAgente, idInmueble);
    }

    public void cancelarCita(Cita cita){
        Cita.cancelar(cita);
    }

    public void iniciarContrato(int idInmueble){
        if(Inmueble.buscarInmueble(idInmueble).getTipoContrato() == TipoContrato.ARRIENDO){
            this.inmuebles.add(idInmueble);
        }
    }

    public void finalizarContrato(int idInmueble){
        if(Inmueble.buscarInmueble(idInmueble).getTipoContrato() == TipoContrato.ARRIENDO){
            for (int i = 0; i < this.inmuebles.size(); i++) {
                if (this.inmuebles.get(i) == idInmueble) {
                    this.inmuebles.remove(i);
                    break;
                }
            }
        }
    }

    public Pago realizarPago(double valor, int ano, int mes, int idInmueble){
        return new Pago(valor, ano, mes, idInmueble);
    }
}