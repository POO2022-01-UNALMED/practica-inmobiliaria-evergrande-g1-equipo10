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
	   

	    public Apartamento(double precio, String direccion, double area,String nombreUnidad, int torre, int numHabitaciones, int numBanos, int patio, int balcon, int numeroApto) {
	        super(precio, direccion, area);
	    }
	    
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
	    	String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20s | %-7s | %-20s | %-21d | %-14d | %-6s | %-6s |%n";
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
					this.getNombreUnidad(),
					this.getTorre(),
					this.getNumApto(),
					this.getNumHabitaciones(),
					this.getNumBanos(),
					this.getPatio(),
					this.getBalcon()
					);
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
