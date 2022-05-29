package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.herencia.Inmueble;

public class Cliente extends Persona implements Serializable{
    private ArrayList<Integer> inmuebles = new ArrayList<Integer>();

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
             this.inmuebles.remove(idInmueble);
        }
    }

    public Pago realizarPago(double valor, int ano, int mes, int idInmueble){
        return new Pago(valor, ano, mes, idInmueble);
    }
}