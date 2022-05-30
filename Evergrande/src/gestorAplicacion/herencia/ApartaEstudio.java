package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase busca representar los apartaestudios que son un tipo de inmueble 
 */

public class ApartaEstudio extends Inmueble{
	private static final long serialVersionUID = 1L;
    private String nombreUnidad;
    private int torre;
    private int numeroApto;
    private int numHabitaciones;
    private int numBanos;

    public ApartaEstudio(){}

    public ApartaEstudio(double precio, String direccion, double area, String nombreUnidad, int torre, int numeroApto, int numHabitaciones, int numBanos,int idUnidadResidencia){
        super(precio, direccion, area, idUnidadResidencia);

        this.nombreUnidad = nombreUnidad;
        this.torre = torre;
        this.numeroApto = numeroApto;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public ApartaEstudio(double precio, String direccion, double area, TipoContrato tipoContrato, String nombreUnidad, int torre, int numeroApto, int numHabitaciones, int numBanos,int idUnidadResidencia){
        super(precio, direccion, area, tipoContrato, idUnidadResidencia);

        this.nombreUnidad = nombreUnidad;
        this.torre = torre;
        this.numeroApto = numeroApto;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }
    
    public String toString() {
    	String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20s | %-7s | %-20s | %-21d | %-14d |%n";
    	return String.format(leftAlignFormat, 
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
				this.getNumeroApto(),
				this.getNumHabitaciones(),
				this.getNumBanos());
    }
    
    public String getNombreUnidad() {
        return nombreUnidad;
    }
    public void setNombreUnidad(String nombreUnidad) {
        this.nombreUnidad = nombreUnidad;
    }
    public int getTorre() {
        return torre;
    }
    public void setTorre(int torre) {
        this.torre = torre;
    }
    public int getNumeroApto() {
        return numeroApto;
    }
    public void setNumeroApto(int numeroApto) {
        this.numeroApto = numeroApto;
    }
    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }
    public int getNumBanos() {
        return numBanos;
    }
    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }

    
}
