package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Juli·n Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase busca representar las bodegas que son un tipo de inmueble 
 */

public class Bodega extends Inmueble{
	private static final long serialVersionUID = 1L;
	private int capacidad;
	private int oficina;
	private int bano;  // ba√±o
	
	public Bodega(double precio, String direccion, double area, int capacidad, int oficina, int bano,int idUnidadResidencia) {
		super(precio, direccion, area, idUnidadResidencia);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.bano = bano;
	}

	public Bodega(double precio, String direccion, double area, TipoContrato tipoContrato, int capacidad, int oficina, int bano,int idUnidadResidencia) {
		super(precio, direccion, area, tipoContrato, idUnidadResidencia);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.bano = bano;
	}
	
    public String toString() {
    	String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-9d | %-8d | %-7d |%n";
    	return  String.format(leftAlignFormat, 
							this.getIdInmueble(),
							this.getClass().getSimpleName(),
							this.getPrecio(), 
							this.getTipoContrato().name(),
							this.getArea(),
							this.getAmueblado(),
							this.getParqueaderoCarros(),
							this.getParqueaderoMotos(),
							this.getDireccion(),
							this.getCapacidad(),
							this.getOficina(),
							this.getbano()
							);
    }
	
	public int getCapacidad() {
		return capacidad;
	}
	
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getOficina() {
		return oficina;
	}
	
	public void setOficina(int oficina) {
		this.oficina = oficina;
	}
	
	public int getbano() {
		return bano;
	}
	
	public void setbano(int bano) {
		this.bano = bano;
	}
}
