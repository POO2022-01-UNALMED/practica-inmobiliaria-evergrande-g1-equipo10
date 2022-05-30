package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

/**
 * @Autores:
 * David Escobar Ruiz
 * Juli�n Orozco Vanegas
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
                " Numero del apartaestudio: " + this.getNumeroApto() + "\n"+
                " Numero de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
                " Numero de ba�os: "+ this.getNumBanos()
                ;
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
