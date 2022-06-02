package gestorAplicacion.otros;

import java.util.ArrayList;

import gestorAplicacion.herencia.Inmueble;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Cita representan las citas en las cuales cliente y agente se reunen para ver un inmueble del interes del cliente
 */

public class Cita {
	private static int idCitas = 0;
	private int idCita;
	private int dia;
	private int mes;
	private int ano;
	private String hora;
	private int idAgente;
	private int idInmueble;

	public static ArrayList<Cita> citas = new ArrayList<Cita>();
	
	public Cita(int ano, int mes, int dia, String hora, int idAgente, int idInmueble) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.idCita = Cita.idCitas;
		this.idAgente = idAgente;
		this.idInmueble = idInmueble;
		Cita.idCitas++;
		Cita.citas.add(this);
	}
	
	public static void cancelar(int idCita) {
		for (Cita cita: citas) {
			if(cita.getIdCita() == idCita) {
				Cita.citas.remove(idCita);
			}
		}
	}
	
	public int getIdCita() {
		return idCita;
	}
	
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getHora() {
		return hora;
	}
	
	public void setHora(String hora) {
		this.hora = hora;
	}

	public int getIdAgente() {
		return idAgente;
	}

	public void setIdAgente(int idAgente) {
		this.idAgente = idAgente;
	}

	public int getIdInmueble() {
		return idInmueble;
	}

	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	
	public String toString() {
		String leftAlignFormat = "| %-4d | %-5d | %-5d | %-5d | %-6d | %-4d |%n";
		String nombreAgente = null;
		for (Agente agente : Agente.getAgentes()) {
			if (agente.getCedula() == this.getIdAgente()) {
				nombreAgente = agente.getNombreCompleto();
				break;
			}
		}
		
		return String.format(leftAlignFormat,
				this.getIdCita(),
				this.getDia(),
				this.getMes(),
				this.getAno(),
				this.getHora(),
				nombreAgente
				);
	}
}


