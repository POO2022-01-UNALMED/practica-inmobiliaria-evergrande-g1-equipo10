package gestorAplicacion.herencia;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.otros.TipoContrato;

public class Inmueble implements Serializable{
	private static int totalInmuebles;
	private static ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();

	private int idInmueble;
	private double precio;
	private String direccion;
	private double area;
	private int numPisos;
	private boolean parqueaderoCarros;
	private boolean parqueaderoMotos;
	private boolean amueblado;
	private boolean vendido;
	private TipoContrato tipoContrato;
	
	public Inmueble(){}

	public Inmueble(double precio, String direccion, double area, TipoContrato tipoContrato){
		this.precio = precio;
		this.direccion = direccion;
		this.area = area;
		this.tipoContrato = tipoContrato;

		Inmueble.totalInmuebles++;
		this.idInmueble = Inmueble.totalInmuebles;
 	}

	public Inmueble(double precio, String direccion, double area){
		this(precio, direccion, area, TipoContrato.VENTA);
	}
	
	public static void agregarInmueble(Inmueble inmueble) {
		Inmueble.inmuebles.add(inmueble);
	}
	
	public static void quitarInmueble(Inmueble inmueble) {
		Inmueble.inmuebles.remove(inmueble);
	}

	public static ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public static void setInmuebles(ArrayList<Inmueble> inmuebles) {
		Inmueble.inmuebles = inmuebles;
		Inmueble.totalInmuebles = inmuebles.size();
	}
	
	public int getIdInmueble() {
		return this.idInmueble;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public double getArea() {
		return this.area;
	}
	
	public int getNumPisos() {
		return this.numPisos;
	}
	
	public boolean getParqueaderoCarros() {
		return this.parqueaderoCarros;
	}
	
	public boolean getParqueaderoMotos() {
		return this.parqueaderoMotos;
	}
	
	public boolean getAmueblado() {
		return this.amueblado;
	}
	
	public boolean getVendido() {
		return this.vendido;
	}
	
	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setDirrecion(String direccion) {
		this.direccion = direccion;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	public void setParqueaderoCarros(boolean isParqueaderoCarros) {
		this.parqueaderoCarros = isParqueaderoCarros;
	}
	
	public void setParqueaderoMotos(boolean isParqueaderoMotos) {
		this.parqueaderoMotos = isParqueaderoMotos;
	}
	
	public void setAmueblado(boolean isAmueblado) {
		this.amueblado = isAmueblado;
	}
	
	public void setVendido(boolean isVendido) {
		this.vendido = isVendido;
	}

	public TipoContrato getTipoContrato() {
		return tipoContrato;
	}

	public void setTipoContrato(TipoContrato tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	
}
