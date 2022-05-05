package gestorAplicación;

public class Agente {
	private int cedula;
	private String nombreCompleto;
	private Vehiculo vehiculo;
	private String placaVehiculo;
	private String telefonoFijo;
	private String telefonoCelular;
	
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
	
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
}
