package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Bodega extends Inmueble{
	private static final long serialVersionUID = 1L;
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
	
    public String toString() {
    	return  " BODEGA\n" + " idInmueble: " + this.getIdInmueble() + "\n" +
                " Precio: " + this.getPrecio() + "\n" +
                " Direccion: " + this.getDireccion() + "\n" +
                " �rea: " + this.getArea() + "\n" +
                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
                " N�mero de pisos: " + this.getNumPisos() + "\n" +
                " �Tiene parqueadero de carros?: " + this.getParqueaderoCarros() + "\n" +
                " �Tiene parqueadero de motos?: " + this.getParqueaderoMotos() + "\n" +
                " �Est� amueblado?: " + this.getAmueblado() + "\n" +
                " Capacidad: " + this.getCapacidad() + "\n"+
                " Oficina: " + this.getOficina() + "\n"+
                " N�mero de ba�os: " + this.getbano()
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
