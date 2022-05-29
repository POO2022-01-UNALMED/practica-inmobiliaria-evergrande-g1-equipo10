package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Apartamento extends Inmueble{
	private static final long serialVersionUID = 1L;
	   private String nombreUnidad;
	   private int torre;
	   private int numHabitaciones;
	   private int numBanos;
	   private int patio;
	   private int balcon;

	    public Apartamento(double precio, String direccion, double area,String nombreUnidad, int torre, int numHabitaciones, int numBanos, int patio, int balcon) {
	        super(precio, direccion, area);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
	    }
	    
	    public Apartamento(double precio, String direccion, double area, TipoContrato tipoContrato, String nombreUnidad, int torre, int numHabitaciones, int numBanos, int patio, int balcon) {
	        super(precio, direccion, area, tipoContrato);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
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

}
