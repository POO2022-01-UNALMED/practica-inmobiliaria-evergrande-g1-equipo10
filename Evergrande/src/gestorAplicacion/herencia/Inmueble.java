package gestorAplicacion.herencia;

import java.io.Serializable;
import java.util.ArrayList;

import gestorAplicacion.otros.TipoContrato;


/**
 * @Autores
 * David Escobar Ruiz
 * Juli?n Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase representa todos los inmuebles en general, tanto los propios del cliente como los que ofrece la inmobiliaria para la venta o arrendamiento 
 */

public class Inmueble implements Serializable{
	private static final long serialVersionUID = 1L;
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
	private boolean arrendado;
	private TipoContrato tipoContrato;
	private int idUnidadResidencial;
	
	public Inmueble(){}

	public Inmueble(double precio, String direccion, double area) {
		this.precio = precio;
		this.direccion = direccion;
		this.area = area;
	}
	
	public Inmueble(double precio, String direccion, double area, TipoContrato tipoContrato,int idUnidadResidencia){
		this.numPisos = 1;
		this.parqueaderoCarros = true;
		this.parqueaderoMotos = false;
		this.amueblado = false;
		this.precio = precio;
		this.direccion = direccion;
		this.area = area;
		this.tipoContrato = tipoContrato;
		this.idUnidadResidencial = idUnidadResidencia;

		Inmueble.totalInmuebles++;
		this.idInmueble = Inmueble.totalInmuebles;
		agregarInmueble(this);
 	}

	public Inmueble(double precio, String direccion, double area,int idUnidadResidencia){
		this(precio, direccion, area, TipoContrato.VENTA,idUnidadResidencia);
	}
	
	public static void agregarInmueble(Inmueble inmueble) {
		Inmueble.inmuebles.add(inmueble);
	}

	public static ArrayList<Inmueble> getInmuebles() {
		return inmuebles;
	}

	public static void setInmuebles(ArrayList<Inmueble> inmuebles) {
		Inmueble.inmuebles = inmuebles;
		Inmueble.totalInmuebles = inmuebles.size();
	}

	// metodo para buscar inmuebles por id
	public static Inmueble buscarInmueble(int id){
		Inmueble r = null;
		for (Inmueble inmueble : inmuebles) {
			if(inmueble.getIdInmueble() == id){
				r = inmueble;
				break;
			}
		}

		return r;
	}
	
	// metodo para buscar inmuebles por id (devuelve todos los ids que coincidan)
	public static ArrayList<Inmueble> buscarInmueble(ArrayList<Integer> ids){
		ArrayList<Inmueble> r = new ArrayList<Inmueble>();

		for (int id : ids) {
			for (Inmueble inmueble : Inmueble.inmuebles) {
				
				if(inmueble.getIdInmueble() == id){
					r.add(inmueble);
					break;
				}

			}
		}

		return r;
	}
	
	public int getIdInmueble() {
		return this.idInmueble;
	}

	public void setIdInmueble(int idInmueble) {
		this.idInmueble = idInmueble;
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
	
	public boolean getArrendado() {
		return this.arrendado;
	}
	
	public void setArrendado(boolean arrendado) {
		this.arrendado = arrendado;
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
	
	public String toString() {
		String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-9f | %-11s | %-19s | %-17s | %-20s |%n";
		return  String.format(leftAlignFormat, 
				this.getIdInmueble(),
				this.getClass().getSimpleName(),
				this.getPrecio(), 
				this.getTipoContrato().name(),
				this.getArea(),
				this.getAmueblado(),
				this.getParqueaderoCarros(),
				this.getParqueaderoMotos(),
				this.getDireccion()
				);
	};
    public int getIdUnidadResidencial() {
        return this.idUnidadResidencial;
    }

    public void setIdUnidadResidencial(int idUnidadResidencial) {
        this.idUnidadResidencial = idUnidadResidencial;
    }
	
}
