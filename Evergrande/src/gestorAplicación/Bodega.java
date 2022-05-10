
public class Bodega extends Inmueble{
	private int capacidad;
	private int oficina;
	private int baño;
	
	public Bodega(double precio, String direccion, double area, int capacidad, int oficina, int baño) {
		super(precio, direccion, area);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.baño = baño;
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
	
	public int getBaño() {
		return baño;
	}
	
	public void setBaño(int baño) {
		this.baño = baño;
	}
}
