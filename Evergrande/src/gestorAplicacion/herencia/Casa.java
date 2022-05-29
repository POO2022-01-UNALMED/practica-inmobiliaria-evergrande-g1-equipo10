package gestorAplicacion.herencia;

import gestorAplicacion.otros.TipoContrato;

public class Casa extends Inmueble {
	private static final long serialVersionUID = 1L;
    private int numHabitaciones;
    private int numBanos;
    private int patio;
    private int balcon;


    public Casa(double precio, String direccion, double area,int numHabitaciones, int numBanos, int patio, int balcon) {
        super(precio, direccion, area);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.patio = patio;
        this.balcon = balcon;
    }

    public Casa(double precio, String direccion, double area, TipoContrato tipoContrato, int numHabitaciones, int numBanos, int patio, int balcon) {
        super(precio, direccion, area, tipoContrato);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.patio = patio;
        this.balcon = balcon;
    }
    
    public String toString() {
    	return  " idInmueble: " + this.getIdInmueble() + "\n" +
                " Precio: " + this.getPrecio() + "\n" +
                " Direccion: " + this.getDireccion() + "\n" +
                " Área: '" + this.getArea() + "\n" +
                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
                " Número de pisos: " + this.getNumPisos() + "\n" +
                " ¿Tiene parqueadero de carros? " + this.getParqueaderoCarros() + "\n" +
                " ¿Tiene parqueadero de motos? " + this.getParqueaderoMotos() + "\n" +
                " ¿Está amueblado? " + this.getAmueblado() + "\n" +
                " Número de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
                " Número de baños: "+ this.getNumBanos() + "\n"+
                " Patio: " + this.getPatio() + "\n"+
                " Balcon: " + this.getBalcon()
                ;
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
