
public class Bodega extends Inmueble{
	private int capacidad;
	private int oficina;
	private int ba�o;
	
	public Bodega(double precio, String direccion, double area, int capacidad, int oficina, int ba�o) {
		super(precio, direccion, area);
		this.capacidad = capacidad;
		this.oficina = oficina;
		this.ba�o = ba�o;
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
	
	public int getBa�o() {
		return ba�o;
	}
	
	public void setBa�o(int ba�o) {
		this.ba�o = ba�o;
	}
}
