package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase representa a los agentes de la inmobiliaria que son los encargados de los inmuebles, de mostrarlos y hacer todo el seguimiento con el cliente 
 */

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
	
	public String toString() {
		String leftAlignFormat = "| %-10d | %-20s | %-16d | %-13d | %-8s | %-14s |%n";
		return String.format(leftAlignFormat,
				this.cedula,
				this.nombreCompleto,
				this.telefonoCelular,
				this.telefonoFijo,
				this.vehiculo.name(),
				this.placaVehiculo
				);
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
	
	//devuelve todas las cedulas de los agentes
	public static ArrayList<Integer> idAgentes(){
		ArrayList<Integer> idAgentes = new ArrayList<Integer>();
		for (Agente agente: Agente.getAgentes()) {
			idAgentes.add(agente.getCedula());
		}
		return idAgentes;
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