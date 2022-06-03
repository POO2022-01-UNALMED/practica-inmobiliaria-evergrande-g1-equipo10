package gestorAplicacion.otros;

import java.io.Serializable;
import java.util.ArrayList;

// import gestorAplicacion.herencia.Inmueble;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Cita representan las citas en las cuales cliente y agente se reunen para ver un inmueble del interes del cliente
 */

public class Cita implements Serializable{
	private static final long serialVersionUID = 1L;
	private static int idCitas = 0;
	private int idCita;
	private int dia;
	private int mes;
	private int ano;
	private String hora;
	private int idAgente;
	private int idInmueble;

	private static ArrayList<Cita> citas = new ArrayList<Cita>();
	
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
		if (!(Cita.getCitaByID(idCita) == null)) {
			Cita.citas.remove(idCita);
		}
		System.out.println("Cita con id "+ idCita + " cancelada exitosamente!");
	}
	
	public static void setCitas(ArrayList<Cita> citas) {
		Cita.citas = citas;
	}
	
	public static ArrayList<Cita> getCitas() {
		return Cita.citas;
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
		String leftAlignFormat = "| %-7d | %-3d | %-3d | %-3d | %-4s | %-13s |%n";
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
	
	public static Cita getCitaByID(int id) {
		Cita resultado = null;
		for (Cita cita : Cita.citas) {
			if (cita.getIdCita() == id) {
				resultado = cita;
				break;
			}
		}
		return resultado;
	}
}


