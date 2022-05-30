package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase busca representar los apartamentos que son un tipo de inmueble que acepta la inmobiliaria
 */

public class Apartamento extends Inmueble{
	private static final long serialVersionUID = 1L;
	   private String nombreUnidad;
	   private int torre;
	   private int numApto;
	   private int numHabitaciones;
	   private int numBanos;
	   private int patio;
	   private int balcon;

	    public Apartamento(double precio, String direccion, double area,String nombreUnidad, int torre, int numApto,int numHabitaciones, int numBanos, int patio, int balcon,int idUnidadResidencia) {
	        super(precio, direccion, area, idUnidadResidencia);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numApto = numApto;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
	    }
	    
	    public Apartamento(double precio, String direccion, double area, TipoContrato tipoContrato, String nombreUnidad, int torre,int numApto, int numHabitaciones, int numBanos, int patio, int balcon,int idUnidadResidencia) {
	        super(precio, direccion, area, tipoContrato, idUnidadResidencia);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numApto = numApto;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
	    }
	    
	    public String toString() {
	    	return  " idInmueble: " + this.getIdInmueble() + "\n" +
	                " Precio: " + this.getPrecio() + "\n" +
	                " Direccion: " + this.getDireccion() + "\n" +
	                " Area: " + this.getArea() + "\n" +
	                " Numero de pisos: " + this.getNumPisos() + "\n" +
	                " Tipo de contrato: " + this.getTipoContrato() + "\n"+
	                " Numero de pisos: " + this.getNumPisos() + "\n" +
	                " Tiene parqueadero de carros? " + this.getParqueaderoCarros() + "\n" +
	                " Tiene parqueadero de motos? " + this.getParqueaderoMotos() + "\n" +
	                " Esta amueblado? " + this.getAmueblado() + "\n" +
	                " Nombre de la unidad: " + this.getNombreUnidad() + "\n"+
	                " Torre: " + this.getTorre() + "\n"+
	                " Numero del apartaestudio: " + this.getNumApto() + "\n"+
	                " Numero de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
	                " Numero de baños: "+ this.getNumBanos()
	                ;
	    }

	    public String getNombreUnidad() {
	        return this.nombreUnidad;
	    }

	    public void setNombreUnidad(String nombreUnidad) {
	        this.nombreUnidad = nombreUnidad;
	    }

	    public int getTorre() {
	        return this.torre;
	    }

	    public void setTorre(int torre) {
	        this.torre = torre;
	    }

	    public int getNumHabitaciones() {
	        return this.numHabitaciones;
	    }

	    public void setNumHabitaciones(int numHabitaciones) {
	        this.numHabitaciones = numHabitaciones;
	    }

	    public int getNumBanos() {
	        return this.numBanos;
	    }

	    public void setNumBanos(int numBanos) {
	        this.numBanos = numBanos;
	    }

	    public int getPatio() {
	        return this.patio;
	    }

	    public void setPatio(int patio) {
	        this.patio = patio;
	    }

	    public int getBalcon() {
	        return this.balcon;
	    }

	    public void setBalcon(int balcon) {
	        this.balcon = balcon;
	    }
	    
	    public int getNumApto() {
	        return this.numApto;
	    }

	    public void setNumApto(int numApto) {
	        this.numApto = numApto;
	    }

}
