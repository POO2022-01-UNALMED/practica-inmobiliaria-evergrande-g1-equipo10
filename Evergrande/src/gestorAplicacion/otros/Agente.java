package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

public class Agente extends Persona implements Serializable{
	private static final long serialVersionUID = 1L;
	private static ArrayList<Agente> agentes = new ArrayList<Agente>();
	
	private ArrayList<Integer> idInmuebles = new ArrayList<Integer>();
	private Vehiculo vehiculo;
	private String placaVehiculo;
	
	public Agente(int cedula, String nombreCompleto, Vehiculo vehiculo, String placaVehiculo, int telefonoFijo, int telefonoCelular, ArrayList<Integer> idInmuebles) {
		super(cedula, nombreCompleto, telefonoFijo, telefonoCelular);

		this.vehiculo = vehiculo;
		this.placaVehiculo = placaVehiculo;
		this.idInmuebles = idInmuebles;

		Agente.agentes.add(this);
	}

	public Agente buscarAgente(int cedula){
		Agente r = null;
		for (Agente agente : agentes) {
			if(agente.getCedula() == cedula){
				r = agente;
			}
		}

		return r;
	}

	public ArrayList<Integer> listarInmuebles() {
		return null;
	}

	
	public int getCedula() {
		return cedula;
	}
	
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	public String nombreCompleto() {
		return nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	
	public Vehiculo getvehiculo() {
		return vehiculo;
	}
	
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getPlacaVehiculo() {
		return placaVehiculo;
	}
	
	public void setPlacaVehiculo(String placa) {
		this.placaVehiculo = placa;
	}
	
	public int getTelefonoFijo() {
		return telefonoFijo;
	}
	
	public void setTelefonoFijo(int telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	
	public int getTelefonoCelular() {
		return telefonoCelular;
	}
	
	public void setTelefonoCelular(int telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	
    public ArrayList<Integer> getIdInmuebles() {
        return this.idInmuebles;
    }

    public void setIdInmuebles(ArrayList<Integer> idInmuebles) {
        this.idInmuebles = idInmuebles;
    }
    
    public static ArrayList<Agente> getAgentes() {
        return Agente.agentes;
    }

    public static void setAgentes(ArrayList<Agente> agentes) {
        Agente.agentes = agentes;
    }
}
