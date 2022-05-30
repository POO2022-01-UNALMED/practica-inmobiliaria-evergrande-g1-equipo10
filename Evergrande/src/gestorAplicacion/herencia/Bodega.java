package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Bodega extends Inmueble{
	private static final long serialVersionUID = 1L;
	private int capacidad;
	private int oficina;
	private int bano;  // baÃ±o
	
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
	
    public String toString() {
    	return  " BODEGA\n" + " idInmueble: " + this.getIdInmueble() + "\n" +
                " Precio: " + this.getPrecio() + "\n" +
                " Direccion: " + this.getDireccion() + "\n" +
                " Área: " + this.getArea() + "\n" +
                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
                " Número de pisos: " + this.getNumPisos() + "\n" +
                " ¿Tiene parqueadero de carros?: " + this.getParqueaderoCarros() + "\n" +
                " ¿Tiene parqueadero de motos?: " + this.getParqueaderoMotos() + "\n" +
                " ¿Está amueblado?: " + this.getAmueblado() + "\n" +
                " Capacidad: " + this.getCapacidad() + "\n"+
                " Oficina: " + this.getOficina() + "\n"+
                " Número de baños: " + this.getbano()
                ;
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
