package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;
import gestorAplicacion.herencia.Inmueble;

public class Cliente extends Persona implements Serializable{
    private ArrayList<Inmueble> InmueblesComp = new ArrayList<Inmueble>();
    private ArrayList<Inmueble> InmueblesArri = new ArrayList<Inmueble>();

    public Cliente(){
        super();
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular){
        super(cedula, nombreCompleto, telefonofijo, telefonocelular);
    }

    public Cliente(int cedula, String nombreCompleto, int telefonofijo, int telefonocelular, ArrayList<Inmueble> InmueblesComp, ArrayList<Inmueble> InmueblesArri){
        this(cedula, nombreCompleto, telefonofijo, telefonocelular);

        this.InmueblesComp = InmueblesComp;
        this.InmueblesArri = InmueblesArri;
    }

    public void comprarInmueble(Inmueble inmueble){
        this.InmueblesComp.add(inmueble);   
    }

    public ArrayList<Inmueble> listarInmuebles(){
        ArrayList<Inmueble> r = new ArrayList<Inmueble>();

        for (Inmueble inmueble : this.InmueblesArri) {
            r.add(inmueble);
        }
        for (Inmueble inmueble : this.InmueblesComp) {
            r.add(inmueble);
        }

        return r;
    }

    public Cita pedirCita(int ano, int mes, int dia, String hora){
       return new Cita(ano, mes, dia, hora);
    }

    public void cancelarCita(Cita cita){
        Cita.cancelar(cita);
    }

    public void iniciarContrato(Inmueble inmueble){
        this.InmueblesArri.add(inmueble);
    }

    public boolean finalizarContrato(Inmueble inmueble){
        return this.InmueblesArri.remove(inmueble);
    }

    public Pago realizarPago(double valor, int ano, int mes, Inmueble inmueble){
        return new Pago(valor, ano, mes, inmueble, this);
    }
}