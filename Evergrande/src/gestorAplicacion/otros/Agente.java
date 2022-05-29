package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

public class Agente extends Persona implements Serializable{

	private static ArrayList<Agente> agentes = new ArrayList<Agente>();

	private Vehiculo vehiculo;
	private String placaVehiculo;
	
	public Agente(int cedula, String nombreCompleto, Vehiculo vehiculo, String placaVehiculo, int telefonoFijo, int telefonoCelular) {
		super(cedula, nombreCompleto, telefonoFijo, telefonoCelular);

		this.vehiculo = vehiculo;
		this.placaVehiculo = placaVehiculo;

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
}
