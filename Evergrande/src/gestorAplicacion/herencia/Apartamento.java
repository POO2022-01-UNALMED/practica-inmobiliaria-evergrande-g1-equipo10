package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Apartamento extends Inmueble{
	private static final long serialVersionUID = 1L;
	   private String nombreUnidad;
	   private int torre;
	   private int numeroApto;
	   private int numHabitaciones;
	   private int numBanos;
	   private int patio;
	   private int balcon;
	   

	    public Apartamento(double precio, String direccion, double area,String nombreUnidad, int torre, int numHabitaciones, int numBanos, int patio, int balcon, int numeroApto) {
	        super(precio, direccion, area);
	    	this.nombreUnidad = nombreUnidad;
	        this.torre = torre;
	        this.numHabitaciones = numHabitaciones;
	        this.numBanos = numBanos;
	        this.patio = patio;
	        this.balcon = balcon;
	        this.numeroApto = numeroApto;
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
	    
	    public int getNumeroApto() {
	        return numeroApto;
	    }
	    
	    public void setNumeroApto(int numeroApto) {
	        this.numeroApto = numeroApto;
	    }
	    
	    public String toString() {
	    	return  " APARTAMENTO\n" + " idInmueble: " + this.getIdInmueble() + "\n" +
	                " Precio: " + this.getPrecio() + "\n" +
	                " Direccion: " + this.getDireccion() + "\n" +
	                " �rea: '" + this.getArea() + "\n" +
	                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
	                " N�mero de pisos: " + this.getNumPisos() + "\n" +
	                " �Tiene parqueadero de carros? " + this.getParqueaderoCarros() + "\n" +
	                " �Tiene parqueadero de motos? " + this.getParqueaderoMotos() + "\n" +
	                " �Est� amueblado? " + this.getAmueblado() + "\n" +
	                " Nombre de la unidad: " + this.getNombreUnidad() + "\n"+
	                " Torre: " + this.getTorre() + "\n"+
	                " N�mero del apartaestudio: " + this.getNumeroApto() + "\n"+
	                " N�mero de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
	                " N�mero de ba�os: "+ this.getNumBanos() +
	                " N�mero de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
	                " N�mero de ba�os: "+ this.getNumBanos() + "\n"+
	                " Patio: " + this.getPatio() + "\n"+
	                " Balcon: " + this.getBalcon();
	    }
}
