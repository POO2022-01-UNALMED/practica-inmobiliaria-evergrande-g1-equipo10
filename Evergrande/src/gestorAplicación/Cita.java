package gestorAplicación;

public class Cita {
	private static int idCitas = 0;
	private int idCita;
	private int dia;
	private int mes;
	private int ano;
	private String hora;
	
	public Cita(int ano, int mes, int dia, String hora) {
		this.ano = ano;
		this.mes = mes;
		this.dia = dia;
		this.hora = hora;
		this.idCita = Cita.idCitas;
		Cita.idCitas++;
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
}


