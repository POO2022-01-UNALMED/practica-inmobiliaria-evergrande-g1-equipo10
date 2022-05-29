package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Apartamento extends Inmueble{
	private static final long serialVersionUID = 1L;
	   private String nombreUnidad;
	   private int torre;
	   private int numApto;
	   private int numHabitaciones;
	   private int numBanos;
	   private int patio;
	   private int balcon;

	    public Apartamento(double precio, String direccion, double area,String nombreUnidad, int torre, int numApto,int numHabitaciones, int numBanos, int patio, int balcon) {
	        super(precio, direccion, area);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numApto = numApto;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
	    }
	    
	    public Apartamento(double precio, String direccion, double area, TipoContrato tipoContrato, String nombreUnidad, int torre,int numApto, int numHabitaciones, int numBanos, int patio, int balcon) {
	        super(precio, direccion, area, tipoContrato);
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
	                " Área: " + this.getArea() + "\n" +
	                " Número de pisos: " + this.getNumPisos() + "\n" +
	                " Tipo de contrato: " + this.getTipoContrato() + "\n"+
	                " Número de pisos: " + this.getNumPisos() + "\n" +
	                " ¿Tiene parqueadero de carros? " + this.getParqueaderoCarros() + "\n" +
	                " ¿Tiene parqueadero de motos? " + this.getParqueaderoMotos() + "\n" +
	                " ¿Está amueblado? " + this.getAmueblado() + "\n" +
	                " Nombre de la unidad: " + this.getNombreUnidad() + "\n"+
	                " Torre: " + this.getTorre() + "\n"+
	                " Número del apartaestudio: " + this.getNumApto() + "\n"+
	                " Número de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
	                " Número de baños: "+ this.getNumBanos()
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
