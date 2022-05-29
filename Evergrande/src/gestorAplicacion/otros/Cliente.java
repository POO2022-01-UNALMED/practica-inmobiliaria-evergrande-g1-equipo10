package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.herencia.Inmueble;

public class Cliente extends Persona implements Serializable{
    private ArrayList<Inmueble> Inmuebles= new ArrayList<Inmueble>();

    public Cliente(){
        super();
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular){
        super(cedula, nombreCompleto, telefonofijo, telefonocelular);
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular, ArrayList<Inmueble> Inmuebles){
        this(cedula, nombreCompleto, telefonofijo, telefonocelular);

        this.Inmuebles = Inmuebles;
    }

    public void comprarInmueble(Inmueble inmueble){
        if(inmueble.getTipoContrato() == TipoContrato.VENTA){
            this.Inmuebles.add(inmueble);   
        }
    }

    public ArrayList<Inmueble> listarInmuebles(){
        return this.Inmuebles;
    }

    public Cita pedirCita(int ano, int mes, int dia, String hora){
       return new Cita(ano, mes, dia, hora);
    }

    public void cancelarCita(Cita cita){
        Cita.cancelar(cita);
    }

    public void iniciarContrato(Inmueble inmueble){
        if(inmueble.getTipoContrato() == TipoContrato.ARRIENDO){
            this.Inmuebles.add(inmueble);
        }
    }

    public boolean finalizarContrato(Inmueble inmueble){
        if(inmueble.getTipoContrato() == TipoContrato.ARRIENDO){
            return this.Inmuebles.remove(inmueble);
        }else{
            return false;
        }
    }

    public Pago realizarPago(double valor, int ano, int mes, Inmueble inmueble){
        return new Pago(valor, ano, mes, inmueble);
    }
}