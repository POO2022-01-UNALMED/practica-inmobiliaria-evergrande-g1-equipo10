package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase busca representar las bodegas que son un tipo de inmueble 
 */

public class Bodega extends Inmueble{
	private static final long serialVersionUID = 1L;
	private int capacidad;
	private int oficina;
	private int bano;  // baÃ±o
	
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
    	return  " BODEGA\n" + " idInmueble: " + this.getIdInmueble() + "\n" +
                " Precio: " + this.getPrecio() + "\n" +
                " Direccion: " + this.getDireccion() + "\n" +
                " Area: " + this.getArea() + "\n" +
                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
                " Número de pisos: " + this.getNumPisos() + "\n" +
                " ¿Tiene parqueadero de carros?: " + this.getParqueaderoCarros() + "\n" +
                " ¿Tiene parqueadero de motos?: " + this.getParqueaderoMotos() + "\n" +
                " ¿Está amueblado?: " + this.getAmueblado() + "\n" +

                " Capacidad: " + this.getCapacidad() + "\n"+
                " Oficina: " + this.getOficina() + "\n"+
                " Numero de baños: " + this.getbano()
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
