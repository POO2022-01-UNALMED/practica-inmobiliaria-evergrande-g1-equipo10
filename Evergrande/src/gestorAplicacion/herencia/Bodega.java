package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Bodega extends Inmueble{
	private int capacidad;
	private int oficina;
	private int bano;  // baño
	
	public Bodega(double precio, String direccion, double area, int capacidad, int oficina, int bano) {
		super(precio, direccion, area);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.bano = bano;
	}

	public Bodega(double precio, String direccion, double area, TipoContrato tipoContrato, int capacidad, int oficina, int bano) {
		super(precio, direccion, area, tipoContrato);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.bano = bano;
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
