package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Julián Orozco Vanegas
 * Juan Nicolas Piedrahita Salas
 * 
 * @Descripcion
 * Esta clase busca representar las casas que son un tipo de inmueble 
 */

public class Casa extends Inmueble {
	private static final long serialVersionUID = 1L;
    private int numHabitaciones;
    private int numBanos;
    private int patio;
    private int balcon;


    public Casa(double precio, String direccion, double area,int numHabitaciones, int numBanos, int patio, int balcon,int idUnidadResidencia) {
        super(precio, direccion, area, idUnidadResidencia);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.patio = patio;
        this.balcon = balcon;
    }

    public Casa(double precio, String direccion, double area, TipoContrato tipoContrato, int numHabitaciones, int numBanos, int patio, int balcon, int idUnidadResidencia) {
        super(precio, direccion, area, tipoContrato, idUnidadResidencia);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.patio = patio;
        this.balcon = balcon;
    }
    
    public String toString() {
    	String leftAlignFormat = "| %-4d | %-13s | %-14f | %-15s | %-6f | %-11s | %-19s | %-17s | %-20s | %-20d | %-12d | %-8d | %-6d |%n";
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
				this.getNumHabitaciones(),
				this.getNumBanos(),
				this.getPatio(),
				this.getBalcon()
				);
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
