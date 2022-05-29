package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class ApartaEstudio extends Inmueble{
	private static final long serialVersionUID = 1L;
    private String nombreUnidad;
    private int torre;
    private int numeroApto;
    private int numHabitaciones;
    private int numBanos;

    public ApartaEstudio(){}

    public ApartaEstudio(double precio, String direccion, double area, String nombreUnidad, int torre, int numeroApto, int numHabitaciones, int numBanos){
        super(precio, direccion, area);

        this.nombreUnidad = nombreUnidad;
        this.torre = torre;
        this.numeroApto = numeroApto;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public ApartaEstudio(double precio, String direccion, double area, TipoContrato tipoContrato, String nombreUnidad, int torre, int numeroApto, int numHabitaciones, int numBanos){
        super(precio, direccion, area, tipoContrato);

        this.nombreUnidad = nombreUnidad;
        this.torre = torre;
        this.numeroApto = numeroApto;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }
    
    public String toString() {
    	return  " idInmueble =" + this.getIdInmueble() + "\n" +
                " Precio =" + this.getPrecio() + "\n" +
                " Direccion =" + this.getDireccion() + "\n" +
                " Área ='" + this.getArea() + "\n" +
                " Número de pisos ='" + this.getNumPisos() + "\n" +
                " Tipo de contrato ='" + this.getTipoContrato() + "\n"+
                " Nombre de la unidad = " + this.getNombreUnidad() + "\n"+
                " Torre = " + this.getTorre() + "\n"+
                " Número del apartaestudio = " + this.getNumeroApto() + "\n"+
                " Número de Habitaciones = " + this.getNumHabitaciones()  + "\n"+
                " Número de baños ="+ this.getNumBanos()
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
