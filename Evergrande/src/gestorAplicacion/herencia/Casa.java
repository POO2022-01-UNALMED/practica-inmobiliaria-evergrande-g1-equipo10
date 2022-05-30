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
                " Area: '" + this.getArea() + "\n" +
                " Tipo de contrato: " + this.getTipoContrato() + "\n" +
                " Numero de pisos: " + this.getNumPisos() + "\n" +
                " Tiene parqueadero de carros? " + this.getParqueaderoCarros() + "\n" +
                " Tiene parqueadero de motos? " + this.getParqueaderoMotos() + "\n" +
                " Esta amueblado? " + this.getAmueblado() + "\n" +
                " Numero de Habitaciones: " + this.getNumHabitaciones()  + "\n"+
                " Numero de baños: "+ this.getNumBanos() + "\n"+
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
